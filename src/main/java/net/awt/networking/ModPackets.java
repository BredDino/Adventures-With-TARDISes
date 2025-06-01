package net.awt.networking;

import net.awt.AdventuresWithTARDISes;
import net.awt.networking.packets.VMPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {
    public static final Identifier VM_PACKET = new Identifier(AdventuresWithTARDISes.MOD_ID, "vm_packet");


    public static void registerS2CPackets() {
    }

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(VM_PACKET, VMPacket::receive);
    }
}