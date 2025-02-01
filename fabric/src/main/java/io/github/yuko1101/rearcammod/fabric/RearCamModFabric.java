package io.github.yuko1101.rearcammod.fabric;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.fabricmc.api.ClientModInitializer;

public class RearCamModFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RearCamMod.init();
    }
}
