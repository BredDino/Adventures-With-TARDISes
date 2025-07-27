package net.awt.TARDIS.console.client;

import dev.amble.ait.data.schema.console.ClientConsoleVariantSchema;
import dev.amble.lib.register.datapack.DatapackRegistry;
import net.awt.TARDIS.console.client.clientvariants.ClientBlockVariant;
import net.awt.TARDIS.console.client.clientvariants.ClientDiceVariant;
import net.awt.TARDIS.console.client.clientvariants.ClientJunkGlassVariant;
import net.awt.TARDIS.console.client.clientvariants.ClientTestVariant;

public class AWTClientConsoleVariantRegistry  {
    public static ClientConsoleVariantSchema TEST;
    public static ClientConsoleVariantSchema DICE;
    public static ClientConsoleVariantSchema JUNKGLASS;
    public static ClientConsoleVariantSchema BLOCK;

    public static void init() {
    }

    public static void registerClientConsoleVariants(DatapackRegistry<ClientConsoleVariantSchema> instance) {
        AWTClientConsoleVariantRegistry.TEST = instance.register(new ClientTestVariant());
        AWTClientConsoleVariantRegistry.DICE = instance.register(new ClientDiceVariant());
        AWTClientConsoleVariantRegistry.JUNKGLASS = instance.register(new ClientJunkGlassVariant());
        AWTClientConsoleVariantRegistry.BLOCK = instance.register(new ClientBlockVariant());
    }
}
