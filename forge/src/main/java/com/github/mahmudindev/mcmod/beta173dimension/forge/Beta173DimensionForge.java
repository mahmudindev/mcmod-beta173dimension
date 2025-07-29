package com.github.mahmudindev.mcmod.beta173dimension.forge;

import com.github.mahmudindev.mcmod.beta173dimension.Beta173Dimension;
import net.minecraftforge.fml.common.Mod;

@Mod(Beta173Dimension.MOD_ID)
public final class Beta173DimensionForge {
    public Beta173DimensionForge() {
        // Run our common setup.
        Beta173Dimension.init();
    }
}
