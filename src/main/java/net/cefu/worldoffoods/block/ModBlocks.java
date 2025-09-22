package net.cefu.worldoffoods.block;

import net.cefu.worldoffoods.WorldOfFoods;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {





    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(WorldOfFoods.MOD_ID);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
