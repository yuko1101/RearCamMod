package io.github.yuko1101.rearcammod.fabric;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.fabricmc.api.ModInitializer;

public class RearCamModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RearCamMod.init();
    }
}