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

public class BlockConsoleType extends ConsoleTypeSchema {
    public static final Identifier REFERENCE = AdventuresWithTARDISes.id("console/block");
    private static final ControlTypes[] TYPES = new ControlTypes[]{
            new ControlTypes(new ThrottleControl(), EntityDimensions.changing(
                    0.375f,
                    0.3125f
            ),
                    new Vector3f(
                            -2.000000f,
                            0.500000f,
                            1.000000f
                    )),
            new ControlTypes(new HandBrakeControl(), EntityDimensions.changing(
                    0.375f,
                    0.3125f
            ),
                    new Vector3f(
                            -2.000000f,
                            0.500000f,
                            -1.000000f
                    )),
            new ControlTypes(new AutoPilotControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            0.656250f,
                            0.500000f,
                            2.000000f
                    )),
            new ControlTypes(new DoorControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.000000f,
                            0.500000f,
                            0.062500f
                    )),
            new ControlTypes(new DoorControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.000000f,
                            0.500000f,
                            -0.062500f
                    )),
            new ControlTypes(new DoorLockControl(), EntityDimensions.changing(
                    0.1875f,
                    0.0625f
            ),
                    new Vector3f(
                            -0.375000f,
                            0.562500f,
                            2.281250f
                    )),
            new ControlTypes(new AntiGravsControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            -1.093750f,
                            0.500000f,
                            -2.000000f
                    )),
            new ControlTypes(new EngineOverloadControl(), EntityDimensions.changing(
                    0.625f,
                    0.1875f
            ),
                    new Vector3f(
                            -0.000000f,
                            0.437500f,
                            -2.000000f
                    )),
            new ControlTypes(new FastReturnControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            1.937500f,
                            0.500000f,
                            -0.687500f
                    )),
            new ControlTypes(new FastReturnControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.062500f,
                            0.500000f,
                            -0.687500f
                    )),
            new ControlTypes(new ElectricalDischargeControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            0.781250f,
                            0.500000f,
                            -2.000000f
                    )),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(
                    1f,
                    1f
            ),
                    new Vector3f(
                            -0.875000f,
                            1.500000f,
                            -0.000000f
                    )),
            new ControlTypes(new MonitorControl(), EntityDimensions.changing(
                    1f,
                    1f
            ),
                    new Vector3f(
                            1.000000f,
                            1.500000f,
                            -0.000000f
                    )),
            new ControlTypes(new SecurityControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            -1.156250f,
                            0.500000f,
                            2.000000f
                    )),
            new ControlTypes(new TelepathicControl(), EntityDimensions.changing(
                    1f,
                    0.25f
            ),
                    new Vector3f(
                            -1.000000f,
                            0.500000f,
                            1.000000f
                    )),
            new ControlTypes(new LandTypeControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.062500f,
                            0.500000f,
                            -1.312500f
                    )),
            new ControlTypes(new LandTypeControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            1.937500f,
                            0.500000f,
                            -1.312500f
                    )),

            new ControlTypes(new IncrementControl(), EntityDimensions.changing(
                    0.1875f,
                    0.0625f
            ),
                    new Vector3f(
                            -0.093750f,
                            0.562500f,
                            2.156250f
                    )),
            new ControlTypes(new IncrementControl(), EntityDimensions.changing(
                    0.1875f,
                    0.0625f
            ),
                    new Vector3f(
                            0.093750f,
                            0.562500f,
                            2.156250f
                    )),
            new ControlTypes(new XControl(), EntityDimensions.changing(
                    0.125f,
                    0.25f
            ),
                    new Vector3f(
                            -0.250000f,
                            0.562500f,
                            1.812500f
                    )),
            new ControlTypes(new YControl(), EntityDimensions.changing(
                    0.125f,
                    0.25f
            ),
                    new Vector3f(
                            0.000000f,
                            0.562500f,
                            1.812500f
                    )),
            new ControlTypes(new ZControl(), EntityDimensions.changing(
                    0.125f,
                    0.25f
            ),
                    new Vector3f(
                            0.250000f,
                            0.562500f,
                            1.812500f
                    )),
            new ControlTypes(new RandomiserControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.062500f,
                            0.500000f,
                            1.312500f
                    )),
            new ControlTypes(new RandomiserControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            1.937500f,
                            0.500000f,
                            1.312500f
                    )),
            new ControlTypes(new DirectionControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            1.937500f,
                            0.500000f,
                            -1.000000f
                    )),
            new ControlTypes(new DirectionControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.062500f,
                            0.500000f,
                            -1.000000f
                    )),

            new ControlTypes(new HailMaryControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            1.156250f,
                            0.500000f,
                            2.000000f
                    )),
            new ControlTypes(new DimensionControl(), EntityDimensions.changing(
                    1f,
                    0.25f
            ),
                    new Vector3f(
                            1.000000f,
                            0.500000f,
                            -1.000000f
                    )),
            new ControlTypes(new RefuelerControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            -0.781250f,
                            0.500000f,
                            -2.000000f
                    )),
            new ControlTypes(new PowerControl(), EntityDimensions.changing(
                    0.375f,
                    0.3125f
            ),
                    new Vector3f(
                            -2.031250f,
                            0.500000f,
                            0.000000f
                    )),
            new ControlTypes(new SiegeModeControl(), EntityDimensions.changing(
                    0.375f,
                    0.3125f
            ),
                    new Vector3f(
                            -1.875000f,
                            -0.312500f,
                            0.000000f
                    )
            ),
            new ControlTypes(new HADSControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            1.093750f,
                            0.500000f,
                            -2.000000f
                    )),
            new ControlTypes(new MarkWaypointControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.062500f,
                            0.500000f,
                            0.687500f
                    )),
            new ControlTypes(new MarkWaypointControl(), EntityDimensions.changing(
            0.25f,
            0.125f
            ),
            new Vector3f(
                    1.937500f,
                    0.500000f,
                    0.687500f
            )),
            new ControlTypes(new SetWaypointControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            2.062500f,
                            0.500000f,
                            1.000000f
                    )),
            new ControlTypes(new SetWaypointControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            1.937500f,
                            0.500000f,
                            1.000000f
                    )),
            new ControlTypes(new ConsolePortControl(), EntityDimensions.changing(
                    1f,
                    1f
            ),
                    new Vector3f(
                            -1.000000f,
                            -0.500000f,
                            -1.000000f
                    )),
            new ControlTypes(new CloakControl(), EntityDimensions.changing(
                    0.25f,
                    0.25f
            ),
                    new Vector3f(
                            -0.656250f,
                            0.500000f,
                            2.000000f
                    )),
            new ControlTypes(new SonicPortControl(), EntityDimensions.changing(
                    0.2500000000000001f,
                    0.25f
            ),
                    new Vector3f(
                            0.996875f,
                            0.500000f,
                            0.959375f
                    )),
            new ControlTypes(new ShieldsControl(), EntityDimensions.changing(
                    0.25f,
                    0.125f
            ),
                    new Vector3f(
                            0.781250f,
                            0.500000f,
                            -2.031250f
                    ))};

    public BlockConsoleType() {
        super(REFERENCE, "block");
    }

    public ControlTypes[] getControlTypes() {
        return TYPES;
    }

    public ConsoleVariantSchema getDefaultVariant() {
        return AWTConsoleVariantRegistry.BLOCK;
    }

}


