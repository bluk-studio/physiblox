# Physiblox

This repository contains all source code for PhysiBlox Minecraft plugin. This plugin's main goal is to bring real-world physics to vanilla minecraft using texture packs, custom models and popular game physics engine named [Rapier](https://www.rapier.rs/). In theory, this plugin have two sides - **engine** and **runtime**. Engine is a binary written in Rust, that exposes Rapier APIs using gRPC server. Runtime *(in this case, runtime-java for spigot plugins)* uses gRPC client to commuticate to physics engine and to send game data to it. Engine then sends information about physical objects *(and their behavior)* to server, which then - using texture packs and armor stands - animates them to all players.

# Todo

- [ ] Release a MVP version of this plugin
