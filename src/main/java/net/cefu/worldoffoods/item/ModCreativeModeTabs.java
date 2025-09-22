package net.cefu.worldoffoods.item;

import net.cefu.worldoffoods.WorldOfFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorldOfFoods.MOD_ID);

    public static final Supplier<CreativeModeTab> PLANTS_TAB = CREATIVE_MODE_TAB.register("plants_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_NUGGET.get()))
                    .title(Component.translatable("creativetab.worldoffoods.plants"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPER_NUGGET);



                    }).build());

    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_NUGGET.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, "plants_tab"))
                    .title(Component.translatable("creativetab.worldoffoods.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPER_NUGGET);



                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
