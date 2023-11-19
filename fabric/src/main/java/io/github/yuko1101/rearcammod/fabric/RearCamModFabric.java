package io.github.yuko1101.rearcammod.fabric;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class RearCamModFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RearCamMod.init();

        KeyBindingHelper.registerKeyBinding(RearCamMod.rearCamKey);

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
                RearCamMod.onKeyStateUpdate();
        });
    }
}