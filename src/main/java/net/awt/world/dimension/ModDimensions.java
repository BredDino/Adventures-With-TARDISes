package net.awt.world.dimension;
import net.awt.AdventuresWithTARDISes;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> SKARO_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "skaro"));
    public static final RegistryKey<World> SKARO_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "skaro"));
    public static final RegistryKey<DimensionType> SKARO_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(AdventuresWithTARDISes.MOD_ID, "skaro_type"));

  //  public static final RegistryKey<DimensionOptions> ABANDONEDOVERWORLD_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
   //         new Identifier(AdventuresWithTARDISes.MOD_ID, "abandonedoverworld"));
  //  public static final RegistryKey<World> ABANDONEDOVERWORLD_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
   //         new Identifier(AdventuresWithTARDISes.MOD_ID, "abandonedoverworld"));
   // public static final RegistryKey<DimensionType> ABANDONEDOVERWORLD_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
    //        new Identifier(AdventuresWithTARDISes.MOD_ID, "abandonedoverworld_type"));


    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(SKARO_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));

       // context.register(ABANDONEDOVERWORLD_DIM_TYPE, new DimensionType(
       //         OptionalLong.of(12000), // fixedTime
       //        false, // hasSkylight
         //       false, // hasCeiling
         //       false, // ultraWarm
         //       true, // natural
          //      1.0, // coordinateScale
          //      true, // bedWorks
         //       false, // respawnAnchorWorks
          //      0, // minY
          //      256, // height
          //      256, // logicalHeight
           //     BlockTags.INFINIBURN_OVERWORLD, // infiniburn
           //     DimensionTypes.OVERWORLD_ID, // effectsLocation
           //     1.0f, // ambientLight
           //     new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}