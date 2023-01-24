package org.bluk.physiblox;

import org.bluk.physiblox.services.ServicesContainer;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;

public class Plugin extends JavaPlugin {
    @Getter
    private static Plugin instance;
    @Getter
    private static final Environment environment = Environment.DEVELOPMENT;
    @Getter
    private final ServicesContainer services;

    public Plugin() {
        instance = this;

        // Initializing services
        services = new ServicesContainer();
    };

    @Override
    public void onEnable() {
        getLogger().info("PhysiBlox plugin enabled");
    };
}