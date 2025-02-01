package io.github.yuko1101.rearcammod.neoforge;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(RearCamMod.MOD_ID)
public final class RearCamModNeoForge {
    public RearCamModNeoForge() {
        RearCamMod.init();

        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        RearCamMod.onKeyStateUpdate();
    }
}
