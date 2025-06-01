package net.awt.screens;

import net.awt.AdventuresWithTARDISes;
import net.awt.networking.ModPackets;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.ToggleButtonWidget;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class VortexManipulatorScreen extends Screen {
    public VortexManipulatorScreen() {
        super(Text.literal("Vortex Manipulator"));
    }

    public ButtonWidget teleport;
    public TextFieldWidget dimension;
    public TextFieldWidget x;
    public TextFieldWidget y;
    public TextFieldWidget z;
    public ToggleButtonWidget surface;

    @Override
    protected void init() {
        teleport = ButtonWidget.builder(Text.literal("Teleport"), button -> {
                    ClientPlayNetworking.send(ModPackets.VM_PACKET, new PacketByteBuf(PacketByteBufs.create()
                            .writeString(dimension.getText())
                            .writeDouble(getValue(x.getText(), client.player.getX()))
                            .writeDouble(getValue(y.getText(), client.player.getY()))
                            .writeDouble(getValue(z.getText(), client.player.getZ()))

                    ));
        })
                .dimensions(width/2 -90, 240 ,180 ,20)
                .build();

        dimension = new TextFieldWidget(textRenderer,width/2 -90, 80, 180, 20, Text.literal("meow"));
        x = new TextFieldWidget(textRenderer,width/2 -90, 120, 90, 20, Text.literal("x"));
        y = new TextFieldWidget(textRenderer,width/2 -90, 160, 90, 20, Text.literal("y"));
        z = new TextFieldWidget(textRenderer,width/2 -90, 200, 90, 20, Text.literal("z"));

        surface = new ToggleButtonWidget(width/2 +90, 160, 20, 20, false);

        addDrawableChild(teleport);
        addDrawableChild(dimension);
        addDrawableChild(x);
        addDrawableChild(y);
        addDrawableChild(z);
        //addDrawable(surface); this crashes the game for some reason


    }

    private double getValue(String text, double defaultValue) {
        if (text == null || text.trim().isEmpty()) return defaultValue;
        try {
            return Double.parseDouble(text.trim());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawTexture(new Identifier(AdventuresWithTARDISes.MOD_ID, "textures/img.png"), width/2-100, height/2-100, 0, 0, 200, 200);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
