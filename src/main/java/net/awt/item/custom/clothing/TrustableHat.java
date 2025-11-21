package net.awt.item.custom.clothing;

import dev.emi.trinkets.TrinketSlot;
import dev.emi.trinkets.api.*;
import dev.emi.trinkets.api.client.TrinketRenderer;
import net.awt.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
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
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TrustableHat extends ArmorItem implements Trinket, TrinketRenderer {

    public static final String HAT_HEIGHT_KEY = "hat_height_key";


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (entity instanceof ArmorStandEntity) {
            ArmorStandEntity armorStand = (ArmorStandEntity) entity;

            armorStand.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.TRUSTABLE_HAT));

            if (!player.getWorld().isClient) {
                stack.decrement(1);
            }

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }



    public TrustableHat(Settings settings) {
        super(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, settings);
        TrinketsApi.registerTrinket(this, this);
    }


    @Override
    public void render(
            ItemStack stack,
            SlotReference slotReference,
            EntityModel<? extends LivingEntity> contextModel,
            MatrixStack matrixStack,
            VertexConsumerProvider vertexConsumers,
            int light,
            LivingEntity entity,
            float limbAngle,
            float limbDistance,
            float tickDelta,
            float animationProgress,
            float headYaw,
            float headPitch
    ) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();


        if (entity instanceof AbstractClientPlayerEntity clientPlayer &&
                contextModel instanceof PlayerEntityModel<?> playerModel) {

            TrinketRenderer.translateToFace(
                    matrixStack,
                    (PlayerEntityModel<AbstractClientPlayerEntity>) playerModel,
                    clientPlayer,
                    headYaw,
                    headPitch
            );
        } else {
            // ✔️ Armor stand / other entities: manually position the item
            matrixStack.translate(0, -0.2, 0); // adjust if needed
        }

        // Common transforms
        matrixStack.translate(0, 0.15, 0.3);
        matrixStack.multiply(RotationAxis.NEGATIVE_Z.rotationDegrees(180.0F));

        itemRenderer.renderItem(
                entity,
                stack,
                ModelTransformationMode.HEAD,
                false,
                matrixStack,
                vertexConsumers,
                entity.getWorld(),
                light,
                OverlayTexture.DEFAULT_UV,
                0
        );
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Trust Us...").formatted(Formatting.DARK_BLUE));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (equipItem(user, stack)) {
            return TypedActionResult.success(stack, world.isClient());
        }
        return super.use(world, user, hand);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        Trinket.super.tick(stack, slot, entity);
    }

    public static boolean equipItem(PlayerEntity user, ItemStack stack) {
        return equipItem((LivingEntity) user, stack);
    }

    public static boolean equipItem(LivingEntity user, ItemStack stack) {
        var optional = TrinketsApi.getTrinketComponent(user);
        if (optional.isPresent()) {
            TrinketComponent comp = optional.get();
            for (var group : comp.getInventory().values()) {
                for (TrinketInventory inv : group.values()) {
                    for (int i = 0; i < inv.size(); i++) {
                        if (inv.getStack(i).isEmpty()) {
                            SlotReference ref = new SlotReference(inv, i);
                            if (TrinketSlot.canInsert(stack, ref, user)) {
                                ItemStack newStack = stack.copy();
                                inv.setStack(i, newStack);
                                SoundEvent soundEvent = stack.getItem() instanceof Equipment eq ? eq.getEquipSound() : null;
                                if (!stack.isEmpty() && soundEvent != null) {
                                    user.emitGameEvent(GameEvent.EQUIP);
                                    user.playSound(soundEvent, 1.0F, 1.0F);
                                }
                                stack.setCount(0);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasEquipped(PlayerEntity player, Item item) {
        Optional<TrinketComponent> trinketComponent = TrinketsApi.getTrinketComponent(player);

        if (trinketComponent.isPresent()) {
            return trinketComponent.get().isEquipped(stack -> stack.isOf(item));
        }

        return false;
    }
}
