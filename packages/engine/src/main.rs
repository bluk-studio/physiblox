use rapier3d::prelude::*;
use tiny_http::{Server, Response};

fn main() {
    let mut rigid_body_set = RigidBodySet::new();
    let mut collider_set = ColliderSet::new();

    /* Create the ground. */
    let collider = ColliderBuilder::cuboid(100.0, 0.1, 100.0).build();
    collider_set.insert(collider);

    /* Create the bounding ball. */
    let rigid_body = RigidBodyBuilder::dynamic()
        // Начальная позиция (~2.5 блока в высоту)
        .translation(vector![0.0, 2.5, 0.0])
        // Вектор по которому мы пульнём этот шарик
        .linvel(vector![2.5, 12.5, 6.0])
        .build();
    let collider = ColliderBuilder::ball(1.0).restitution(0.7).build();
    let cube_body_handle = rigid_body_set.insert(rigid_body);
    collider_set.insert_with_parent(collider, cube_body_handle, &mut rigid_body_set);

    /* Create other structures necessary for the simulation. */
    let gravity = vector![0.0, -9.81, 0.0];
    let integration_parameters = IntegrationParameters::default();
    let mut physics_pipeline = PhysicsPipeline::new();
    let mut island_manager = IslandManager::new();
    let mut broad_phase = BroadPhase::new();
    let mut narrow_phase = NarrowPhase::new();
    let mut impulse_joint_set = ImpulseJointSet::new();
    let mut multibody_joint_set = MultibodyJointSet::new();
    let mut ccd_solver = CCDSolver::new();
    let physics_hooks = ();
    let event_handler = ();

    /* Run the game loop, stepping the simulation once per frame. */
    //   for _ in 0..100 {
    //     physics_pipeline.step(
    //       &gravity,
    //       &integration_parameters,
    //       &mut island_manager,
    //       &mut broad_phase,
    //       &mut narrow_phase,
    //       &mut rigid_body_set,
    //       &mut collider_set,
    //       &mut impulse_joint_set,
    //       &mut multibody_joint_set,
    //       &mut ccd_solver,
    //       Option::None,
    //       &physics_hooks,
    //       &event_handler,
    //     );

    //     let ball_body = &rigid_body_set[ball_body_handle];
    //     println!(
    //       "Ball altitude: {:?}",
    //       ball_body.translation()
    //     );
    //   }

    // Starting dev server
    let server = Server::http("0.0.0.0:8000").unwrap();
    println!("Server started at http://localhost:8000");

    for request in server.incoming_requests() {
        for _ in 1..5 {
            physics_pipeline.step(
                &gravity,
                &integration_parameters,
                &mut island_manager,
                &mut broad_phase,
                &mut narrow_phase,
                &mut rigid_body_set,
                &mut collider_set,
                &mut impulse_joint_set,
                &mut multibody_joint_set,
                &mut ccd_solver,
                Option::None,
                &physics_hooks,
                &event_handler,
            );
        }

        // Getting cube rigidbody and returning it
        let cube_body = &rigid_body_set[cube_body_handle];

        let response = Response::from_string(format!("{:?}", cube_body.translation()));
        request.respond(response);
    }
}