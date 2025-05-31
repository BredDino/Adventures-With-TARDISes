package net.awt.TARDIS.console.client.clientvariants;

import dev.amble.ait.client.models.consoles.ConsoleModel;
import dev.amble.ait.data.schema.console.ClientConsoleVariantSchema;
import net.awt.AdventuresWithTARDISes;
import net.awt.TARDIS.console.client.models.TestModel;
import net.awt.TARDIS.console.variants.TestVariant;
import net.minecraft.util.Identifier;

public class ClientTestVariant extends ClientConsoleVariantSchema {
    public static final Identifier TEXTURE = new Identifier(AdventuresWithTARDISes.MOD_ID, "textures/blockentities/consoles/test.png");

    public ClientTestVariant() {
        super(TestVariant.REFERENCE, TestVariant.REFERENCE);
    }

    @Override
    public Identifier texture() {
        return TEXTURE;
    }

    @Override
    public Identifier emission() {
        return null;
    }

    @Override
    public ConsoleModel model() {
        return new TestModel(TestModel.getTexturedModelData().createModel());
    }
}
