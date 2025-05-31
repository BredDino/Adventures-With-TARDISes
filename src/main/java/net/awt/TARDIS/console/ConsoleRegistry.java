package net.awt.TARDIS.console;

import dev.amble.ait.data.schema.console.ConsoleTypeSchema;
import net.awt.TARDIS.console.types.TestType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.SimpleRegistry;

public class ConsoleRegistry {
    public static final SimpleRegistry<ConsoleTypeSchema> REGISTRY = dev.amble.ait.registry.impl.console.ConsoleRegistry.REGISTRY;
    public static ConsoleTypeSchema TEST;

    private static ConsoleTypeSchema register(ConsoleTypeSchema schema) {
        return (ConsoleTypeSchema) Registry.register(REGISTRY, schema.id(), schema);
    }

    public static void init() {
        TEST = register(new TestType());
    }
}
