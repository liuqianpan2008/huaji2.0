package com.fenglin.huaji.event;


import com.fenglin.huaji.block.FurnaceHuaji.ContainerTypeRegistry;
import com.fenglin.huaji.block.FurnaceHuaji.FurnaceScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//GUI绑定
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEventHandler {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ScreenManager.register(ContainerTypeRegistry.obsidianFirstContainer.get(), FurnaceScreen::new);
        });
    }
}
