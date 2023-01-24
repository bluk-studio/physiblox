package org.bluk.physiblox.services;

import lombok.Getter;

public class ServicesContainer {
    public final SimulationSessionClient sessions;

    public ServicesContainer() {
        // todo
        // Getting configuration from plugin
        sessions = new SimulationSessionClient("localhost", 8000);
    };
}
