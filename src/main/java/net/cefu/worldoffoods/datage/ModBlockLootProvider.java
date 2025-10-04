package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.block.ModBlocks;
import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock; // ÖNEMLİ: Bu import eklendi
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootProvider extends BlockLootSubProvider {
    public ModBlockLootProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // Bu gereksiz satır kaldırıldı.

        this.add(ModBlocks.ARTICHOKE_CROP.get(), createCustomCropDrops(ModBlocks.ARTICHOKE_CROP.get(), ModItems.ARTICHOKE.get(), ModItems.ARTICHOKE_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.ASPARAGUS_CROP.get(), createCustomCropDrops(ModBlocks.ASPARAGUS_CROP.get(), ModItems.ASPARAGUS.get(), ModItems.ASPARAGUS_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        // ... Diğer tüm ekinler için aynı şekilde devam ediyor ...
        this.add(ModBlocks.BARLEY_CROP.get(), createCustomCropDrops(ModBlocks.BARLEY_CROP.get(), ModItems.BARLEY.get(), ModItems.BARLEY_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.BASIL_CROP.get(), createCustomCropDrops(ModBlocks.BASIL_CROP.get(), ModItems.BASIL.get(), ModItems.BASIL_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.BELLPEPPER_CROP.get(), createCustomCropDrops(ModBlocks.BELLPEPPER_CROP.get(), ModItems.BELLPEPPER.get(), ModItems.BELLPEPPER_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.BLACKBEAN_CROP.get(), createCustomCropDrops(ModBlocks.BLACKBEAN_CROP.get(), ModItems.BLACKBEAN.get(), ModItems.BLACKBEAN_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.BLACKBERRY_CROP.get(), createCustomCropDrops(ModBlocks.BLACKBERRY_CROP.get(), ModItems.BLACKBERRY.get(), ModItems.BLACKBERRY_SEEDS.get(), 3, 1.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.BLACKPEPPER_CROP.get(), createCustomCropDrops(ModBlocks.BLACKPEPPER_CROP.get(), ModItems.BLACKPEPPER.get(), ModItems.BLACKPEPPER_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.BLUEBERRY_CROP.get(), createCustomCropDrops(ModBlocks.BLUEBERRY_CROP.get(), ModItems.BLUEBERRY.get(), ModItems.BLUEBERRY_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.BROCCOLI_CROP.get(), createCustomCropDrops(ModBlocks.BROCCOLI_CROP.get(), ModItems.BROCCOLI.get(), ModItems.BROCCOLI_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.CABBAGE_CROP.get(), createCustomCropDrops(ModBlocks.CABBAGE_CROP.get(), ModItems.CABBAGE.get(), ModItems.CABBAGE_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.CAULIFLOWER_CROP.get(), createCustomCropDrops(ModBlocks.CAULIFLOWER_CROP.get(), ModItems.CAULIFLOWER.get(), ModItems.CAULIFLOWER_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.CELERY_CROP.get(), createCustomCropDrops(ModBlocks.CELERY_CROP.get(), ModItems.CELERY.get(), ModItems.CELERY_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.CHILEPEPPER_CROP.get(), createCustomCropDrops(ModBlocks.CHILEPEPPER_CROP.get(), ModItems.CHILEPEPPER.get(), ModItems.CHILEPEPPER_SEEDS.get(), 3, 1.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.CORN_CROP.get(), createCustomCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN.get(), ModItems.CORN_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.CUCUMBER_CROP.get(), createCustomCropDrops(ModBlocks.CUCUMBER_CROP.get(), ModItems.CUCUMBER.get(), ModItems.CUCUMBER_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.CURRANT_CROP.get(), createCustomCropDrops(ModBlocks.CURRANT_CROP.get(), ModItems.CURRANT.get(), ModItems.CURRANT_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.CRANBERRY_CROP.get(), createCustomCropDrops(ModBlocks.CRANBERRY_CROP.get(), ModItems.CRANBERRY.get(), ModItems.CRANBERRY_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.EGGPLANT_CROP.get(), createCustomCropDrops(ModBlocks.EGGPLANT_CROP.get(), ModItems.EGGPLANT.get(), ModItems.EGGPLANT_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.ELDERBERRY_CROP.get(), createCustomCropDrops(ModBlocks.ELDERBERRY_CROP.get(), ModItems.ELDERBERRY.get(), ModItems.ELDERBERRY_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.GARLIC_CROP.get(), createCustomCropDrops(ModBlocks.GARLIC_CROP.get(), ModItems.GARLIC.get(), ModItems.GARLIC_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.GINGER_CROP.get(), createCustomCropDrops(ModBlocks.GINGER_CROP.get(), ModItems.GINGER.get(), ModItems.GINGER_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.GRAPE_CROP.get(), createCustomCropDrops(ModBlocks.GRAPE_CROP.get(), ModItems.GRAPE.get(), ModItems.GRAPE_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.GREENBEAN_CROP.get(), createCustomCropDrops(ModBlocks.GREENBEAN_CROP.get(), ModItems.GREENBEAN.get(), ModItems.GREENBEAN_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.GREENONION_CROP.get(), createCustomCropDrops(ModBlocks.GREENONION_CROP.get(), ModItems.GREENONION.get(), ModItems.GREENONION_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.HOPS_CROP.get(), createCustomCropDrops(ModBlocks.HOPS_CROP.get(), ModItems.HOPS.get(), ModItems.HOPS_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.KALE_CROP.get(), createCustomCropDrops(ModBlocks.KALE_CROP.get(), ModItems.KALE.get(), ModItems.KALE_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.LEEK_CROP.get(), createCustomCropDrops(ModBlocks.LEEK_CROP.get(), ModItems.LEEK.get(), ModItems.LEEK_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.LETTUCE_CROP.get(), createCustomCropDrops(ModBlocks.LETTUCE_CROP.get(), ModItems.LETTUCE.get(), ModItems.LETTUCE_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.MUSTARD_CROP.get(), createCustomCropDrops(ModBlocks.MUSTARD_CROP.get(), ModItems.MUSTARD.get(), ModItems.MUSTARD_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.OAT_CROP.get(), createCustomCropDrops(ModBlocks.OAT_CROP.get(), ModItems.OAT.get(), ModItems.OAT_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.ONION_CROP.get(), createCustomCropDrops(ModBlocks.ONION_CROP.get(), ModItems.ONION.get(), ModItems.ONION_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.PEANUT_CROP.get(), createCustomCropDrops(ModBlocks.PEANUT_CROP.get(), ModItems.PEANUT.get(), ModItems.PEANUT_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.PINEAPPLE_CROP.get(), createCustomCropDrops(ModBlocks.PINEAPPLE_CROP.get(), ModItems.PINEAPPLE.get(), ModItems.PINEAPPLE_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.RADISH_CROP.get(), createCustomCropDrops(ModBlocks.RADISH_CROP.get(), ModItems.RADISH.get(), ModItems.RADISH_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.RASPBERRY_CROP.get(), createCustomCropDrops(ModBlocks.RASPBERRY_CROP.get(), ModItems.RASPBERRY.get(), ModItems.RASPBERRY_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.RHUBARB_CROP.get(), createCustomCropDrops(ModBlocks.RHUBARB_CROP.get(), ModItems.RHUBARB.get(), ModItems.RHUBARB_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.RICE_CROP.get(), createCustomCropDrops(ModBlocks.RICE_CROP.get(), ModItems.RICE.get(), ModItems.RICE_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.RUTABAGA_CROP.get(), createCustomCropDrops(ModBlocks.RUTABAGA_CROP.get(), ModItems.RUTABAGA.get(), ModItems.RUTABAGA_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.SOYBEAN_CROP.get(), createCustomCropDrops(ModBlocks.SOYBEAN_CROP.get(), ModItems.SOYBEAN.get(), ModItems.SOYBEAN_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.SPINACH_CROP.get(), createCustomCropDrops(ModBlocks.SPINACH_CROP.get(), ModItems.SPINACH.get(), ModItems.SPINACH_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.SQUASH_CROP.get(), createCustomCropDrops(ModBlocks.SQUASH_CROP.get(), ModItems.SQUASH.get(), ModItems.SQUASH_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.STRAWBERRY_CROP.get(), createCustomCropDrops(ModBlocks.STRAWBERRY_CROP.get(), ModItems.STRAWBERRY.get(), ModItems.STRAWBERRY_SEEDS.get(), 3, 2.0f, 5.0f, 1.0f,2.0f));
        this.add(ModBlocks.SWEETPOTATO_CROP.get(), createCustomCropDrops(ModBlocks.SWEETPOTATO_CROP.get(), ModItems.SWEETPOTATO.get(), ModItems.SWEETPOTATO_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.TOMATILLO_CROP.get(), createCustomCropDrops(ModBlocks.TOMATILLO_CROP.get(), ModItems.TOMATILLO.get(), ModItems.TOMATILLO_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.TOMATO_CROP.get(), createCustomCropDrops(ModBlocks.TOMATO_CROP.get(), ModItems.TOMATO.get(), ModItems.TOMATO_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.TURMERIC_CROP.get(), createCustomCropDrops(ModBlocks.TURMERIC_CROP.get(), ModItems.TURMERIC.get(), ModItems.TURMERIC_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.TURNIP_CROP.get(), createCustomCropDrops(ModBlocks.TURNIP_CROP.get(), ModItems.TURNIP.get(), ModItems.TURNIP_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.VANILLA_CROP.get(), createCustomCropDrops(ModBlocks.VANILLA_CROP.get(), ModItems.VANILLA.get(), ModItems.VANILLA_SEEDS.get(), 3, 1.0f, 2.0f, 1.0f,2.0f));
        this.add(ModBlocks.YAM_CROP.get(), createCustomCropDrops(ModBlocks.YAM_CROP.get(), ModItems.YAM.get(), ModItems.YAM_SEEDS.get(), 3, 1.0f, 4.0f, 1.0f,2.0f));
        this.add(ModBlocks.ZUCCHINI_CROP.get(), createCustomCropDrops(ModBlocks.ZUCCHINI_CROP.get(), ModItems.ZUCCHINI.get(), ModItems.ZUCCHINI_SEEDS.get(), 3, 4.0f, 3.0f, 1.0f,2.0f));

    }

    // Kendi yazdığımız özel ekin düşürme metodu (DÜZELTİLMİŞ HALİ)
    protected LootTable.Builder createCustomCropDrops(Block pCropBlock, Item pGrownCropItem, Item pSeedItem, int pMaxAge, float pMinDrops, float pMaxDrops, float pMinSeedDrops,float pMaxSeedDrops) {
        // Bu koşul, sadece ekinin yaşı pMaxAge'e eşitse (yani tam büyümüşse) çalışır.
        LootItemCondition.Builder conditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(pCropBlock)
                .setProperties(StatePropertiesPredicate.Builder.properties()
                        // HATA 1 DÜZELTİLDİ: ArtichokeCropBlock.AGE yerine tüm ekinlerle uyumlu olan CropBlock.AGE kullanıldı.
                        .hasProperty(CropBlock.AGE, pMaxAge));

        // HATA 2 DÜZELTİLDİ: Ganimet tablosu, tekrar eden düşmeleri önlemek için sıfırdan ve doğru şekilde oluşturuldu.
        return LootTable.lootTable()
                // Havuz 1: Ana ürünün düşmesi (sadece tam büyüdüğünde)
                .withPool(LootPool.lootPool()
                        .add(LootItem.lootTableItem(pGrownCropItem))
                        .when(conditionBuilder) // Sadece tam büyüdüğünde bu havuz çalışır.
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(pMinDrops, pMaxDrops))) // Belirlenen min-max aralığında ürün düşürür.
                        .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT)
                                .getOrThrow(Enchantments.FORTUNE))) // Fortune (Servet) büyüsünü uygular.
                )
                // Havuz 2: Tohumun düşmesi (her zaman)
                .withPool(LootPool.lootPool()
                                .add(LootItem.lootTableItem(pSeedItem))
                        // Bu havuzun özel bir koşulu yok, bu yüzden her zaman çalışır.
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(pMinSeedDrops, pMaxSeedDrops)))

                );
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}