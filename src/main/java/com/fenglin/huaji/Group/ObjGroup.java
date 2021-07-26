package com.fenglin.huaji.Group;

import com.fenglin.huaji.Item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ObjGroup extends ItemGroup {
    public ObjGroup() {
        super("huaji_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.HUAJI.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public net.minecraft.util.ResourceLocation getBackgroundImage() {
        return new net.minecraft.util.ResourceLocation("huaji:textures/gui/container/creative_inventory/tab_item_search.png");
    }
}
