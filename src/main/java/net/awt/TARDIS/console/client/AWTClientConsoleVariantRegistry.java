package net.awt.TARDIS.console.client;

import dev.amble.ait.AITMod;
import dev.amble.ait.client.models.consoles.ConsoleModel;
import dev.amble.ait.data.datapack.DatapackConsole;
import dev.amble.ait.data.schema.console.ClientConsoleVariantSchema;
import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import dev.amble.ait.data.schema.console.variant.alnico.client.ClientAlnicoVariant;
import dev.amble.ait.data.schema.console.variant.alnico.client.ClientBlueAlnicoVariant;
import dev.amble.ait.data.schema.console.variant.copper.client.ClientCopperVariant;
import dev.amble.ait.data.schema.console.variant.coral.client.*;
import dev.amble.ait.data.schema.console.variant.crystalline.client.ClientCrystallineVariant;
import dev.amble.ait.data.schema.console.variant.crystalline.client.ClientCrystallineZeitonVariant;
import dev.amble.ait.data.schema.console.variant.hartnell.client.ClientHartnellVariant;
import dev.amble.ait.data.schema.console.variant.hartnell.client.ClientKeltHartnellVariant;
import dev.amble.ait.data.schema.console.variant.hartnell.client.ClientMintHartnellVariant;
import dev.amble.ait.data.schema.console.variant.hartnell.client.ClientWoodenHartnellVariant;
import dev.amble.ait.data.schema.console.variant.renaissance.client.*;
import dev.amble.ait.data.schema.console.variant.steam.client.*;
import dev.amble.ait.data.schema.console.variant.toyota.client.ClientToyotaBlueVariant;
import dev.amble.ait.data.schema.console.variant.toyota.client.ClientToyotaLegacyVariant;
import dev.amble.ait.data.schema.console.variant.toyota.client.ClientToyotaVariant;
import dev.amble.ait.registry.impl.console.variant.ClientConsoleVariantRegistry;
import dev.amble.lib.register.datapack.DatapackRegistry;
import net.awt.TARDIS.console.client.clientvariants.ClientTestVariant;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

import java.util.Iterator;

public class AWTClientConsoleVariantRegistry extends DatapackRegistry<ClientConsoleVariantSchema> {
    private static ClientConsoleVariantRegistry INSTANCE;
    public static ClientConsoleVariantSchema TEST;

    public AWTClientConsoleVariantRegistry() {
    }

    public static DatapackRegistry<ClientConsoleVariantSchema> getInstance() {
        if (INSTANCE == null) {
            AITMod.LOGGER.info("ClientConsoleVariantRegistry was not initialized, Creating a new instance");
            INSTANCE = new ClientConsoleVariantRegistry();
        }

        return INSTANCE;
    }

    public static ClientConsoleVariantSchema withParent(ConsoleVariantSchema parent) {
        Iterator var1 = getInstance().toList().iterator();

        ClientConsoleVariantSchema schema;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            schema = (ClientConsoleVariantSchema)var1.next();
        } while(schema.parent() == null || !schema.parent().id().equals(parent.id()));

        return schema;
    }

    public static ClientConsoleVariantSchema withSameParent(ClientConsoleVariantSchema schema) {
        Iterator var1 = getInstance().toList().iterator();

        ClientConsoleVariantSchema s;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            s = (ClientConsoleVariantSchema)var1.next();
        } while(s.parent() == null || schema.equals(s) || !s.parent().parentId().equals(schema.parent().parentId()));

        return s;
    }

    public ClientConsoleVariantSchema fallback() {
        return null;
    }

    public void syncToClient(ServerPlayerEntity player) {
    }

    public void readFromServer(PacketByteBuf buf) {
        int size = buf.readInt();

        for(int i = 0; i < size; ++i) {
            this.register(convertDatapack((DatapackConsole)buf.decodeAsJson(DatapackConsole.CODEC)));
        }

        AITMod.LOGGER.info("Read {} client console variants from server", size);
    }

    public static ClientConsoleVariantSchema convertDatapack(final DatapackConsole variant) {
        return !variant.wasDatapack() ? convertNonDatapack(variant) : new ClientConsoleVariantSchema(variant.id()) {
            private ClientConsoleVariantSchema sameParent;

            private ClientConsoleVariantSchema getSameParent() {
                if (this.sameParent == null) {
                    this.sameParent = ClientConsoleVariantRegistry.withSameParent(this);
                }

                return this.sameParent;
            }

            public Identifier texture() {
                return variant.texture();
            }

            public Identifier emission() {
                return variant.emission();
            }

            public ConsoleModel model() {
                return this.getSameParent().model();
            }

            public float[] sonicItemRotations() {
                if (variant.sonicRotation().isEmpty()) {
                    return this.getSameParent().sonicItemRotations();
                } else {
                    float[] result = new float[2];

                    for(int i = 0; i < 2; ++i) {
                        result[i] = (Float)variant.sonicRotation().get(i);
                    }

                    return result;
                }
            }

            public Vector3f sonicItemTranslations() {
                return variant.sonicTranslation().equals(0.0F, 0.0F, 0.0F) ? this.getSameParent().sonicItemTranslations() : variant.sonicTranslation();
            }

            public float[] handlesRotations() {
                if (variant.handlesRotation().isEmpty()) {
                    return this.getSameParent().handlesRotations();
                } else {
                    float[] result = new float[2];

                    for(int i = 0; i < 2; ++i) {
                        result[i] = (Float)variant.handlesRotation().get(i);
                    }

                    return result;
                }
            }

            public Vector3f handlesTranslations() {
                return variant.handlesTranslation().equals(0.0F, 0.0F, 0.0F) ? this.getSameParent().handlesTranslations() : variant.handlesTranslation();
            }
        };
    }

    private static ClientConsoleVariantSchema convertNonDatapack(DatapackConsole variant) {
        return variant.wasDatapack() ? convertDatapack(variant) : (ClientConsoleVariantSchema)getInstance().get(variant.id());
    }

    public void onClientInit() {
        TEST = (ClientConsoleVariantSchema)this.register(new ClientTestVariant());
    }
}
