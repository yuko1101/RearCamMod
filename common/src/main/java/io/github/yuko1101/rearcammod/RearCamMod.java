package io.github.yuko1101.rearcammod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class RearCamMod {
	public static final String MOD_ID = "rearcammod";
	public static final KeyBinding rearCamKey = new KeyBinding("key.rearcam", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, "key.categories.misc");

	public static void init() {
	}

	private static boolean isActive = false;

	public static void onKeyStateUpdate() {

		if (rearCamKey.isPressed() && !isActive) {
			isActive = true;
			MinecraftClient.getInstance().options.setPerspective(Perspective.THIRD_PERSON_FRONT);
		} else if (!rearCamKey.isPressed() && isActive) {
			isActive = false;
			MinecraftClient.getInstance().options.setPerspective(Perspective.FIRST_PERSON);
		}
	}

}
