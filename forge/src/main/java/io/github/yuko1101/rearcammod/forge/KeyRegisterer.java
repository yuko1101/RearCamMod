package io.github.yuko1101.rearcammod.forge;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RearCamMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeyRegisterer {
    @SubscribeEvent
    public static void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(RearCamMod.rearCamKey);
    }
}
