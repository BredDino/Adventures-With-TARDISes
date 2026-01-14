package net.awt.item.spoon;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Spoon extends SwordItem {

    public Spoon() {
        super(ToolMaterials.IRON, 6, -2.4F, new Item.Settings()
                .rarity(Rarity.RARE)
                .maxCount(1)
                .maxDamage(250)
                .fireproof());
    }

    // Right-click: block like shield
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(stack);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BLOCK;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 72000;
    }

    // Tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("A spoon that fights, defends, and digs!").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }

    // Shovel behavior
    @Override
    public boolean isSuitableFor(BlockState state) {
        return state.isOf(Blocks.DIRT) || state.isOf(Blocks.GRASS_BLOCK)
                || state.isOf(Blocks.SAND) || state.isOf(Blocks.GRAVEL)
                || state.isOf(Blocks.CLAY) || state.isOf(Blocks.SNOW)
                || state.isOf(Blocks.SNOW_BLOCK)
                || super.isSuitableFor(state);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (isSuitableFor(state)) return 4.5F; // iron shovel speed
        return super.getMiningSpeedMultiplier(stack, state);
    }

    // Handle shield-like damage reduction
    public static float handleDamage(PlayerEntity player, DamageSource source, float amount) {
        ItemStack stack = player.getActiveItem();
        if (!stack.isEmpty() && stack.getItem() instanceof Spoon && player.isUsingItem()) {
        }
        return amount;
    }
}
