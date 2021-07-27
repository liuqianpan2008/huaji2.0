package com.fenglin.huaji.block.FurnaceHuaji;

import com.fenglin.huaji.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeRegistry {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Utils.MOD_ID);
    public static final RegistryObject<ContainerType<Gui_furnacehuaji>> Gui_furnacehuaji = CONTAINERS.register("Gui_furnacehuaji",
            () -> IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data)
                    -> new Gui_furnacehuaji(windowId, inv, data.readBlockPos(), Minecraft.getInstance().level, new FirstContainerItemNumber())));

}
