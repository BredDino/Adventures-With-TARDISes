package net.awt.TARDIS.console;

import com.mojang.serialization.Codec;
import dev.amble.ait.AITMod;
import dev.amble.ait.data.datapack.DatapackConsole;
import dev.amble.ait.data.datapack.DatapackExterior;
import dev.amble.ait.data.schema.console.ConsoleTypeSchema;
import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import dev.amble.ait.registry.impl.console.variant.ClientConsoleVariantRegistry;
import dev.amble.ait.registry.impl.console.variant.ConsoleVariantRegistry;
import dev.amble.lib.register.unlockable.UnlockableRegistry;
import net.awt.TARDIS.console.variants.TestVariant;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.resource.ResourceType;
import net.minecraft.server.network.ServerPlayerEntity;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AWTConsoleVariantRegistry extends UnlockableRegistry<ConsoleVariantSchema> {
    public static ConsoleVariantRegistry INSTANCE;
    public static ConsoleVariantSchema TEST;

    protected AWTConsoleVariantRegistry() {
        super(DatapackConsole::fromInputStream, (Codec)null, "console_variants", "console", true, "ait");
    }

    public static ConsoleVariantSchema registerStatic(ConsoleVariantSchema schema) {
        return (ConsoleVariantSchema)getInstance().register(schema);
    }

    public ConsoleVariantSchema fallback() {
        return null;
    }

    public void syncToClient(ServerPlayerEntity player) {
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeInt(this.REGISTRY.size());
        Iterator var3 = this.REGISTRY.values().iterator();

        while(var3.hasNext()) {
            ConsoleVariantSchema schema = (ConsoleVariantSchema)var3.next();
            if (schema instanceof DatapackConsole variant) {
                buf.encodeAsJson(DatapackConsole.CODEC, variant);
            } else {
                buf.encodeAsJson(DatapackConsole.CODEC, new DatapackConsole(schema.id(), schema.parent().id(), DatapackExterior.DEFAULT_TEXTURE, DatapackExterior.DEFAULT_TEXTURE, List.of(), new Vector3f(), List.of(), new Vector3f(), false));
            }
        }

        ServerPlayNetworking.send(player, this.packet, buf);
    }

    public void onCommonInit() {
        super.onCommonInit();
        this.defaults();
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(this);
    }

    public void readFromServer(PacketByteBuf buf) {
        PacketByteBuf copy = PacketByteBufs.copy(buf);
        ClientConsoleVariantRegistry.getInstance().readFromServer(copy);
        this.REGISTRY.clear();
        this.defaults();
        int size = buf.readInt();

        for(int i = 0; i < size; ++i) {
            DatapackConsole variant = (DatapackConsole)buf.decodeAsJson(DatapackConsole.CODEC);
            if (variant.wasDatapack()) {
                this.register(variant);
            }
        }

        AITMod.LOGGER.info("Read {} console variants from server", size);
    }

    public static ConsoleVariantRegistry getInstance() {

        return INSTANCE;
    }

    public static List<ConsoleVariantSchema> withParent(ConsoleTypeSchema parent) {
        List<ConsoleVariantSchema> list = new ArrayList();
        Iterator var2 = ConsoleRegistry.REGISTRY.iterator();

        while(var2.hasNext()) {
            ConsoleVariantSchema schema = (ConsoleVariantSchema)var2.next();
            if (schema.parent().equals(parent)) {
                list.add(schema);
            }
        }

        return list;
    }

    protected void defaults() {
        TEST = registerStatic(new TestVariant());
    }
}
