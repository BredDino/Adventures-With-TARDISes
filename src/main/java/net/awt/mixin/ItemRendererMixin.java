package net.awt.mixin;

import net.awt.AdventuresWithTARDISes;
import net.awt.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useClothing(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.FEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "fez3d", "inventory"));
        }

        if (stack.isOf(ModItems.FANCYFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "fancyfez3d", "inventory"));
        }

        if (stack.isOf(ModItems.PURPLEFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "purplefez3d", "inventory"));
        }

        if (stack.isOf(ModItems.GREENFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "greenfez3d", "inventory"));
        }

        if (stack.isOf(ModItems.GREYFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "greyfez3d", "inventory"));
        }

        if (stack.isOf(ModItems.ORANGEFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "orangefez3d", "inventory"));
        }

        if (stack.isOf(ModItems.BLUEFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "bluefez3d", "inventory"));
        }

        if (stack.isOf(ModItems.DARKBLUEFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "darkbluefez3d", "inventory"));
        }

        if (stack.isOf(ModItems.PINKFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "pinkfez3d", "inventory"));
        }

        if (stack.isOf(ModItems.YELLOWFEZ) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "yellowfez3d", "inventory"));
        }

        if (stack.isOf(ModItems.EYESTALK) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "eyestalk3d", "inventory"));
        }

        if (stack.isOf(ModItems.BOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "bowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.BLUEBOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "bluebowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.CYANBOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "cyanbowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.GREENBOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "greenbowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.ORANGEBOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "orangebowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.GREYBOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "greybowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.MAGENTABOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "magentabowtie3d", "inventory"));
        }

        if (stack.isOf(ModItems.PURPLEBOWTIE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(AdventuresWithTARDISes.MOD_ID, "purplebowtie3d", "inventory"));
        }
        return value;
    }
}