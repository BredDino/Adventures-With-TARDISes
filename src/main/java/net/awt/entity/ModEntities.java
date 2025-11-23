package net.awt.entity;

import net.awt.AdventuresWithTARDISes;
import net.awt.entity.custom.CybermatEntity;
import net.awt.entity.custom.K9Entity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<K9Entity> K9 = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(AdventuresWithTARDISes.MOD_ID,"k9"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, K9Entity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<CybermatEntity> CYBERMAT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(AdventuresWithTARDISes.MOD_ID,"cybermat"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, K9Entity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
