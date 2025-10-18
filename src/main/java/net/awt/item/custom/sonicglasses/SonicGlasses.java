package net.awt.item.custom.sonicglasses;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.amble.ait.api.ArtronHolderItem;
import dev.amble.ait.core.AITItems;
import dev.amble.ait.core.item.sonic.SonicMode;
import dev.amble.ait.registry.impl.SonicRegistry;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import dev.emi.trinkets.api.client.TrinketRenderer;
import net.awt.TARDIS.console.client.clientvariants.ClientJunkGlassVariant;
import net.awt.TARDIS.console.client.models.JunkGlassModel;
import net.awt.entity.client.K9Model;
import net.awt.entity.client.K9Renderer;
import net.awt.entity.client.ModModelLayers;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class SonicGlasses extends TrinketItem implements TrinketRenderer, ArtronHolderItem {
    public static final String GLASSES_HEIGHT_KEY = "glasses_height_key";
    public static final String MODE_KEY = "mode";
    private static final Text TEXT_MODE = Text.translatable("message.ait.sonic.mode");


    public SonicGlasses(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getDefaultStack() {
        ItemStack stack = new ItemStack(this);
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putInt("mode", -1);
        nbt.putDouble("fuel", this.getMaxFuel(stack));

        return stack;    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        if (clickType.equals(ClickType.RIGHT)) {
            NbtCompound nbt = stack.getOrCreateNbt();
            if (otherStack.isOf(AITItems.CHARGED_ZEITON_CRYSTAL)) {
                double zeitonfuel = otherStack.getOrCreateNbt().getDouble("fuel");
                double glassesfuel = stack.getOrCreateNbt().getDouble("fuel");
                double finalglassesfuel = glassesfuel + zeitonfuel;
                double finalzeitonfuel = finalglassesfuel-5000;
                if (finalzeitonfuel < 0) {
                    finalzeitonfuel = 0;
                }

                if (finalglassesfuel > 5000) {
                    finalglassesfuel = 5000;
                }



                nbt.putDouble("fuel", finalglassesfuel);
                otherStack.getOrCreateNbt().putDouble("fuel", finalzeitonfuel);
                return true;
            }
            if (hasEquipped(player, this)) {
                nbt.putInt(GLASSES_HEIGHT_KEY, nbt.getInt(GLASSES_HEIGHT_KEY) + 1);
                if (nbt.getInt(GLASSES_HEIGHT_KEY) >= 8) {
                    nbt.putInt(GLASSES_HEIGHT_KEY, 0);
                }
                return true;
            }
        }
        return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (hasEquipped((PlayerEntity) entity, this)) {
            if (entity.age % 20 == 0) {
                if (stack.getOrCreateNbt().getDouble("fuel") > 0) {
                    stack.getOrCreateNbt().putDouble("fuel", stack.getOrCreateNbt().getDouble("fuel") - 1);
                }
            }
        }
        super.tick(stack, slot, entity);


    }

    public static SonicMode mode(ItemStack stack) {
        NbtCompound nbtCompound = stack.getOrCreateNbt();
        return SonicMode.Modes.getAndWrap(nbtCompound.getInt("mode"));
    }

    public static void setMode(ItemStack stack, SonicMode mode) {
        NbtCompound nbtCompound = stack.getOrCreateNbt();
        nbtCompound.putInt("mode", mode.index());
    }

    public static boolean hasEquipped(PlayerEntity player, Item item) {
        Optional<TrinketComponent> trinketComponent = TrinketsApi.getTrinketComponent(player);

        if (trinketComponent.isPresent()) {
            return trinketComponent.get().isEquipped(stack -> stack.isOf(item));
        }

        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(TEXT_MODE.copy().append(mode(stack).text()));
            tooltip.add(Text.literal("Right Click item in inventory when wearing to change height"));
            tooltip.add(Text.literal("Current Height:" + "+" + stack.getOrCreateNbt().getInt(GLASSES_HEIGHT_KEY)));

        int fuel = (int)Math.round(this.getCurrentFuel(stack));
        boolean acceptableFuel = this.getCurrentFuel(stack) > this.getMaxFuel(stack) / 4.0;
        tooltip.add(Text.literal("Artron Units: ").formatted(Formatting.BLUE).append(Text.literal(String.valueOf(fuel)).formatted(acceptableFuel ? Formatting.GREEN : Formatting.RED)));


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
        matrixStack.scale(-1,-1,-1);
        //JunkGlassModel.getTexturedModelData().createModel().render(matrixStack, vertexConsumers.getBuffer(RenderLayer.getEntityAlpha(ClientJunkGlassVariant.TEXTURE)), light, OverlayTexture.DEFAULT_UV); im saving this for later guys
    }

    @Override
    public double getMaxFuel(ItemStack itemStack) {
        return 5000;
    }
}
//make it work like sonic, however make sure it links via telepathic circuits and doesn't have a battery like the normal sonic does. Thank you, Dino <3