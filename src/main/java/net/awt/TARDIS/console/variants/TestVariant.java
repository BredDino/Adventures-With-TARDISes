package net.awt.TARDIS.console.variants;


import dev.amble.ait.AITMod;
import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.TARDIS.console.types.TestType;
import net.minecraft.util.Identifier;

public class TestVariant extends ConsoleVariantSchema {
    public static final Identifier REFERENCE = AITMod.id("console/test");

    public TestVariant() {
        super(TestType.REFERENCE, REFERENCE);
    }

}
