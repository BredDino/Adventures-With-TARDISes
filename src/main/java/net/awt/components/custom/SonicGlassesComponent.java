package net.awt.components.custom;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.tick.CommonTickingComponent;
import net.awt.components.ModComponents;
import net.awt.components.PlayerComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public class SonicGlassesComponent extends PlayerComponent implements CommonTickingComponent {
    PlayerEntity player;
    public SonicGlassesComponent(PlayerEntity owner) {
        super(owner);
        player=owner;
    }

    @Override
    public ComponentKey<? extends PlayerComponent> getComponent() {
        return ModComponents.SONIC_GLASSES;
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound) {

    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound) {

    }

    @Override
    public void tick() {

    }
}
