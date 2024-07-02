package mod.azure.blockoutlinebegone;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class FabricLibClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Keybind.TOGGLE_VIEW = new KeyMapping(
                "key.blockoutlinebegone.toggle_view",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_GRAVE_ACCENT,
                "category.blockoutlinebegone.binds"
        );
        KeyBindingHelper.registerKeyBinding(Keybind.TOGGLE_VIEW);
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (Keybind.TOGGLE_VIEW.consumeClick()) {
                CommonMod.toggleOutline();
            }
        });
    }
}
