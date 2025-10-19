package io.github.yuko1101.rearcammod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.Perspective;

public class CamKey {
    public final KeyBinding keyBinding;
    private final Perspective targetPerspective;

    private boolean isActive = false;

    public CamKey(KeyBinding keyBinding, Perspective targetPerspective) {
        this.keyBinding = keyBinding;
        this.targetPerspective = targetPerspective;
    }

    public void onKeyStateUpdate() {
        if (keyBinding.isPressed() && !isActive) {
            isActive = true;
            MinecraftClient.getInstance().options.setPerspective(targetPerspective);
        } else if (!keyBinding.isPressed() && isActive) {
            isActive = false;
            MinecraftClient.getInstance().options.setPerspective(Perspective.FIRST_PERSON);
        }
    }
}
