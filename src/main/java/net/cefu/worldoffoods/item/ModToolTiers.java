package net.cefu.worldoffoods.item;


import net.cefu.worldoffoods.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier COPPER = new SimpleTier(BlockTags.INCORRECT_FOR_STONE_TOOL,
            191,5f,1.5f,9, ()-> Ingredient.of(Items.COPPER_INGOT));
}

