package com.fenglin.huaji.block.FurnaceHuaji;

import com.fenglin.huaji.Utils;
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
    private static Inventory inventory = new Inventory(1);//一个只有1个「Slot（槽位）」的「Inventory（物品栏）」
    private FurnaceItemNumber ItemNumber =new FurnaceItemNumber();

    public FurnaceEntity() {
        super(TileEntityTypeRegistry.HUAJI_FURNACE.get());
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("gui." + Utils.MOD_ID + ".furnace_huaji");
    }

    @Nullable
    @Override
    public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
        //int sycID, PlayerInventory inventory, PlayerEntity player
        return new FurnaceContainer(p_createMenu_1_, p_createMenu_2_, this.worldPosition, this.level, ItemNumber);

    }

    @Override
    public void tick() {
        if (this.getLevel().isClientSide){
            this.ItemNumber.set(0,this.inventory.getItem(0).getCount());
        }
    }

    public static Inventory getInventory() {
        return inventory;
    }
    //写NBT
    @Override
    public CompoundNBT save(CompoundNBT p_189515_1_) {
        //.putInt("counter", counter);
        return super.save(p_189515_1_);
    }
    //读NBT
    @Override
    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        //counter = p_230337_2_.getInt("counter");
        super.load(p_230337_1_, p_230337_2_);
    }
}
