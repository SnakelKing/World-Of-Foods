package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.block.ModBlocks;
import net.cefu.worldoffoods.block.custom.ArtichokeCropBlock;
import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.Set;

public class ModBlockLootProvider extends BlockLootSubProvider {
    protected ModBlockLootProvider( HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.ARTICHOKE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ArtichokeCropBlock.AGE,3));

        this.add(ModBlocks.ARTICHOKE_CROP.get(),this.createCropDrops(ModBlocks.ARTICHOKE_CROP.get(),
                ModItems.ARTICHOKE.get(), ModItems.ARTICHOKE_SEEDS.get(), lootItemConditionBuilder));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
