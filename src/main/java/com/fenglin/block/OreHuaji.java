package com.fenglin.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreHuaji extends Block {
    public OreHuaji() {
        super(Properties.of(Material.DECORATION).harvestLevel(3).harvestTool(ToolType.PICKAXE));
    }
}
