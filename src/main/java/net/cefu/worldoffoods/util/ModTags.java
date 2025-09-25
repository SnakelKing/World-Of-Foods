package net.cefu.worldoffoods.util;

import net.cefu.worldoffoods.WorldOfFoods;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


public class ModTags {
    public static class Block{
        public static final TagKey<net.minecraft.world.level.block.Block> COPPER_TOOL = createTag("copper_tool");

        private static TagKey<net.minecraft.world.level.block.Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, name));
        }
    }
}
