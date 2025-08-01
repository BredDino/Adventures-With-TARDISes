package net.awt.TARDIS.console;

import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.TARDIS.console.variants.*;

import static dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry.registerStatic;

public class AWTConsoleVariantRegistry {
    public static ConsoleVariantSchema TEST;
    public static ConsoleVariantSchema DICE;
    public static ConsoleVariantSchema JUNKGLASS;
    public static ConsoleVariantSchema BLOCK;
    public static ConsoleVariantSchema BLOCK2;

    public static void init() {
    }

    public static void registerConsoleVariants() {
        AWTConsoleVariantRegistry.TEST = registerStatic(new TestVariant());
        AWTConsoleVariantRegistry.DICE = registerStatic(new DiceVariant());
        AWTConsoleVariantRegistry.JUNKGLASS = registerStatic(new JunkGlassVariant());
        AWTConsoleVariantRegistry.BLOCK = registerStatic(new BlockVariant());
        AWTConsoleVariantRegistry.BLOCK2 = registerStatic(new BlockVariant2());
    }
}
