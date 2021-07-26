package com.fenglin.huaji;

import com.fenglin.block.BlockRegistry;
import com.fenglin.huaji.Item.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class huaji {
    public huaji(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
