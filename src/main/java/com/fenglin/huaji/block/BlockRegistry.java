package com.fenglin.huaji.block;

import com.fenglin.huaji.Utils;
import com.fenglin.huaji.block.FurnaceHuaji.FurnaceHuaji;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> ORK_HUAJI = BLOCKS.register("ore_huaji", OreHuaji::new);

    public static final RegistryObject<Block> FURNACEHUAJI = BLOCKS.register("furnace_huaji", FurnaceHuaji::new);

}
