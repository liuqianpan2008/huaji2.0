package com.fenglin.huaji.block.FurnaceHuaji;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

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
    @Override
    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (!p_225533_2_.isClientSide && p_225533_5_ == Hand.MAIN_HAND) {
            FurnaceEntity FurnaceEntity = (FurnaceEntity) p_225533_2_.getBlockEntity(p_225533_3_);
            NetworkHooks.openGui((ServerPlayerEntity) p_225533_4_, (INamedContainerProvider) FurnaceEntity, (PacketBuffer packerBuffer) -> {
                packerBuffer.writeBlockPos(FurnaceEntity.getBlockPos());
            });
        }
        return ActionResultType.SUCCESS;
    }
}
