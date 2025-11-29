package net.awt.networking.packets;

import dev.amble.ait.core.AITSounds;
import dev.amble.ait.core.item.SonicItem;
import dev.amble.ait.core.item.sonic.SonicMode;
import dev.amble.ait.core.tardis.Tardis;
import dev.amble.ait.core.tardis.control.impl.DirectionControl;
import dev.amble.ait.core.tardis.handler.travel.TravelUtil;
import dev.amble.ait.core.world.TardisServerWorld;
import dev.amble.lib.data.CachedDirectedGlobalPos;
import net.awt.components.ModComponents;
import net.awt.components.custom.SonicGlassesComponent;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationPropertyHelper;



public class SGUsePacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {

        BlockPos hitPos = buf.readBlockPos();
        boolean foundHitPos = buf.readBoolean();

        if (ModComponents.SONIC_GLASSES.maybeGet(player).isPresent() && ModComponents.SONIC_GLASSES.get(player).equipped && ModComponents.SONIC_GLASSES.get(player).equippedStack.getOrCreateNbt().getInt("fuel") > 0) {
            SonicGlassesComponent sonicGlassesComponent = ModComponents.SONIC_GLASSES.get(player);
            SonicMode sonicMode = sonicGlassesComponent.sonicMode;
            ServerWorld world = player.getServerWorld();
            ItemStack glasses = sonicGlassesComponent.equippedStack;
            Tardis tardis = SonicItem.getTardisStatic(world, glasses);

            if (sonicGlassesComponent.cooldown > 0) {
                return;
            } else {
                sonicGlassesComponent.cooldown = 20;
            }

            //
            if (sonicMode == SonicMode.Modes.TARDIS) {
                if (foundHitPos) {
                    if (tardis != null) {
                            if (tardis.getFuel() <= (double)0.0F) {
                                player.sendMessage(Text.translatable("message.ait.remoteitem.warning1"));
                            }

                            if (tardis.isRefueling()) {
                                player.sendMessage(Text.translatable("message.ait.remoteitem.cancel.refuel"));
                            }

                            CachedDirectedGlobalPos currentPosition = tardis.travel().position();
                            if (currentPosition.getPos().equals(hitPos)) {
                                return;
                            } else {
                                if (!TardisServerWorld.isTardisDimension((ServerWorld)world)) {
                                    world.playSound((PlayerEntity)null, hitPos, AITSounds.REMOTE, SoundCategory.BLOCKS);
                                    BlockPos temp = hitPos.up();
                                    if (world.getBlockState(hitPos).isReplaceable()) {
                                        temp = hitPos;
                                    }

                                    tardis.travel().speed((Integer)tardis.travel().maxSpeed().get());
                                    TravelUtil.travelTo(tardis, CachedDirectedGlobalPos.create(world, temp, DirectionControl.getGeneralizedRotation(RotationPropertyHelper.fromYaw(player.getBodyYaw()))));
                                    sonicGlassesComponent.cooldown = 60*20;
                                } else {
                                    world.playSound((PlayerEntity)null, hitPos, (SoundEvent) SoundEvents.BLOCK_NOTE_BLOCK_BIT.value(), SoundCategory.BLOCKS, 1.0F, 0.2F);
                                    player.sendMessage(Text.translatable("message.ait.remoteitem.warning3"), true);
                                }

                                return;
                        }
                    }
                }
            }
            //

        }


    }

}
