package net.awt.networking.packets;

import net.awt.components.ModComponents;
import net.fabricmc.fabric.api.dimension.v1.FabricDimensions;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;


public class SGSMPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {

        if (ModComponents.SONIC_GLASSES.maybeGet(player).isPresent() && ModComponents.SONIC_GLASSES.get(player).equipped) {
            ModComponents.SONIC_GLASSES.get(player).nextMode();
        }

    }
}
