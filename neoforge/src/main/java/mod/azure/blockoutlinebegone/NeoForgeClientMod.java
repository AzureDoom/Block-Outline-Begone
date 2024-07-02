package mod.azure.blockoutlinebegone;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@Mod(CommonMod.MOD_ID)
@EventBusSubscriber(modid = CommonMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoForgeClientMod {

    @SubscribeEvent
    public static void registerKeys(final RegisterKeyMappingsEvent event) {
        Keybind.TOGGLE_VIEW = new KeyMapping(
                "key.blockoutlinebegone.toggle_view",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_GRAVE_ACCENT,
                "category.blockoutlinebegone.binds"
        );
        event.register(Keybind.TOGGLE_VIEW);
    }
}
