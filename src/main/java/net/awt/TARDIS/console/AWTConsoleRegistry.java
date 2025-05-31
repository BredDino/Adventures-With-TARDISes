package net.awt.TARDIS.console;

import dev.amble.ait.data.schema.console.ConsoleTypeSchema;
import dev.amble.ait.registry.impl.console.ConsoleRegistry;
import net.awt.TARDIS.console.types.TestType;

public class AWTConsoleRegistry {
    public static ConsoleTypeSchema TEST;



    public static void init() {
        TEST = ConsoleRegistry.register(new TestType());
    }
}
