package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;



public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COPPER_INGOT)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define( 'X', ModItems.COPPER_NUGGET.get())
                .unlockedBy("copper_ingot",has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(),9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("copper_nugget", has(Items.COPPER_INGOT)).save(recipeOutput);
    }
}
