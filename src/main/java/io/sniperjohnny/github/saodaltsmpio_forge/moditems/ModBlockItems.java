package io.sniperjohnny.github.saodaltsmpio_forge.moditems;

import io.sniperjohnny.github.saodaltsmpio_forge.Saodaltsmpio_Forge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockItems {

    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Saodaltsmpio_Forge.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCK_ITEMS.register(eventBus);
    }
}
