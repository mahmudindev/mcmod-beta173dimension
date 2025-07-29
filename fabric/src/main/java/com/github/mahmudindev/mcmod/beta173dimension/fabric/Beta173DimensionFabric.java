package com.github.mahmudindev.mcmod.beta173dimension.fabric;

import com.github.mahmudindev.mcmod.beta173dimension.Beta173Dimension;
import net.fabricmc.api.ModInitializer;

public final class Beta173DimensionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Beta173Dimension.init();
    }
}
