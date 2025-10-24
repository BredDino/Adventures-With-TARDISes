package net.awt.item.custom.dbzscouter;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.awt.AdventuresWithTARDISes;
import net.awt.item.ModItems;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.RotationAxis;

import java.util.Optional;

public class DBZScouterOverlay implements HudRenderCallback {
    private String namespace = AdventuresWithTARDISes.MOD_ID + "/textures/overlay/sonic_glasses/";

    private ItemStack equippedStack = Items.AIR.getDefaultStack();

    @Override
    public void onHudRender(DrawContext drawContext, float v) {
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        if (hasEquipped(player, ModItems.SONIC_GLASSES) && equippedStack.getOrCreateNbt().getDouble("fuel") > 0) {
            MatrixStack matrixStack = drawContext.getMatrices();
            RenderSystem.enableBlend();
            RenderSystem.setShaderColor(1,1,1, 0.5f);
            matrixStack.push();
            matrixStack.translate(drawContext.getScaledWindowWidth(), 0, 0);
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((player.getWorld().getTime() % 360)));
            matrixStack.scale(1.25f,1.25f,1.25f);
            drawContext.drawTexture(new Identifier(AdventuresWithTARDISes.MOD_ID, "textures/overlay/sonic_glasses/symbol.png"), -128, -128, 0, 0, 256, 256);
            matrixStack.pop();
            RenderSystem.setShaderColor(1,1,1, 1f);
            RenderSystem.disableBlend();

            RenderSystem.enableBlend();
            RenderSystem.setShaderColor(1 +getRandomDBE(),1 +getRandomDBE(),1 +getRandomDBE(), doDeadBatteryEffect() ? Math.max((float) Math.random(), 0.75f) : 1);

            Entity entity = MinecraftClient.getInstance().getCameraEntity();
            HitResult blockHit = entity.raycast(5.0, 0.0F, false);
            if (blockHit.getType() == HitResult.Type.BLOCK) {
                BlockPos posOfTargetedBlock = ((BlockHitResult) blockHit).getBlockPos();
                Block targetBlock = player.getWorld().getBlockState(new BlockPos((int) posOfTargetedBlock.getX(), (int) posOfTargetedBlock.getY(), (int) posOfTargetedBlock.getZ())).getBlock();
                matrixStack.push();
                if (doDeadBatteryEffect()) matrixStack.translate(Math.random()>0.95 ? 1 : 0, Math.random()>0.95 ? 1 : 0,0);

                matrixStack.translate(drawContext.getScaledWindowWidth(), 8,0);
                matrixStack.scale(1.25f, 1.25f, 1.25f);
                Text text = Text.of("X: " + posOfTargetedBlock.getX() + " Y: " + posOfTargetedBlock.getY() + " Z: " + posOfTargetedBlock.getZ());
                int k = MinecraftClient.getInstance().textRenderer.getWidth(text.getString());
                drawContext.drawItem(targetBlock.asItem().getDefaultStack(), -20 - k -2, 0);
                drawContext.drawText(MinecraftClient.getInstance().textRenderer, text, -k -2,4, ColorHelper.Argb.getArgb(1, 33, 220, 255), true);
                matrixStack.pop();

            }

            Text fueltext = Text.of("AU: " + equippedStack.getOrCreateNbt().getDouble("fuel"));
            matrixStack.push();
            if (doDeadBatteryEffect()) matrixStack.translate(Math.random()>0.95 ? 1 : 0, Math.random()>0.95 ? 1 : 0,0);

            matrixStack.translate(drawContext.getScaledWindowWidth(), 4,0);
            matrixStack.scale(1, 1, 1);
            int k = MinecraftClient.getInstance().textRenderer.getWidth(fueltext.getString());
            drawContext.drawText(MinecraftClient.getInstance().textRenderer, fueltext, -k -2,0, ColorHelper.Argb.getArgb(1, 252, 249, 57), true);
            matrixStack.pop();
            RenderSystem.setShaderColor(1,1,1, 1f);
            RenderSystem.disableBlend();
        }
    }

    private boolean doDeadBatteryEffect() {
        return equippedStack.getOrCreateNbt().getDouble("fuel") < 250;
    }

    private float getRandomDBE() {
        return doDeadBatteryEffect() ? (float) (Math.random() - 0.5) *0.5f : 0;
    }

    public boolean hasEquipped(PlayerEntity player, Item item) {
        Optional<TrinketComponent> trinketComponent = TrinketsApi.getTrinketComponent(player);

        if (trinketComponent.isPresent()) {
            return trinketComponent.get().isEquipped(stack -> {
                if (stack.isOf(item)) {
                    this.equippedStack = stack;
                }
                return stack.isOf(item);
            });
        }

        return false;
    }


}
