package io.sniperjohnny.github.saodaltsmpio_forge.modcreativemodetabs;

import io.sniperjohnny.github.saodaltsmpio_forge.Saodaltsmpio_Forge;
import io.sniperjohnny.github.saodaltsmpio_forge.modblocks.ModOreBlocks;
import io.sniperjohnny.github.saodaltsmpio_forge.moditems.ModRecipeItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModSaoCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Saodaltsmpio_Forge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SAO_RECIPE_ITEMS_TAB = CREATIVE_MODE_TABS.register("sao_recipe_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModRecipeItems.CRYSTALLITE_ORE.get()))
                    .title(Component.translatable("creativetab.sao_recipe_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModRecipeItems.CRYSTALLITE_ORE.get());
                        pOutput.accept(ModRecipeItems.CRYSTALLITE_INGOT.get());
                        pOutput.accept(ModRecipeItems.REINFORCED_LEATHER_STICK.get());
                        pOutput.accept(ModRecipeItems.METALL.get());
                        pOutput.accept(ModRecipeItems.METALL_SCRAP.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> SAO_BLOCK_ITEMS_TAB = CREATIVE_MODE_TABS.register("sao_block_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModOreBlocks.CRYSTALLITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.sao_block_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModOreBlocks.CRYSTALLITE_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
