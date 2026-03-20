package io.github.yuko1101.holdcam.fabric;

import io.github.yuko1101.holdcam.HoldCam;
import net.fabricmc.api.ClientModInitializer;

public class HoldCamFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HoldCam.init();
    }
}
