package com.fenglin.huaji.world;
import com.fenglin.huaji.block.BlockRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ore {
    public static ConfiguredFeature<?, ?> ORE_HUAJI;

    /**
     * BASE_STONE_OVERWORLD 主世界
     * BASE_STONE_NETHER 末地
     * NETHERRACK 地狱
     */
    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event) {
        ORE_HUAJI = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "ore_malachite",
                Feature.ORE.configured(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.ORK_HUAJI.get().defaultBlockState(), 8//最多数量
                                //getDefaultState
                        )
                ).range(70).squared().count(20)
        );

    }

}


