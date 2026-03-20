package io.github.yuko1101.holdcam.neoforge;

import io.github.yuko1101.holdcam.HoldCam;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(HoldCam.MOD_ID)
public final class HoldCamNeoForge {
    public HoldCamNeoForge() {
        HoldCam.init();

        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        HoldCam.onKeyStateUpdate();
    }
}
