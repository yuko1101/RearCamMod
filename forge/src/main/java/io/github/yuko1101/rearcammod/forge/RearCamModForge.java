package io.github.yuko1101.rearcammod.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.yuko1101.rearcammod.RearCamMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RearCamMod.MOD_ID)
public class RearCamModForge {
    public RearCamModForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(RearCamMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RearCamMod.init();
    }
}