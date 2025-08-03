package net.awt.TARDIS.console.variants;


import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.AdventuresWithTARDISes;
import net.awt.TARDIS.console.types.JunkGlassType;
import net.minecraft.util.Identifier;

public class JunkGlassVariant2 extends ConsoleVariantSchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("console/junkglass2");

    public JunkGlassVariant2() {
        super(JunkGlassType.REFERENCE, REFERENCE);
    }

}
