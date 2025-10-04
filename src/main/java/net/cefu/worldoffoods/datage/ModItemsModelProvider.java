package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.LinkedHashMap;

public class ModItemsModelProvider extends ItemModelProvider {



    public ModItemsModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WorldOfFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COPPER_NUGGET.get());

        basicItem(ModItems.ARTICHOKE.get());
        basicItem(ModItems.ARTICHOKE_SEEDS.get());
        basicItem(ModItems.ASPARAGUS.get());
        basicItem(ModItems.ASPARAGUS_SEEDS.get());

        basicItem(ModItems.BARLEY.get());
        basicItem(ModItems.BELLPEPPER.get());
        basicItem(ModItems.BASIL.get());
        basicItem(ModItems.BLACKBEAN.get());
        basicItem(ModItems.BLACKBERRY.get());
        basicItem(ModItems.BLACKPEPPER.get());
        basicItem(ModItems.BLUEBERRY.get());
        basicItem(ModItems.BROCCOLI.get());

        basicItem(ModItems.BARLEY_SEEDS.get());
        basicItem(ModItems.BELLPEPPER_SEEDS.get());
        basicItem(ModItems.BASIL_SEEDS.get());
        basicItem(ModItems.BLACKBEAN_SEEDS.get());
        basicItem(ModItems.BLACKBERRY_SEEDS.get());
        basicItem(ModItems.BLACKPEPPER_SEEDS.get());
        basicItem(ModItems.BLUEBERRY_SEEDS.get());
        basicItem(ModItems.BROCCOLI_SEEDS.get());


        basicItem(ModItems.CRANBERRY.get());
        basicItem(ModItems.CABBAGE.get());
        basicItem(ModItems.CAULIFLOWER.get());
        basicItem(ModItems.CELERY.get());
        basicItem(ModItems.CHILEPEPPER.get());
        basicItem(ModItems.CUCUMBER.get());
        basicItem(ModItems.CURRANT.get());
        basicItem(ModItems.CORN.get());

        basicItem(ModItems.CRANBERRY_SEEDS.get());
        basicItem(ModItems.CABBAGE_SEEDS.get());
        basicItem(ModItems.CAULIFLOWER_SEEDS.get());
        basicItem(ModItems.CELERY_SEEDS.get());
        basicItem(ModItems.CHILEPEPPER_SEEDS.get());
        basicItem(ModItems.CUCUMBER_SEEDS.get());
        basicItem(ModItems.CURRANT_SEEDS.get());
        basicItem(ModItems.CORN_SEEDS.get());


        basicItem(ModItems.EGGPLANT.get());
        basicItem(ModItems.ELDERBERRY.get());

        basicItem(ModItems.EGGPLANT_SEEDS.get());
        basicItem(ModItems.ELDERBERRY_SEEDS.get());

        basicItem(ModItems.GARLIC.get());
        basicItem(ModItems.GINGER.get());
        basicItem(ModItems.GRAPE.get());
        basicItem(ModItems.GREENBEAN.get());
        basicItem(ModItems.GREENONION.get());

        basicItem(ModItems.GARLIC_SEEDS.get());
        basicItem(ModItems.GINGER_SEEDS.get());
        basicItem(ModItems.GRAPE_SEEDS.get());
        basicItem(ModItems.GREENBEAN_SEEDS.get());
        basicItem(ModItems.GREENONION_SEEDS.get());

        basicItem(ModItems.HOPS.get());
        basicItem(ModItems.HOPS_SEEDS.get());

        basicItem(ModItems.KALE.get());
        basicItem(ModItems.KALE_SEEDS.get());

        basicItem(ModItems.LEEK.get());
        basicItem(ModItems.LETTUCE.get());

        basicItem(ModItems.LEEK_SEEDS.get());
        basicItem(ModItems.LETTUCE_SEEDS.get());

        basicItem(ModItems.MUSTARD.get());
        basicItem(ModItems.MUSTARD_SEEDS.get());

        basicItem(ModItems.OAT.get());
        basicItem(ModItems.ONION.get());
        basicItem(ModItems.OAT_SEEDS.get());
        basicItem(ModItems.ONION_SEEDS.get());

        basicItem(ModItems.PEANUT.get());
        basicItem(ModItems.PINEAPPLE.get());
        basicItem(ModItems.PEANUT_SEEDS.get());
        basicItem(ModItems.PINEAPPLE_SEEDS.get());


        basicItem(ModItems.RADISH.get());
        basicItem(ModItems.RASPBERRY.get());
        basicItem(ModItems.RHUBARB.get());
        basicItem(ModItems.RICE.get());
        basicItem(ModItems.RUTABAGA.get());

        basicItem(ModItems.RADISH_SEEDS.get());
        basicItem(ModItems.RASPBERRY_SEEDS.get());
        basicItem(ModItems.RHUBARB_SEEDS.get());
        basicItem(ModItems.RICE_SEEDS.get());
        basicItem(ModItems.RUTABAGA_SEEDS.get());


        basicItem(ModItems.SOYBEAN.get());
        basicItem(ModItems.SPINACH.get());
        basicItem(ModItems.SQUASH.get());
        basicItem(ModItems.STRAWBERRY.get());
        basicItem(ModItems.SWEETPOTATO.get());

        basicItem(ModItems.SOYBEAN_SEEDS.get());
        basicItem(ModItems.SPINACH_SEEDS.get());
        basicItem(ModItems.SQUASH_SEEDS.get());
        basicItem(ModItems.STRAWBERRY_SEEDS.get());
        basicItem(ModItems.SWEETPOTATO_SEEDS.get());

        basicItem(ModItems.TOMATO.get());
        basicItem(ModItems.TOMATILLO.get());
        basicItem(ModItems.TURMERIC.get());
        basicItem(ModItems.TURNIP.get());

        basicItem(ModItems.TOMATO_SEEDS.get());
        basicItem(ModItems.TOMATILLO_SEEDS.get());
        basicItem(ModItems.TURMERIC_SEEDS.get());
        basicItem(ModItems.TURNIP_SEEDS.get());


        basicItem(ModItems.VANILLA.get());
        basicItem(ModItems.VANILLA_SEEDS.get());

        basicItem(ModItems.YAM.get());
        basicItem(ModItems.YAM_SEEDS.get());

        basicItem(ModItems.ZUCCHINI.get());
        basicItem(ModItems.ZUCCHINI_SEEDS.get());

        handheldItem(ModItems.COPPER_AXE.get());
        handheldItem(ModItems.COPPER_HOE.get());
        handheldItem(ModItems.COPPER_PICKAXE.get());
        handheldItem(ModItems.COPPER_SHOVEL.get());
        handheldItem(ModItems.COPPER_SWORD.get());

        // Zırh item'larının envanter modelleri için basicItem kullanılır.
        basicItem(ModItems.COPPER_HELMET.get());
        basicItem(ModItems.COPPER_CHESTPLATE.get());
        basicItem(ModItems.COPPER_LEGGINGS.get());
        basicItem(ModItems.COPPER_BOOTS.get());

    }
}
