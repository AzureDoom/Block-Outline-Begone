package mod.azure.blockoutlinebegone;

import net.minecraft.resources.ResourceLocation;

public class CommonMod {
    public static boolean disableOutline = true;
    public static final String MOD_ID = "blockoutlinebegone";

    public static final ResourceLocation modResource(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }

    public static void toggleOutline() {
        disableOutline = !disableOutline;
    }
}
