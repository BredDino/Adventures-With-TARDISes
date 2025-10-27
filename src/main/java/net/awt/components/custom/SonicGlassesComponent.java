package net.awt.components.custom;

import dev.amble.ait.core.AITSounds;
import dev.amble.ait.core.item.sonic.SonicMode;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.tick.CommonTickingComponent;
import net.awt.components.ModComponents;
import net.awt.components.PlayerComponent;
import net.awt.item.ModItems;
import net.awt.item.custom.sonicglasses.SonicGlasses;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;

import java.util.Optional;

public class SonicGlassesComponent extends PlayerComponent implements CommonTickingComponent {
    PlayerEntity player;
    public SonicMode sonicMode;
    public Boolean equipped;
    public ItemStack equippedStack;
    public int fuel;

    public SonicGlassesComponent(PlayerEntity owner) {
        super(owner);
        player=owner;
        sonicMode = SonicMode.Modes.INACTIVE;
    }

    @Override
    public ComponentKey<? extends PlayerComponent> getComponent() {
        return ModComponents.SONIC_GLASSES;
    }

    public void nextMode() {
        sonicMode = SonicMode.Modes.next(sonicMode);
        player.sendMessage(sonicMode.text(), true);
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound) {
        sonicMode = SonicMode.Modes.getAndWrap(nbtCompound.getInt("mode"));
        equipped = nbtCompound.getBoolean("sg_equipped");
        fuel = nbtCompound.getInt("fuel");
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound) {
        nbtCompound.putInt("mode", sonicMode.index());
        nbtCompound.putInt("fuel", fuel);
        if (this.equipped != null) nbtCompound.putBoolean("sg_equipped", equipped);
    }

    public boolean hasEquipped(PlayerEntity player, Item item) {
        Optional<TrinketComponent> trinketComponent = TrinketsApi.getTrinketComponent(player);

        if (trinketComponent.isPresent()) {
            return trinketComponent.get().isEquipped(stack -> {
                if (stack.isOf(item)) {
                    this.equippedStack = stack;
                }
                return stack.isOf(item);
            });
        }

        return false;
    }

    @Override
    public void tick() {
        this.equipped = hasEquipped(player, ModItems.SONIC_GLASSES);
        if (equippedStack != null) {
            fuel = equippedStack.getOrCreateNbt().getInt("fuel");
        }
    }

    @Override
    public void serverTick() {
        CommonTickingComponent.super.serverTick();
        this.sync();
    }
}
