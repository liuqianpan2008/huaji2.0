package com.fenglin.huaji.block.FurnaceHuaji;

import com.fenglin.huaji.block.BlockRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.util.IIntArray;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class FurnaceContainer extends Container {
    private IIntArray intArray;
    protected FurnaceContainer(int id, PlayerInventory playerInventory, BlockPos pos, World world, FurnaceItemNumber intArray) {
        super(ContainerTypeRegistry.obsidianFirstContainer.get(), id);
        this.intArray=intArray;
        addDataSlots(intArray);
        FurnaceEntity FurnaceEntity = (FurnaceEntity) world.getBlockEntity(pos);
        this.addSlot(new Slot(FurnaceEntity.getInventory(), 0, 80, 32));
        layoutPlayerInventorySlots(playerInventory, 8, 84);

    }

    private int addSlotRange(IInventory inventory, int index, int x, int y, int amount, int dx) {
        for (int i = 0; i < amount; i++) {
            addSlot(new Slot(inventory, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    private int addSlotBox(IInventory inventory, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0; j < verAmount; j++) {
            index = addSlotRange(inventory, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    private void layoutPlayerInventorySlots(IInventory inventory, int leftCol, int topRow) {
        // Player inventory
        addSlotBox(inventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(inventory, 0, leftCol, topRow, 9, 18);
    }

    public IIntArray getIntArray() {
        return intArray;
    }
    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return false;
    }
}
