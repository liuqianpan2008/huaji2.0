package com.fenglin.huaji.block.FurnaceHuaji;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CryingObsidianBlock;
import net.minecraft.block.ObserverBlock;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.swing.*;

public class FurnaceHuaji extends Block {

    public FurnaceHuaji() {
        super(Properties
                .of(Material.STONE)
                .strength(30)
        );
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new FurnaceEntity();
    }
}
