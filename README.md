# Physiblox

This repository contains all source code for PhysiBlox Minecraft plugin. This plugin's main goal is to bring real-world physics to vanilla minecraft using texture packs, custom models and popular game physics engine named [Rapier](https://www.rapier.rs/). In theory, this plugin have two sides - **engine** and **runtime**. Engine is a binary written in Rust, that exposes Rapier APIs using gRPC server. Runtime *(in this case, runtime-java for spigot plugins)* uses gRPC client to commuticate to physics engine and to send game data to it. Engine then sends information about physical objects *(and their behavior)* to server, which then - using texture packs and armor stands - animates them to all players.

# Todo

- [ ] Complete **SimulationSession** and **SimulationRuntime** RPC services.
- [ ] Implement RPC services in engine package
- [ ] Add plugin configuration
  - [ ] Field "engine-url" to specify self-hosted or cloud-hosted engine API url
- [ ] Implement "physic cubes" idea in plugin
  > In brief, "physic cubes" is admin-defined cuboid regions where physics simulation will run. So, this plugin will not be able to simulate physics in whole minecraft world *(for now, at least)*
  - [ ] Add command to create physic cubes
  - [ ] Command: list physic cubes
  - [ ] Command: modify physic cubes
    - [ ] Modificator: gravity
  - [ ] Command: delete physic cubes

> That's enough to start with, I think.
