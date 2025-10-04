package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.block.ModBlocks;
import net.cefu.worldoffoods.block.custom.ArtichokeCropBlock;
import net.cefu.worldoffoods.block.custom.AsparagusCropBlock;
import net.cefu.worldoffoods.block.custom.RadishCropBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WorldOfFoods.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.ekledigin block adı gelecek );


        makeCrop(((CropBlock) ModBlocks.ARTICHOKE_CROP.get()), "artichoke_crop_stage", "artichoke_crop_stage");
        makeCrop(((CropBlock) ModBlocks.ASPARAGUS_CROP.get()), "asparagus_crop_stage", "asparagus_crop_stage");

        makeCrop(((CropBlock) ModBlocks.BARLEY_CROP.get()), "barley_crop_stage", "barley_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BASIL_CROP.get()), "basil_crop_stage", "basil_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BELLPEPPER_CROP.get()), "bellpepper_crop_stage", "bellpepper_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BLACKBERRY_CROP.get()), "blackberry_crop_stage", "blackberry_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BLACKPEPPER_CROP.get()), "blackpepper_crop_stage", "blackpepper_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BLUEBERRY_CROP.get()), "blueberry_crop_stage", "blueberry_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BROCCOLI_CROP.get()), "broccoli_crop_stage", "broccoli_crop_stage");
        makeCrop(((CropBlock) ModBlocks.BLACKBEAN_CROP.get()), "blackbean_crop_stage", "blackbean_crop_stage");

        makeCrop(((CropBlock) ModBlocks.CABBAGE_CROP.get()), "cabbage_crop_stage", "cabbage_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CAULIFLOWER_CROP.get()), "cauliflower_crop_stage", "cauliflower_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CELERY_CROP.get()), "celery_crop_stage", "celery_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CHILEPEPPER_CROP.get()), "chilepepper_crop_stage", "chilepepper_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CORN_CROP.get()), "corn_crop_stage", "corn_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CRANBERRY_CROP.get()), "cranberry_crop_stage", "cranberry_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CUCUMBER_CROP.get()), "cucumber_crop_stage", "cucumber_crop_stage");
        makeCrop(((CropBlock) ModBlocks.CURRANT_CROP.get()), "currant_crop_stage", "currant_crop_stage");

        makeCrop(((CropBlock) ModBlocks.EGGPLANT_CROP.get()), "eggplant_crop_stage", "eggplant_crop_stage");
        makeCrop(((CropBlock) ModBlocks.ELDERBERRY_CROP.get()), "elderberry_crop_stage", "elderberry_crop_stage");

        makeCrop(((CropBlock) ModBlocks.GARLIC_CROP.get()), "garlic_crop_stage", "garlic_crop_stage");
        makeCrop(((CropBlock) ModBlocks.GINGER_CROP.get()), "ginger_crop_stage", "ginger_crop_stage");
        makeCrop(((CropBlock) ModBlocks.GRAPE_CROP.get()), "grape_crop_stage", "grape_crop_stage");
        makeCrop(((CropBlock) ModBlocks.GREENBEAN_CROP.get()), "greenbean_crop_stage", "greenbean_crop_stage");
        makeCrop(((CropBlock) ModBlocks.GREENONION_CROP.get()), "greenonion_crop_stage", "greenonion_crop_stage");

        makeCrop(((CropBlock) ModBlocks.HOPS_CROP.get()), "hops_crop_stage", "hops_crop_stage");

        makeCrop(((CropBlock) ModBlocks.KALE_CROP.get()), "kale_crop_stage", "kale_crop_stage");

        makeCrop(((CropBlock) ModBlocks.LEEK_CROP.get()), "leek_crop_stage", "leek_crop_stage");
        makeCrop(((CropBlock) ModBlocks.LETTUCE_CROP.get()), "lettuce_crop_stage", "lettuce_crop_stage");

        makeCrop(((CropBlock) ModBlocks.MUSTARD_CROP.get()), "mustard_crop_stage", "mustard_crop_stage");

        makeCrop(((CropBlock) ModBlocks.OAT_CROP.get()), "oat_crop_stage", "oat_crop_stage");
        makeCrop(((CropBlock) ModBlocks.ONION_CROP.get()), "onion_crop_stage", "onion_crop_stage");

        makeCrop(((CropBlock) ModBlocks.PEANUT_CROP.get()), "peanut_crop_stage", "peanut_crop_stage");
        makeCrop(((CropBlock) ModBlocks.PINEAPPLE_CROP.get()), "pineapple_crop_stage", "pineapple_crop_stage");

        makeCrop(((CropBlock) ModBlocks.RADISH_CROP.get()), "radish_crop_stage", "radish_crop_stage");
        makeCrop(((CropBlock) ModBlocks.RASPBERRY_CROP.get()), "raspberry_crop_stage", "raspberry_crop_stage");
        makeCrop(((CropBlock) ModBlocks.RHUBARB_CROP.get()), "rhubarb_crop_stage", "rhubarb_crop_stage");
        makeCrop(((CropBlock) ModBlocks.RICE_CROP.get()), "rice_crop_stage", "rice_crop_stage");
        makeCrop(((CropBlock) ModBlocks.RUTABAGA_CROP.get()), "rutabaga_crop_stage", "rutabaga_crop_stage");

        makeCrop(((CropBlock) ModBlocks.SOYBEAN_CROP.get()), "soybean_crop_stage", "soybean_crop_stage");
        makeCrop(((CropBlock) ModBlocks.SPINACH_CROP.get()), "spinach_crop_stage", "spinach_crop_stage");
        makeCrop(((CropBlock) ModBlocks.SQUASH_CROP.get()), "squash_crop_stage", "squash_crop_stage");
        makeCrop(((CropBlock) ModBlocks.STRAWBERRY_CROP.get()), "strawberry_crop_stage", "strawberry_crop_stage");
        makeCrop(((CropBlock) ModBlocks.SWEETPOTATO_CROP.get()), "sweetpotato_crop_stage", "sweetpotato_crop_stage");

        makeCrop(((CropBlock) ModBlocks.TOMATILLO_CROP.get()), "tomatillo_crop_stage", "tomatillo_crop_stage");
        makeCrop(((CropBlock) ModBlocks.TOMATO_CROP.get()), "tomato_crop_stage", "tomato_crop_stage");
        makeCrop(((CropBlock) ModBlocks.TURMERIC_CROP.get()), "turmeric_crop_stage", "turmeric_crop_stage");
        makeCrop(((CropBlock) ModBlocks.TURNIP_CROP.get()), "turnip_crop_stage", "turnip_crop_stage");

        makeCrop(((CropBlock) ModBlocks.VANILLA_CROP.get()), "vanilla_crop_stage", "vanilla_crop_stage");
        makeCrop(((CropBlock) ModBlocks.YAM_CROP.get()), "yam_crop_stage", "yam_crop_stage");
        makeCrop(((CropBlock) ModBlocks.ZUCCHINI_CROP.get()), "zucchini_crop_stage", "zucchini_crop_stage");
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        // "age" veya "stage" property’sini otomatik bul
        IntegerProperty ageProp = null;
        for (Property<?> prop : block.getStateDefinition().getProperties()) {
            if (prop instanceof IntegerProperty && (prop.getName().equals("age") || prop.getName().equals("stage"))) {
                ageProp = (IntegerProperty) prop;
                break;
            }
        }

        if (ageProp == null) {
            throw new IllegalStateException("No 'age' or 'stage' property found for crop block: " + block);
        }

        int age = state.getValue(ageProp);

        models[0] = new ConfiguredModel(models().crop(
                modelName + age,
                ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, "block/" + textureName + age)
        ).renderType("cutout"));

        return models;
    }






    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("worldoffoods:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("worldoffoods:block/" + deferredBlock.getId().getPath() + appendix));
    }
}