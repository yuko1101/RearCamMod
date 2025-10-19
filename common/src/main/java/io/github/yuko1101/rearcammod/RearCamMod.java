package io.github.yuko1101.rearcammod;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class RearCamMod {
	public static final String MOD_ID = "rearcammod";

	private static final CamKey REAR_CAM_KEY = new CamKey(new KeyBinding("key.rearcam", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, KeyBinding.Category.MISC), Perspective.THIRD_PERSON_FRONT);
	private static final CamKey FRONT_CAM_KEY = new CamKey(new KeyBinding("key.frontcam", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_G, KeyBinding.Category.MISC), Perspective.THIRD_PERSON_BACK);

	public static final List<CamKey> CAM_KEYS = List.of(
			REAR_CAM_KEY,
			FRONT_CAM_KEY
	);

	public static void init() {
	}

	public static void onKeyStateUpdate() {
		REAR_CAM_KEY.onKeyStateUpdate();
		FRONT_CAM_KEY.onKeyStateUpdate();
	}

	public static List<KeyBinding> getKeyBindings() {
		return CAM_KEYS.stream().map(camKey -> camKey.keyBinding).toList();
	}

}
