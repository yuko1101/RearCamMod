package io.github.yuko1101.holdcam.fabric.mixin;

import io.github.yuko1101.holdcam.HoldCam;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(method = "tick", at = @At("RETURN"))
    private void endTick(CallbackInfo ci) {
        HoldCam.onKeyStateUpdate();
    }
}
