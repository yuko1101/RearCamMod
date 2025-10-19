package io.github.yuko1101.rearcammod.fabric.mixin;

import io.github.yuko1101.rearcammod.RearCamMod;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

// priority is lower than fabric-api so that the keybinding is registered before fabric-api hook is called
@Mixin(value = GameOptions.class, priority = -1000)
public class GameOptionsMixin {
    @Mutable
    @Final
    @Shadow
    public KeyBinding[] allKeys;

    @Inject(at = @At("HEAD"), method = "load()V")
    public void loadHook(CallbackInfo ci) {
        try {
            var clazz = Class.forName("net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper", false, this.getClass().getClassLoader());
            for (var keyBinding : RearCamMod.getKeyBindings()) {
                clazz.getDeclaredMethod("registerKeyBinding", KeyBinding.class).invoke(null, keyBinding);
            }
        } catch (ReflectiveOperationException e) {
            // TODO: add translations for keybindings to the game
            ArrayList<KeyBinding> newKeysAll = new ArrayList<>(List.of(allKeys));
            newKeysAll.addAll(RearCamMod.getKeyBindings());
            allKeys = newKeysAll.toArray(new KeyBinding[0]);
        }
    }
}
