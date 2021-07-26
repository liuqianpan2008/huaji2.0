package com.fenglin.huaji.Item;

import com.fenglin.block.BlockRegistry;
import com.fenglin.huaji.Group.ModGroup;
import com.fenglin.huaji.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> HUAJI = ITEMS.register("huaji", objhuaji::new);

    public static final RegistryObject<Item> ORE_HUAJI = ITEMS.register("ore_huaji", () -> new BlockItem(BlockRegistry.ORK_HUAJI.get(), new Item.Properties().tab(ModGroup.itemGroup)));

}
