package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, WorldOfFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Araçlar için etiketler
        tag(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get());
        // 'HOE' olarak düzeltildiğini varsayarak
        tag(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get()); // Yazım hatası düzeltildi

        // Zırhlar için doğru etiket 'TRIMMABLE_ARMOR'
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_BOOTS.get());
    }
}