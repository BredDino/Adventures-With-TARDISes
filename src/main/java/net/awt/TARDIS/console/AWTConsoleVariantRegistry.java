package net.awt.TARDIS.console;

import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry;
import net.awt.TARDIS.console.variants.TestVariant;

public class AWTConsoleVariantRegistry {
    public static ConsoleVariantSchema TEST;

    public static void init() {
        TEST = (ConsoleVariantSchema) ConsoleVariantRegistry.registerStatic(new TestVariant());
    }
}
