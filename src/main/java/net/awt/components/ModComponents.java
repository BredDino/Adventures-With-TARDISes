package net.awt.components;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import net.awt.AdventuresWithTARDISes;
import net.awt.components.custom.SonicGlassesComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class ModComponents implements EntityComponentInitializer {
    public static final ComponentKey<SonicGlassesComponent> SONIC_GLASSES =
            ComponentRegistry.getOrCreate(new Identifier(AdventuresWithTARDISes.MOD_ID, "sonic_glasses_component"), SonicGlassesComponent.class);


    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry entityComponentFactoryRegistry) {
        entityComponentFactoryRegistry.beginRegistration(PlayerEntity.class, SONIC_GLASSES).end(SonicGlassesComponent::new);
    }
}
