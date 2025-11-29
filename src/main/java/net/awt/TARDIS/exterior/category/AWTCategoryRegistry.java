package net.awt.TARDIS.exterior.category;

import dev.amble.ait.data.schema.exterior.ExteriorCategorySchema;
import dev.amble.ait.registry.impl.CategoryRegistry;
import net.awt.TARDIS.exterior.category.custom.AWTExclusiveCategory;

public class AWTCategoryRegistry {
    public static ExteriorCategorySchema AWTEXCLUSIVE;

    public static void init() {}

    public static void defaults() {
        AWTEXCLUSIVE = CategoryRegistry.getInstance().register(new AWTExclusiveCategory());
    }
}
