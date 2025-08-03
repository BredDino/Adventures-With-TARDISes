package net.awt.TARDIS.exterior.category.custom;

import dev.amble.ait.data.schema.exterior.ExteriorCategorySchema;
import net.awt.AWTDevTeam;
import net.awt.AdventuresWithTARDISes;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class AWTExclusiveCategory extends ExteriorCategorySchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("exterior/awt-exclusive");

    public AWTExclusiveCategory() {
        super(REFERENCE, "awt-exclusive");
    }

    public static boolean isUnlocked(UUID uuid) {
        return AWTDevTeam.isDev(uuid);
    }
}
