package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;



import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModItems.ARTICHOKE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.ARTICHOKE.getId(), new Compostable(0.45f), false)

                .add(ModItems.ASPARAGUS_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.ASPARAGUS.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.BARLEY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BARLEY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BASIL_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BASIL.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BELLPEPPER_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BELLPEPPER.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BLACKBERRY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BLACKBERRY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BLACKPEPPER_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BLACKPEPPER.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BLUEBERRY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BLUEBERRY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BROCCOLI_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BROCCOLI.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.BLACKBEAN_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BLACKBEAN.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.CABBAGE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CABBAGE.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CAULIFLOWER_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CAULIFLOWER.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CELERY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CELERY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CHILEPEPPER_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CHILEPEPPER.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CORN_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CORN.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CRANBERRY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CRANBERRY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CUCUMBER_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CUCUMBER.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.CURRANT_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.CURRANT.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.EGGPLANT_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.EGGPLANT.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.ELDERBERRY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.ELDERBERRY.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.GARLIC_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.GARLIC.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.GINGER_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.GINGER.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.GRAPE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.GRAPE.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.GREENBEAN_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.GREENBEAN.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.GREENONION_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.GREENONION.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.HOPS_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.HOPS.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.KALE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.KALE.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.LEEK_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.LEEK.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.LETTUCE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.LETTUCE.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.MUSTARD_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.MUSTARD.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.OAT_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.OAT.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.ONION_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.ONION.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.PEANUT_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.PEANUT.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.PINEAPPLE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.PINEAPPLE.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.RADISH_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.RADISH.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.RASPBERRY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.RASPBERRY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.RHUBARB_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.RHUBARB.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.RICE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.RICE.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.RUTABAGA_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.RUTABAGA.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.SOYBEAN_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.SOYBEAN.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.SPINACH_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.SPINACH.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.SQUASH_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.SQUASH.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.STRAWBERRY_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.STRAWBERRY.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.SWEETPOTATO_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.SWEETPOTATO.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.TOMATILLO_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.TOMATILLO.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.TOMATO_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.TOMATO.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.TURMERIC_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.TURMERIC.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.TURNIP_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.TURNIP.getId(), new Compostable(0.45f), false)

        
                .add(ModItems.VANILLA_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.VANILLA.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.YAM_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.YAM.getId(), new Compostable(0.45f), false)
        
                .add(ModItems.ZUCCHINI_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.ZUCCHINI.getId(), new Compostable(0.45f), false);

    }


}
