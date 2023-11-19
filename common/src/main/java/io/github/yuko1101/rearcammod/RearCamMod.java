package io.github.yuko1101.rearcammod;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.CameraType;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class RearCamMod {
	public static final String MOD_ID = "rearcammod";
	public static final KeyMapping rearCamKey = new KeyMapping("key.rearcam", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, "key.categories.misc");

	public static void init() {
	}

	private static boolean isActive = false;

	public static void onKeyStateUpdate() {

		if (rearCamKey.isDown() && !isActive) {
			isActive = true;
			Minecraft.getInstance().options.setCameraType(CameraType.THIRD_PERSON_FRONT);
		} else if (!rearCamKey.isDown() && isActive) {
			isActive = false;
			Minecraft.getInstance().options.setCameraType(CameraType.FIRST_PERSON);
		}
	}

}
