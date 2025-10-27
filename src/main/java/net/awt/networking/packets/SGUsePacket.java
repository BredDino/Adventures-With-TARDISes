package net.awt.networking.packets;

import dev.amble.ait.core.item.sonic.SonicMode;
import net.awt.components.ModComponents;
import net.awt.components.custom.SonicGlassesComponent;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;


public class SGUsePacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {

        BlockPos hitPos = buf.readBlockPos();
        boolean foundHitPos = buf.readBoolean();

        if (ModComponents.SONIC_GLASSES.maybeGet(player).isPresent() && ModComponents.SONIC_GLASSES.get(player).equipped && ModComponents.SONIC_GLASSES.get(player).equippedStack.getOrCreateNbt().getInt("fuel") > 0) {
            SonicGlassesComponent sonicGlassesComponent = ModComponents.SONIC_GLASSES.get(player);
            SonicMode sonicMode = sonicGlassesComponent.sonicMode;
            if (sonicMode == SonicMode.Modes.TARDIS) {
                if (foundHitPos) {
                }
            }
        }

    }
}
