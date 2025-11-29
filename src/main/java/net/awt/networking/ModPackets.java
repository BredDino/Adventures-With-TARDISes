package net.awt.networking;

import net.awt.AdventuresWithTARDISes;
import net.awt.networking.packets.SGSMPacket;
import net.awt.networking.packets.SGUsePacket;
import net.awt.networking.packets.VMPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {
    public static final Identifier VM_PACKET = new Identifier(AdventuresWithTARDISes.MOD_ID, "vm_packet");
    public static final Identifier SGSM_PACKET = new Identifier(AdventuresWithTARDISes.MOD_ID, "sgsm_packet"); // Sonic Glasses Switch Mode
    public static final Identifier SGU_PACKET = new Identifier(AdventuresWithTARDISes.MOD_ID, "sgu_packet"); // Sonic Glasses Use


    public static void registerS2CPackets() {
    }

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(VM_PACKET, VMPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(SGSM_PACKET, SGSMPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(SGU_PACKET, SGUsePacket::receive);
    }
}