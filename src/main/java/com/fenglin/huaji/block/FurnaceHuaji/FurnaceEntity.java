package com.fenglin.huaji.block.FurnaceHuaji;
import com.fenglin.huaji.block.TileEntityTypeRegistry;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

public class FurnaceEntity extends TileEntity   {
    int counter=0;
    public FurnaceEntity() {
        super(TileEntityTypeRegistry.HUAJI_FURNACE.get());
    }
    public int increase() {
        counter++;
        return counter;
    }

    //写NBT
    @Override
    public CompoundNBT save(CompoundNBT p_189515_1_) {
        p_189515_1_.putInt("counter", counter);
        return super.save(p_189515_1_);
    }
    //读NBT
    @Override
    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        counter = p_230337_2_.getInt("counter");
        super.load(p_230337_1_, p_230337_2_);
    }
}
