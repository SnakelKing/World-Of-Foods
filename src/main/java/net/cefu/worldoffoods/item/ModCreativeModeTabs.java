package net.cefu.worldoffoods.item;

import net.cefu.worldoffoods.WorldOfFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorldOfFoods.MOD_ID);

    public static final Supplier<CreativeModeTab> PLANTS_TAB = CREATIVE_MODE_TAB.register("plants_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BARLEY.get()))
                    .title(Component.translatable("creativetab.worldoffoods.plants"))
                    .displayItems((itemDisplayParameters, output) -> {

                       output.accept(ModItems.TOMATO);
//                       output.accept(ModItems.TOMATO_SEEDS);
                       output.accept(ModItems.ARTICHOKE);
                       output.accept(ModItems.ARTICHOKE_SEEDS);
                       output.accept(ModItems.ASPARAGUS);
//                       output.accept(ModItems.ASPARAGUS_SEEDS);
                       output.accept(ModItems.BLACKBERRY);
//                       output.accept(ModItems.BLACKBERRY_SEEDS);
                       output.accept(ModItems.BLUEBERRY);
//                       output.accept(ModItems.BLUEBERRY_SEEDS);
                       output.accept(ModItems.BROCCOLI);
//                       output.accept(ModItems.BROCCOLI_SEEDS);
                       output.accept(ModItems.GREENBEAN);
//                       output.accept(ModItems.GREENBEAN_SEEDS);
                       output.accept(ModItems.YAM);
//                       output.accept(ModItems.YAM_SEEDS);
                       output.accept(ModItems.SPINACH);
//                       output.accept(ModItems.SPINACH_SEEDS);
                       output.accept(ModItems.SWEETPOTATO);
//                       output.accept(ModItems.SWEETPOTATO_SEEDS);
                       output.accept(ModItems.GREENONION);
//                       output.accept(ModItems.GREENONION_SEEDS);
                       output.accept(ModItems.TOMATILLO);
//                       output.accept(ModItems.TOMATILLO_SEEDS);
                       output.accept(ModItems.TURNIP);
//                       output.accept(ModItems.TURNIP_SEEDS);
                       output.accept(ModItems.ZUCCHINI);
//                       output.accept(ModItems.ZUCCHINI_SEEDS);
                       output.accept(ModItems.BARLEY);
//                       output.accept(ModItems.BARLEY_SEEDS);
                       output.accept(ModItems.BASIL);
//                       output.accept(ModItems.BASIL_SEEDS);
                       output.accept(ModItems.GINGER);
//                       output.accept(ModItems.GINGER_SEEDS);
                       output.accept(ModItems.MUSTARD);
//                       output.accept(ModItems.MUSTARD_SEEDS);
                       output.accept(ModItems.OAT);
//                       output.accept(ModItems.OAT_SEEDS);
                       output.accept(ModItems.PEANUT);
//                       output.accept(ModItems.PEANUT_SEEDS);
                       output.accept(ModItems.BLACKPEPPER);
//                       output.accept(ModItems.BLACKPEPPER_SEEDS);
                       output.accept(ModItems.RICE);
//                       output.accept(ModItems.RICE_SEEDS);
                       output.accept(ModItems.TURMERIC);
//                       output.accept(ModItems.TURMERIC_SEEDS);
                       output.accept(ModItems.VANILLA);
//                       output.accept(ModItems.VANILLA_SEEDS);
                       output.accept(ModItems.SQUASH);
//                       output.accept(ModItems.SQUASH_SEEDS);
                       output.accept(ModItems.LETTUCE);
//                       output.accept(ModItems.LETTUCE_SEEDS);
                       output.accept(ModItems.ONION);
//                       output.accept(ModItems.ONION_SEEDS);
                       output.accept(ModItems.RADISH);
//                       output.accept(ModItems.RADISH_SEEDS);
                       output.accept(ModItems.RHUBARB);
//                       output.accept(ModItems.RHUBARB_SEEDS);
                       output.accept(ModItems.RUTABAGA);
//                       output.accept(ModItems.RUTABAGA_SEEDS);
                       output.accept(ModItems.SOYBEAN);
//                       output.accept(ModItems.SOYBEAN_SEEDS);
                       output.accept(ModItems.CHILEPEPPER);
//                       output.accept(ModItems.CHILEPEPPER_SEEDS);
                       output.accept(ModItems.HOPS);
//                       output.accept(ModItems.HOPS_SEEDS);
                       output.accept(ModItems.KALE);
//                       output.accept(ModItems.KALE_SEEDS);
                       output.accept(ModItems.GARLIC);
//                       output.accept(ModItems.GARLIC_SEEDS);
                       output.accept(ModItems.CUCUMBER);
//                       output.accept(ModItems.CUCUMBER_SEEDS);
                       output.accept(ModItems.CELERY);
//                       output.accept(ModItems.CELERY_SEEDS);
                       output.accept(ModItems.BLACKBEAN);
//                       output.accept(ModItems.BLACKBEAN_SEEDS);
                       output.accept(ModItems.CAULIFLOWER);
//                       output.accept(ModItems.CAULIFLOWER_SEEDS);
                       output.accept(ModItems.BELLPEPPER);
//                       output.accept(ModItems.BELLPEPPER_SEEDS);
                       output.accept(ModItems.CABBAGE);
//                       output.accept(ModItems.CABBAGE_SEEDS);
                       output.accept(ModItems.STRAWBERRY);
//                       output.accept(ModItems.STRAWBERRY_SEEDS);
                       output.accept(ModItems.RASPBERRY);
//                       output.accept(ModItems.RASPBERRY_SEEDS);
                       output.accept(ModItems.PINEAPPLE);
//                       output.accept(ModItems.PINEAPPLE_SEEDS);
                       output.accept(ModItems.GRAPE);
//                       output.accept(ModItems.GRAPE_SEEDS);
                       output.accept(ModItems.ELDERBERRY);
//                       output.accept(ModItems.ELDERBERRY_SEEDS);
                       output.accept(ModItems.CURRANT);
//                       output.accept(ModItems.CURRANT_SEEDS);
                       output.accept(ModItems.CRANBERRY);
//                       output.accept(ModItems.CRANBERRY_SEEDS);
                       output.accept(ModItems.LEEK);
//                       output.accept(ModItems.LEEK_SEEDS);
                       output.accept(ModItems.CORN);
//                       output.accept(ModItems.CORN_SEEDS);
                       output.accept(ModItems.EGGPLANT);
//                       output.accept(ModItems.EGGPLANT_SEEDS);



                    }).build());

    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_AXE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, "plants_tab"))
                    .title(Component.translatable("creativetab.worldoffoods.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPER_SWORD);
                        output.accept(ModItems.COPPER_PICKAXE);
                        output.accept(ModItems.COPPER_AXE);
                        output.accept(ModItems.COPPER_SHOVEL);
                        output.accept(ModItems.COPPER_HOE);

                        output.accept(ModItems.COPPER_HELMET);
                        output.accept(ModItems.COPPER_CHESTPLATE);
                        output.accept(ModItems.COPPER_LEGGINGS);
                        output.accept(ModItems.COPPER_BOOTS);

                        output.accept(Items.COPPER_INGOT);
                        output.accept(ModItems.COPPER_NUGGET);




                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
