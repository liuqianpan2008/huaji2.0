package com.fenglin.huaji.block.FurnaceHuaji;
import com.fenglin.huaji.Utils;
import com.fenglin.huaji.block.TileEntityTypeRegistry;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class FurnaceEntity extends TileEntity  implements ITickableTileEntity, INamedContainerProvider {
    int counter=0;
    private Inventory inventory = new Inventory(1);
    private FirstContainerItemNumber itemNumber = new FirstContainerItemNumber();
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

    public FurnaceEntity() {
        super(TileEntityTypeRegistry.HUAJI_FURNACE.get());
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("gui." + Utils.MOD_ID + ".huaji_furnace");
    }

    @Nullable
    @Override
    public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
        return new Gui_furnacehuaji(p_createMenu_1_, p_createMenu_3_.inventory, this.worldPosition, this.level, itemNumber);
        //return new FirstContainerItemNumber(p_createMenu_1_,this.getBlockPos(),this.getLevel(),itemNumber);
    }

    @Override
    public void tick() {
        this.itemNumber.set(0, this.inventory.getItem(0).getCount());
    }
    public Inventory getInventory() {
        return inventory;
    }
}
