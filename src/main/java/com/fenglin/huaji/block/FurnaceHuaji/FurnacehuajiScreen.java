package com.fenglin.huaji.block.FurnaceHuaji;

import com.fenglin.huaji.Utils;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;


public class FurnacehuajiScreen extends ContainerScreen<Gui_furnacehuaji> {
    private final ResourceLocation OBSIDIAN_CONTAINER_RESOURCE = new ResourceLocation(Utils.MOD_ID, "textures/gui/container.png");
    private final int textureWidth = 176;
    private final int textureHeight = 166;
    @Override
    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        renderBackground(p_230430_1_);
        super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        renderTooltip(p_230430_1_,p_230430_2_,p_230430_3_);
    }
    public FurnacehuajiScreen(Gui_furnacehuaji screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.imageWidth = textureWidth;
        this.imageHeight = textureHeight;
    }
    @Override
    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        this.renderBackground(p_230450_1_);
        this.minecraft.getTextureManager().bind(OBSIDIAN_CONTAINER_RESOURCE);
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.textureHeight) / 2;
        blit(p_230450_1_, i, j, 0, 0, imageWidth, textureHeight, this.textureWidth, textureHeight);
    }
}
