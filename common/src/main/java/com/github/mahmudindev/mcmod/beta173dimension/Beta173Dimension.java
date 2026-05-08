package com.github.mahmudindev.mcmod.beta173dimension;

import com.github.mahmudindev.mcmod.beta173dimension.platform.Services;
import com.github.mahmudindev.mcmod.beta173dimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class Beta173Dimension {
    public static final String MOD_ID = "beta173dimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
