package net.awt.item.custom.sonicglasses;

import dev.amble.ait.api.ArtronHolderItem;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SonicGlasses extends TrinketItem implements TrinketRenderer, ArtronHolderItem {
    private String GLASSES_HEIGHT_KEY = "glasses_height_key";

    public SonicGlasses(Settings settings) {
        super(settings);
    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        if (clickType.equals(ClickType.RIGHT)) {
            NbtCompound nbt = stack.getOrCreateNbt();
            nbt.putInt(GLASSES_HEIGHT_KEY, nbt.getInt(GLASSES_HEIGHT_KEY)+1);
            if (nbt.getInt(GLASSES_HEIGHT_KEY) >= 8) {
                nbt.putInt(GLASSES_HEIGHT_KEY, 0);
            }
            return true;
        }
        return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Right Click item in inventory to change height"));
        tooltip.add(Text.literal("Current Height:"));
        tooltip.add(Text.literal("+" + stack.getOrCreateNbt().getInt(GLASSES_HEIGHT_KEY)));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrixStack, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        TrinketRenderer.translateToFace(matrixStack, (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, (AbstractClientPlayerEntity) entity, headYaw, headPitch);
        matrixStack.scale(1, -1, 1);
        matrixStack.scale(0.6f, 0.6f, 0.6f);
        matrixStack.translate(0,-0.05,0.5);
        matrixStack.translate(0, 0.1*stack.getOrCreateNbt().getInt(GLASSES_HEIGHT_KEY), 0);
        itemRenderer.renderItem(entity, stack, ModelTransformationMode.HEAD, false, matrixStack, vertexConsumers, entity.getWorld(), light, OverlayTexture.DEFAULT_UV, 0);
    }



    public void setGLASSES_HEIGHT_KEY(String GLASSES_HEIGHT_KEY) {
        this.GLASSES_HEIGHT_KEY = GLASSES_HEIGHT_KEY;
    }

    @Override
    public double getMaxFuel(ItemStack itemStack) {
        return 100;
    }
}
//make it work like sonic, however make sure it links via telepathic circuits and doesn't have a battery like the normal sonic does. Thank you, Dino <3