package net.awt.item.custom;


import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AtriumFuel extends Item {
    public AtriumFuel(Settings settings) {
        super(settings.maxCount(64));
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.awt.atrium_fuel"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
