package com.fenglin.huaji.block;

import com.fenglin.huaji.Utils;
import com.fenglin.huaji.block.FurnaceHuaji.FurnaceEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<FurnaceEntity>> HUAJI_FURNACE = TILE_ENTITIES.register("huaji_furnace",
            () -> TileEntityType.Builder.of(FurnaceEntity::new, BlockRegistry.FURNACEHUAJI.get()).build(null));
}
