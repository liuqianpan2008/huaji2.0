package com.fenglin.huaji.block.FurnaceHuaji;

import com.fenglin.huaji.Utils;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;



public class FurnaceScreen extends ContainerScreen<FurnaceContainer> {
    private final ResourceLocation OBSIDIAN_CONTAINER_RESOURCE = new ResourceLocation(Utils.MOD_ID, "textures/gui/container.png");
    private final int textureWidth = 176;
    private final int textureHeight = 166;

    public FurnaceScreen(FurnaceContainer p_i51105_1_, PlayerInventory p_i51105_2_, ITextComponent p_i51105_3_) {
        super(p_i51105_1_, p_i51105_2_, p_i51105_3_);
        this.imageWidth = textureWidth;
        this.imageHeight = textureHeight;

    }
    @Override
    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        renderBackground(p_230430_1_);
        super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        //renderHoveredTooltip(matrixStack, mouseX, mouseY);

    }
    @Override
    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        this.renderBackground(p_230450_1_);
        this.minecraft.getTextureManager().bind(OBSIDIAN_CONTAINER_RESOURCE);
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
        blit(p_230450_1_, i, j, 0, 0, p_230450_3_, p_230450_4_, this.textureWidth, textureHeight);
    }

    //    @Override
    //    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int x, int y) {
    //drawCenteredString(p_230451_1_, this.font, Integer.toString(this.menu.getIntArray().get(0)), 82, 20, 0xeb0505);




}
