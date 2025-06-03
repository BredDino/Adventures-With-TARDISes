package net.awt.TARDIS.console.types;

import dev.amble.ait.core.tardis.control.ControlTypes;
import dev.amble.ait.core.tardis.control.impl.*;
import dev.amble.ait.core.tardis.control.impl.pos.IncrementControl;
import dev.amble.ait.core.tardis.control.impl.pos.XControl;
import dev.amble.ait.core.tardis.control.impl.pos.YControl;
import dev.amble.ait.core.tardis.control.impl.pos.ZControl;
import dev.amble.ait.core.tardis.control.impl.waypoint.MarkWaypointControl;
import dev.amble.ait.core.tardis.control.impl.waypoint.SetWaypointControl;
import dev.amble.ait.data.schema.console.ConsoleTypeSchema;
import dev.amble.ait.data.schema.console.ConsoleVariantSchema;
import net.awt.AdventuresWithTARDISes;
import net.awt.TARDIS.console.AWTConsoleVariantRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

public class JunkGlassType extends ConsoleTypeSchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("console/junkglass");
    private static final float yoff = 0.15f;
    private static final ControlTypes[] TYPES = new ControlTypes[]{
            new ControlTypes(new ThrottleControl(), EntityDimensions.changing(
                    0.3125f,
                    0.4375f
            ),
                    new Vector3f(
                            0.437500f,
                            0.468750f-yoff,
                            1.412500f
                    )),
            new ControlTypes(new HandBrakeControl(), EntityDimensions.changing(
                    0.375f,
                    0.25f
            ),
                    new Vector3f(
                            -0.437500f,
                            0.625000f-yoff,
                            -1.312500f
                    )),
            new ControlTypes(new AutoPilotControl(), EntityDimensions.changing(
                    0.12499999999999994f,
                    0.125f
            ),
                    new Vector3f(
                            -0.225000f,
                            0.743750f-yoff-0.1f,
                            1.556250f
                    )),
            new ControlTypes(new DoorControl(), EntityDimensions.changing(
                    0.125f,
                    0.25f
            ),
                    new Vector3f(
                            0.787500f,
                            0.618750f-yoff,
                            0.843750f
                    )),
            new ControlTypes(new DoorLockControl(), EntityDimensions.changing(
                    0.1875f,
                    0.1875f
            ),
                    new Vector3f(
                            1.587500f,
                            0.643750f-yoff,
                            0.350000f
                    )),
            new ControlTypes(new AntiGravsControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.725000f,
                            0.768750f-yoff,
                            -0.475000f
                    )),
            new ControlTypes(new EngineOverloadControl(), EntityDimensions.changing(
                    0.0625f,
                    0.0625f
            ),
                    new Vector3f(
                            1.313923f,
                            0.653125f-yoff,
                            0.758594f
                    )),
            new ControlTypes(new FastReturnControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            0.756250f,
                            0.743750f-yoff,
                            -0.625000f
                    )),
            new ControlTypes(new ElectricalDischargeControl(), EntityDimensions.changing(
                    0.125f,
                    0.125f
            ),
                    new Vector3f(
                            1.250000f,
                            0.600000f,
                            -0.706250f
                    )),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(
                    0.5625f,
                    0.4375f
            ),
            new Vector3f(
                    -0.593750f,
                    1.250000f,
                    -0.343750f
            )),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(
                    0.5f,
                    0.375f
            ), new Vector3f(
                    1.062500f,
                    1.812500f,
                    -0.625000f
            )
            ),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            -1.000000f,
                            0.562500f,
                            -0.625000f
                    )
            ),
            new ControlTypes(new SecurityControl(), EntityDimensions.changing(
                    0.12499999999999994f,
                    0.125f
            ),
                    new Vector3f(
                            -0.518750f,
                            0.743750f-yoff-0.1f,
                            1.556250f
                    )),
            new ControlTypes(new TelepathicControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            0.743750f,
                            0.768750f-yoff,
                            0.443750f
                    )),
            new ControlTypes(new LandTypeControl(), EntityDimensions.changing(
                    0.1875f,
                    0.1875f
            ),
                    new Vector3f(
                            -1.131250f,
                            0.681250f-yoff,
                            -1.075000f
                    )),
            new ControlTypes(new IncrementControl(), EntityDimensions.changing(
                    0.1875f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.593750f,
                            0.868750f-yoff,
                            1.025000f
                    )),
            new ControlTypes(new XControl(), EntityDimensions.changing(
                    0.18750000000000058f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.187500f,
                            0.781250f-yoff,
                            0.943750f
                    )),
            new ControlTypes(new YControl(), EntityDimensions.changing(
                    0.18750000000000058f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.000000f,
                            0.781250f-yoff,
                            0.943750f
                    )),
            new ControlTypes(new ZControl(), EntityDimensions.changing(
                    0.18750000000000056f,
                    0.1875f
            ),
                    new Vector3f(
                            0.187500f,
                            0.781250f-yoff,
                            0.943750f
                    )),
            new ControlTypes(new RandomiserControl(), EntityDimensions.changing(
                    0.12500000000000056f,
                    0.1875f
            ),
                    new Vector3f(
                            -1.043750f,
                            0.750000f-yoff,
                            1.075000f
                    )),
            new ControlTypes(new DirectionControl(), EntityDimensions.changing(
                    0.1875f,
                    0.1875f
            ),
                    new Vector3f(
                            0.912500f,
                            0.681250f-yoff,
                            -1.556250f
                    )),
            new ControlTypes(new HailMaryControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.631250f,
                            0.768750f-yoff,
                            -0.631250f
                    )),
            new ControlTypes(new DimensionControl(), EntityDimensions.changing(
                    0.1875f,
                    0.1875f
            ),
                    new Vector3f(
                            1.587500f,
                            0.643750f-yoff,
                            -0.306250f
                    )),
            new ControlTypes(new RefuelerControl(), EntityDimensions.changing(
                    0.12499999999999989f,
                    0.125f
            ),
                    new Vector3f(
                            -0.606250f,
                            0.743750f-yoff-0.1f,
                            1.556250f
                    )),
            new ControlTypes(new PowerControl(), EntityDimensions.changing(
                    0.25f,
                    0.1875f
            ),
                    new Vector3f(
                            1.118750f,
                            0.706250f-yoff,
                            -0.962500f
                    )),
            new ControlTypes(new SiegeModeControl(), EntityDimensions.changing(
                    0.3125f,
                    0.1875f
            ),
                    new Vector3f(
                            -1.500000f,
                            0.281250f-yoff,
                            -0.337500f
                    )
            ),
            new ControlTypes(new HADSControl(), EntityDimensions.changing(
                    0.25f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.856250f,
                            0.743750f-yoff,
                            -0.881250f
                    )),
            new ControlTypes(new MarkWaypointControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            0.850000f,
                            0.743750f-yoff,
                            -0.487500f
                    )),
            new ControlTypes(new SetWaypointControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            0.931250f,
                            0.743750f-yoff,
                            -0.362500f
                    )),
            new ControlTypes(new ConsolePortControl(), EntityDimensions.changing(0.125F, 0.1125F), new Vector3f(0.0015624892F, 0.73750055F, -0.7953125F)),
            new ControlTypes(new CloakControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.850000f,
                            0.768750f-yoff,
                            -0.212500f
                    )),
            new ControlTypes(new SonicPortControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            -1.437500f,
                            0.687500f-yoff,
                            0.000000f
                    )),
            new ControlTypes(new ShieldsControl(), EntityDimensions.changing(
                    0.125f,
                    0.1875f
            ),
                    new Vector3f(
                            -1.000000f,
                            0.750000f-yoff,
                            1.168750f
                    ))};

    public JunkGlassType() {
        super(REFERENCE, "junkglass");
    }

    public ControlTypes[] getControlTypes() {
        return TYPES;
    }

    public ConsoleVariantSchema getDefaultVariant() {
        return AWTConsoleVariantRegistry.JUNKGLASS;
    }

}


