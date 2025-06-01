package net.awt.networking.packets;

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


public class VMPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        String dim = buf.readString();
        double x = buf.readDouble();
        double y = buf.readDouble();
        double z = buf.readDouble();


        dim = dim.toLowerCase();

        RegistryKey<World> overworldKey = RegistryKey.of(RegistryKeys.WORLD, new Identifier("minecraft:overworld"));
        RegistryKey<World> netherKey = RegistryKey.of(RegistryKeys.WORLD, new Identifier("minecraft:the_nether"));
        RegistryKey<World> endKey = RegistryKey.of(RegistryKeys.WORLD, new Identifier("minecraft:the_end"));
        RegistryKey<World> key = RegistryKey.of(RegistryKeys.WORLD, new Identifier(dim));

        ServerWorld overWorld = server.getWorld(overworldKey);
        ServerWorld netherWorld = server.getWorld(netherKey);
        ServerWorld endWorld = server.getWorld(endKey);

        ServerWorld serverWorld = server.getWorld(key);
        if (serverWorld == null) {
            if (dim.equalsIgnoreCase("nether")) {
                serverWorld = netherWorld;
            } else if (dim.equalsIgnoreCase("end")) {
                serverWorld = endWorld;
            } else if (dim.equalsIgnoreCase("overworld")) {
                serverWorld = overWorld;
            } else {
                serverWorld = player.getServerWorld();
            }
        }
        ServerWorld finalServerWorld = serverWorld;
        server.execute(() -> {
            FabricDimensions.teleport(player, finalServerWorld, new TeleportTarget(
                    new Vec3d(x, y, z),
                    player.getVelocity(),
                    player.getYaw(),
                    player.getPitch()
            ));
        });


    }
}
