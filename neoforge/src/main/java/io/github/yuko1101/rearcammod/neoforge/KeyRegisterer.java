package io.github.yuko1101.rearcammod.neoforge;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@EventBusSubscriber(modid = RearCamMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class KeyRegisterer {
    @SubscribeEvent
    public static void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(RearCamMod.rearCamKey);
    }
}
