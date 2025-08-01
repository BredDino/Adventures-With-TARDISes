package net.awt.TARDIS.console.variants;


import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.AdventuresWithTARDISes;
import net.awt.TARDIS.console.types.BlockConsoleType;
import net.minecraft.util.Identifier;

public class BlockVariant3 extends ConsoleVariantSchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("console/block3");

    public BlockVariant3() {
        super(BlockConsoleType.REFERENCE, REFERENCE);
    }

}
