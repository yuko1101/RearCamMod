package io.github.yuko1101.rearcammod.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.yuko1101.rearcammod.RearCamMod;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RearCamMod.MOD_ID)
public class RearCamModForge {

    public RearCamModForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(RearCamMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RearCamMod.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(RearCamMod.rearCamKey);
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        RearCamMod.onKeyStateUpdate();
    }
}