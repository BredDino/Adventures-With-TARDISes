package net.awt.TARDIS.console;

import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.TARDIS.console.variants.BlockVariant;
import net.awt.TARDIS.console.variants.DiceVariant;
import net.awt.TARDIS.console.variants.JunkGlassVariant;
import net.awt.TARDIS.console.variants.TestVariant;

import static dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry.registerStatic;

public class AWTConsoleVariantRegistry {
    public static ConsoleVariantSchema TEST;
    public static ConsoleVariantSchema DICE;
    public static ConsoleVariantSchema JUNKGLASS;
    public static ConsoleVariantSchema BLOCK;

    public static void init() {
    }

    public static void registerConsoleVariants() {
        AWTConsoleVariantRegistry.TEST = registerStatic(new TestVariant());
        AWTConsoleVariantRegistry.DICE = registerStatic(new DiceVariant());
        AWTConsoleVariantRegistry.JUNKGLASS = registerStatic(new JunkGlassVariant());
        AWTConsoleVariantRegistry.BLOCK = registerStatic(new BlockVariant());
    }
}
