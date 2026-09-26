package io.sniperjohnny.github.saodaltsmpio_forge.moditems;

import io.sniperjohnny.github.saodaltsmpio_forge.Saodaltsmpio_Forge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeItems {

    public static final DeferredRegister<Item> RECIPE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Saodaltsmpio_Forge.MOD_ID);

    public static final RegistryObject<Item> CRYSTALLITE_ORE = RECIPE_ITEMS.register("crystallite_ore",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> METALL = RECIPE_ITEMS.register("metall",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_LEATHER_STICK = RECIPE_ITEMS.register("reinforced_leather_stick",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> METALL_SCRAP = RECIPE_ITEMS.register("metall_scrap",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTALLITE_INGOT = RECIPE_ITEMS.register("crystallite_ingot",
            () ->  new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        RECIPE_ITEMS.register(eventBus);
    }
}
