package net.awt.item.custom;

import net.awt.screens.VortexManipulatorScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VortexManipulator extends Item {
    public VortexManipulator(Settings settings) {
        super(settings.rarity(Rarity.RARE).maxCount(1).maxDamage(100).fireproof());
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            MinecraftClient.getInstance().setScreen(new VortexManipulatorScreen());
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("A dangerous tool used for easy space travel."));
        tooltip.add(Text.literal("WARNING AWT is not responsible for any side effects caused!").formatted(Formatting.RED));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
