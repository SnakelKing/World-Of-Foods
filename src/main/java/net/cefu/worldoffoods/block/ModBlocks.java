package net.cefu.worldoffoods.block;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.block.custom.ArtichokeCropBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.neoforged.neoforge.registries.DeferredRegister;



public class ModBlocks {

    public static final DeferredBlock<Block> ARTICHOKE_CROP = Blocks.register("artichoke_crop",
            () -> ArtichokeCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEETROOTS)));



    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(WorldOfFoods.MOD_ID);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
