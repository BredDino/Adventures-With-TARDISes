package net.awt;


import net.awt.block.ModBlocks;
import net.awt.monitors.AWTMonitorBlockEntity;
import dev.amble.lib.container.impl.BlockEntityContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.minecraft.block.entity.BlockEntityType;


public class AWTBlockEntityTypes implements BlockEntityContainer{

    public static BlockEntityType<AWTMonitorBlockEntity> AWT_MONITOR_BLOCK_ENTITY_TYPE = FabricBlockEntityTypeBuilder
            .create(AWTMonitorBlockEntity::new, ModBlocks.AWT_TRUSTABLE_MONITOR_BLOCK).build();

    }
