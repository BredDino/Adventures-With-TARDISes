package net.awt.screens;

import net.awt.AdventuresWithTARDISes;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class VortexManipulatorScreen extends Screen {
    public VortexManipulatorScreen() {
        super(Text.literal("Vortex Manipulator"));
    }

    public ButtonWidget button1;
    public TextFieldWidget button2;

    @Override
    protected void init() {
        button1 = ButtonWidget.builder(Text.literal("Teleport"), button -> {
            System.out.println("You clicked button");
        })
                .dimensions(width/2 -90, 240 ,180 ,20)
                .build();

        button2 = new TextFieldWidget(textRenderer,width/2 -90, 80, 180, 20, Text.literal("meow"));


    }

    @Override
    public void renderBackground(DrawContext context) {
        super.renderBackground(context);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawTexture(new Identifier(AdventuresWithTARDISes.MOD_ID, "textures/img.png"), width/2-100, height/2-100, 0, 0, 200, 200);
        addDrawableChild(button2);
        addDrawableChild(button1);
        super.render(context, mouseX, mouseY, delta);
    }
}
