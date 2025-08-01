package net.awt.TARDIS.console;

import dev.amble.ait.data.schema.console.ConsoleTypeSchema;
import dev.amble.ait.registry.impl.console.ConsoleRegistry;
import net.awt.TARDIS.console.types.BlockConsoleType;
import net.awt.TARDIS.console.types.DiceType;
import net.awt.TARDIS.console.types.JunkGlassType;
import net.awt.TARDIS.console.types.TestType;

public class AWTConsoleRegistry {
    public static ConsoleTypeSchema TEST;
    public static ConsoleTypeSchema DICE;
    public static ConsoleTypeSchema JUNKGLASS;
    public static ConsoleTypeSchema BLOCK;
    public static ConsoleTypeSchema BLOCK2;

    public static void init() {
    }

    public static void registerConsoles() {
        AWTConsoleRegistry.TEST = ConsoleRegistry.register(new TestType());
        AWTConsoleRegistry.DICE = ConsoleRegistry.register(new DiceType());
        AWTConsoleRegistry.JUNKGLASS = ConsoleRegistry.register(new JunkGlassType());
        AWTConsoleRegistry.BLOCK = ConsoleRegistry.register(new BlockConsoleType());
        AWTConsoleRegistry.BLOCK2 = ConsoleRegistry.register(new BlockConsoleType());
    }
}
