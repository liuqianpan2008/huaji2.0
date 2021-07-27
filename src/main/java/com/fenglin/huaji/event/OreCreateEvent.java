package com.fenglin.huaji.event;

import com.fenglin.huaji.world.Ore;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreCreateEvent {
    @SubscribeEvent
    public static void onBiomeLoading(final BiomeLoadingEvent biome) {
        if (biome.getCategory() == Biome.Category.NETHER || biome.getCategory() == Biome.Category.THEEND)
            return;

        biome.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES)
                .add(() -> Ore.ORE_HUAJI);
    }
}