package org.bluk.physiblox.services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.Getter;
import org.bluk.physiblox.Environment;
import org.bluk.physiblox.Plugin;
import org.bluk.physiblox.protos.SimulationSessionGrpc;

public class SimulationSessionClient {
    @Getter
    private final ManagedChannel channel;
    @Getter
    private final SimulationSessionGrpc.SimulationSessionBlockingStub blockingStub;

    public SimulationSessionClient(String host, int port) {
        ManagedChannelBuilder<?> builder = ManagedChannelBuilder.forAddress(host, port);

        if (Plugin.getEnvironment() == Environment.DEVELOPMENT) {
            builder.usePlaintext();
        }

        channel = builder.build();
        blockingStub = SimulationSessionGrpc.newBlockingStub(channel);
    }
}
