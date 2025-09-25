package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemsModelProvider extends ItemModelProvider {
    public ModItemsModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WorldOfFoods.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COPPER_NUGGET.get());

        basicItem(ModItems.ARTICHOKE.get());
        basicItem(ModItems.ASPARAGUS.get());

        basicItem(ModItems.BARLEY.get());
        basicItem(ModItems.BELLPEPPER.get());
        basicItem(ModItems.BASIL.get());
        basicItem(ModItems.BLACKBEAN.get());
        basicItem(ModItems.BLACKBERRY.get());
        basicItem(ModItems.BLACKPEPPER.get());
        basicItem(ModItems.BLUEBERRY.get());
        basicItem(ModItems.BROCCOLI.get());


        basicItem(ModItems.CRANBERRY.get());
        basicItem(ModItems.CABBAGE.get());
        basicItem(ModItems.CAULIFLOWER.get());
        basicItem(ModItems.CELERY.get());
        basicItem(ModItems.CHILEPEPPER.get());
        basicItem(ModItems.CUCUMBER.get());
        basicItem(ModItems.CURRANT.get());
        basicItem(ModItems.CORN.get());

        basicItem(ModItems.EGGPLANT.get());
        basicItem(ModItems.ELDERBERRY.get());

        basicItem(ModItems.GARLIC.get());
        basicItem(ModItems.GINGER.get());
        basicItem(ModItems.GRAPE.get());
        basicItem(ModItems.GREENBEAN.get());
        basicItem(ModItems.GREENONION.get());

        basicItem(ModItems.HOPS.get());

        basicItem(ModItems.KALE.get());

        basicItem(ModItems.LEEK.get());
        basicItem(ModItems.LETTUCE.get());

        basicItem(ModItems.MUSTARD.get());

        basicItem(ModItems.OAT.get());
        basicItem(ModItems.ONION.get());

        basicItem(ModItems.PEANUT.get());
        basicItem(ModItems.PINEAPPLE.get());

        basicItem(ModItems.RADISH.get());
        basicItem(ModItems.RASPBERRY.get());
        basicItem(ModItems.RHUBARB.get());
        basicItem(ModItems.RICE.get());
        basicItem(ModItems.RUTABAGA.get());

        basicItem(ModItems.SOYBEAN.get());
        basicItem(ModItems.SPINACH.get());
        basicItem(ModItems.SQUASH.get());
        basicItem(ModItems.STRAWBERRY.get());
        basicItem(ModItems.SWEETPOTATO.get());

        basicItem(ModItems.TOMATO.get());
        basicItem(ModItems.TOMATILLO.get());
        basicItem(ModItems.TURMERIC.get());
        basicItem(ModItems.TURNIP.get());


        basicItem(ModItems.VANILLA.get());

        basicItem(ModItems.YAM.get());

        basicItem(ModItems.ZUCCHINI.get());

        handheldItem(ModItems.COPPER_AXE.get());
        handheldItem(ModItems.COPPER_HEO.get());
        handheldItem(ModItems.COPPER_PICKAXE.get());
        handheldItem(ModItems.COPPER_SHOVEL.get());
        handheldItem(ModItems.COPPER_SWORD.get());

    }
}
