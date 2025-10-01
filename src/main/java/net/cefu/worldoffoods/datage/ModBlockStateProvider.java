package net.cefu.worldoffoods.datage;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WorldOfFoods.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.ekledigin block adı gelecek );
        makeCrop(((CropBlock) ModBlocks.ARTICHOKE_CROP.get()), "artichoke_crop_stage", "artichoke_crop_stage");
    }

    public void makeCrop(CropBlock block, String modelName, String texturName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state,block, modelName, texturName);

        getVariantBuilder(block).forAllStates(function);
    }


    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
