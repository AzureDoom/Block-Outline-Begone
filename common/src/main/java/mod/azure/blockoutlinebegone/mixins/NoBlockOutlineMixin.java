package mod.azure.blockoutlinebegone.mixins;

import com.mojang.blaze3d.vertex.PoseStack;
import mod.azure.blockoutlinebegone.CommonMod;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class NoBlockOutlineMixin {
    @Inject(method = "renderBlockOutline", at = @At("HEAD"), cancellable = true)
    public void onRenderBlockOutline(Camera camera, MultiBufferSource.BufferSource bufferSource, PoseStack poseStack, boolean sort, CallbackInfo ci) {
        if (CommonMod.disableOutline) {
            ci.cancel();
        }
    }
}