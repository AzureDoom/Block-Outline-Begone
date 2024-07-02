package mod.azure.blockoutlinebegone;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class NeoForgeClientEvent {

    @SubscribeEvent
    public static void onKeyInput(final ClientTickEvent.Post event) {
        if (Keybind.TOGGLE_VIEW.consumeClick()) {
            CommonMod.toggleOutline();
        }
    }
}
