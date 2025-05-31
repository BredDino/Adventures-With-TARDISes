package net.awt.TARDIS.console.client;

import dev.amble.ait.data.schema.console.ClientConsoleVariantSchema;
import dev.amble.ait.registry.impl.console.variant.ClientConsoleVariantRegistry;
import net.awt.TARDIS.console.client.clientvariants.ClientTestVariant;

public class AWTClientConsoleVariantRegistry  {
    public static ClientConsoleVariantSchema TEST;

    public static void init() {
        TEST = ClientConsoleVariantRegistry.getInstance().register(new ClientTestVariant());
    }
}
