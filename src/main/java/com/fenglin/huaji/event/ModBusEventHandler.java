package com.fenglin.huaji.event;

import com.fenglin.huaji.block.FurnaceHuaji.ContainerTypeRegistry;
import com.fenglin.huaji.block.FurnaceHuaji.FurnacehuajiScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEventHandler {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ScreenManager.register(ContainerTypeRegistry.Gui_furnacehuaji.get(), FurnacehuajiScreen::new);
        });
    }
}
