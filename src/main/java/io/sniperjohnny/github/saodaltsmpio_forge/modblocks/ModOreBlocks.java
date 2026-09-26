package io.sniperjohnny.github.saodaltsmpio_forge.modblocks;

import io.sniperjohnny.github.saodaltsmpio_forge.Saodaltsmpio_Forge;
import io.sniperjohnny.github.saodaltsmpio_forge.moditems.ModBlockItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModOreBlocks {
    public static final DeferredRegister<Block> ORE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Saodaltsmpio_Forge.MOD_ID);


    public static final RegistryObject<Block> CRYSTALLITE_BLOCK = registerBlock("crystallite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ORE_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModBlockItems.BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        ORE_BLOCKS.register(eventBus);
    }
}
