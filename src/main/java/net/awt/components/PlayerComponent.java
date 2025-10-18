package net.awt.components;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public abstract class PlayerComponent implements AutoSyncedComponent {
    protected final PlayerEntity owner;

    public PlayerComponent(PlayerEntity owner) {
        this.owner = owner;
    }

    public PlayerEntity getOwner() {
        return owner;
    }

    public abstract ComponentKey<? extends PlayerComponent> getComponent();

    public void sync() {
        this.sync(false);
    }

    public void sync(boolean verbose) {
        this.getComponent().sync(this.owner);

        if (verbose) {
            owner.sendMessage(Text.literal("Syncing...").formatted(Formatting.GRAY));
        }
    }

    public World getWorld() {
        return this.owner.getWorld();
    }
}