package net.cefu.worldoffoods.item;

import net.cefu.worldoffoods.WorldOfFoods;
import net.cefu.worldoffoods.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WorldOfFoods.MOD_ID);

    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()->new Item(new Item.Properties()));

    public static final DeferredItem<Item> TOMATO =ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)){
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.worldoffoods.tomato.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> ARTICHOKE =ITEMS.register("artichoke",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ARTICHOKE)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.artichoke.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    
    public static final DeferredItem<Item> ASPARAGUS =ITEMS.register("asparagus",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ASPARAGUS)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.asparagus.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> BLACKBERRY =ITEMS.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACKBERRY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.blackberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> BLUEBERRY =ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUEBERRY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.blueberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> GREENBEAN =ITEMS.register("greenbean",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GREENBEAN)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.greenbean.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> SWEETPOTATO =ITEMS.register("sweetpotato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEETPOTATO)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.sweetpotato.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> GREENONION =ITEMS.register("greenonion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GREENONION)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.greenonion.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> TOMATILLO =ITEMS.register("tomatillo",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATILLO)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.tomatillo.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> TURNIP =ITEMS.register("turnip",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TURNIP)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.turnip.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> YAM =ITEMS.register("yam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YAM)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.yam.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> ZUCCHINI =ITEMS.register("zucchini",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ZUCCHINI)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.zucchini.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> GINGER =ITEMS.register("ginger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GINGER)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.ginger.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> MUSTARD =ITEMS.register("mustard",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUSTARD)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.mustard.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> OAT =ITEMS.register("oat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.OAT)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.oat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> PEANUT =ITEMS.register("peanut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEANUT)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.peanut.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> TURMERIC =ITEMS.register("turmeric",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TURMERIC)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.turmeric.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> VANILLA =ITEMS.register("vanilla",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VANILLA)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.vanilla.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> SQUASH =ITEMS.register("squash",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SQUASH)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.squash.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> LETTUCE =ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LETTUCE)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.lettuce.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> ONION =ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.onion.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> RADISH =ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.radish.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> RHUBARB =ITEMS.register("rhubarb",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RHUBARB)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.rhubarb.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> RUTABAGA =ITEMS.register("rutabaga",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RUTABAGA)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.rutabaga.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> SOYBEAN =ITEMS.register("soybean",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SOYBEAN)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.soybean.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> CHILEPEPPER =ITEMS.register("chilepepper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHILEPEPPER)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.chilepepper.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> HOPS =ITEMS.register("hops",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOPS)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.hops.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> GARLIC =ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GARLIC)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.garlic.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> KALE =ITEMS.register("kale",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KALE)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.kale.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> CUCUMBER =ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CUCUMBER)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.cucumber.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> BLACKBEAN =ITEMS.register("blackbean",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACKBEAN)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.blackbean.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> CELERY =ITEMS.register("celery",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CELERY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.celery.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> CAULIFLOWER =ITEMS.register("cauliflower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAULIFLOWER)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.cauliflower.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> BELLPEPPER =ITEMS.register("bellpepper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BELLPEPPER)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.bellpepper.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> CABBAGE =ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CABBAGE)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.cabbage.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> STRAWBERRY =ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.strawberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> RASPBERRY =ITEMS.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RASPBERRY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.raspberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> PINEAPPLE =ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PINEAPPLE)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.pineapple.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> GRAPE =ITEMS.register("grape",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRAPE)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.grape.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> ELDERBERRY =ITEMS.register("elderberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ELDERBERRY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.elderberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> CURRANT =ITEMS.register("currant",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CURRANT)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.currant.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> CRANBERRY =ITEMS.register("cranberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRY)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.cranberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> LEEK =ITEMS.register("leek",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEEK)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.leek.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> CORN =ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.corn.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> EGGPLANT =ITEMS.register("eggplant",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EGGPLANT)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.eggplant.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> BROCCOLI =ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BROCCOLI)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.broccoli.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });



   public static final DeferredItem<Item> RICE = ITEMS.register("rice",
            ()->new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.rice.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> BLACKPEPPER = ITEMS.register("blackpepper",
            ()->new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.blackpepper.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> BASIL = ITEMS.register("basil",
            ()->new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.basil.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> BARLEY = ITEMS.register("barley",
            ()->new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.barley.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<Item> SPINACH = ITEMS.register("spinach",
            ()->new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.worldoffoods.spinach.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

   public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
           () -> new SwordItem(ModToolTiers.COPPER, new Item.Properties()
                   .attributes(SwordItem.createAttributes(ModToolTiers.COPPER, 3,-2.4f))));

   public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, 1,-2.8f))));

   public static final DeferredItem<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.COPPER, 6.5f,-3.2f))));

   public static final DeferredItem<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.COPPER, -1,-2.0f))));

   public static final DeferredItem<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.COPPER, 1.5f,-3.0f))));

   public static final DeferredItem<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
           ()-> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                   new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));

   public static final DeferredItem<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));

   public static final DeferredItem<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));

   public static final DeferredItem<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            ()-> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

   // tohumlar
   public static final DeferredItem<Item> ARTICHOKE_SEEDS = ITEMS.register("artichoke_seeds",
           () -> new ItemNameBlockItem(ModBlocks.ARTICHOKE_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ASPARAGUS_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BARLEY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BASIL_SEEDS = ITEMS.register("basil_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BASIL_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BELLPEPPER_SEEDS = ITEMS.register("bellpepper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BELLPEPPER_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BLACKBERRY_SEEDS = ITEMS.register("blackberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLACKBERRY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BLACKPEPPER_SEEDS = ITEMS.register("blackpepper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLACKPEPPER_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BROCCOLI_SEEDS = ITEMS.register("broccoli_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BROCCOLI_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> BLACKBEAN_SEEDS = ITEMS.register("blackbean_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLACKBEAN_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CABBAGE_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CAULIFLOWER_SEEDS = ITEMS.register("cauliflower_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CAULIFLOWER_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CELERY_SEEDS = ITEMS.register("celery_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CELERY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CHILEPEPPER_SEEDS = ITEMS.register("chilepepper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CHILEPEPPER_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CRANBERRY_SEEDS = ITEMS.register("cranberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CRANBERRY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBER_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> CURRANT_SEEDS = ITEMS.register("currant_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CURRANT_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new ItemNameBlockItem(ModBlocks.EGGPLANT_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> ELDERBERRY_SEEDS = ITEMS.register("elderberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ELDERBERRY_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GARLIC_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> GINGER_SEEDS = ITEMS.register("ginger_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GINGER_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> GRAPE_SEEDS = ITEMS.register("grape_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GRAPE_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> GREENBEAN_SEEDS = ITEMS.register("greenbean_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GREENBEAN_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> GREENONION_SEEDS = ITEMS.register("greenonion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GREENONION_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> HOPS_SEEDS = ITEMS.register("hops_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HOPS_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> KALE_SEEDS = ITEMS.register("kale_seeds",
            () -> new ItemNameBlockItem(ModBlocks.KALE_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> LEEK_SEEDS = ITEMS.register("leek_seeds",
            () -> new ItemNameBlockItem(ModBlocks.LEEK_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds",
            () -> new ItemNameBlockItem(ModBlocks.LETTUCE_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> MUSTARD_SEEDS = ITEMS.register("mustard_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MUSTARD_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> OAT_SEEDS = ITEMS.register("oat_seeds",
            () -> new ItemNameBlockItem(ModBlocks.OAT_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ONION_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> PEANUT_SEEDS = ITEMS.register("peanut_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PEANUT_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> PINEAPPLE_SEEDS = ITEMS.register("pineapple_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> RADISH_SEEDS = ITEMS.register("radish_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RADISH_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> RASPBERRY_SEEDS = ITEMS.register("raspberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RASPBERRY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> RHUBARB_SEEDS = ITEMS.register("rhubarb_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RHUBARB_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RICE_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> RUTABAGA_SEEDS = ITEMS.register("rutabaga_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RUTABAGA_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> SOYBEAN_SEEDS = ITEMS.register("soybean_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SOYBEAN_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> SPINACH_SEEDS = ITEMS.register("spinach_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SPINACH_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> SQUASH_SEEDS = ITEMS.register("squash_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SQUASH_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> SWEETPOTATO_SEEDS = ITEMS.register("sweetpotato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SWEETPOTATO_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> TOMATILLO_SEEDS = ITEMS.register("tomatillo_seeds",
           () -> new ItemNameBlockItem(ModBlocks.TOMATILLO_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> TURMERIC_SEEDS = ITEMS.register("turmeric_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TURMERIC_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TURNIP_CROP.get(),new Item.Properties()));

   public static final DeferredItem<Item> VANILLA_SEEDS = ITEMS.register("vanilla_seeds",
            () -> new ItemNameBlockItem(ModBlocks.VANILLA_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> YAM_SEEDS = ITEMS.register("yam_seeds",
            () -> new ItemNameBlockItem(ModBlocks.YAM_CROP.get(),new Item.Properties()));
   public static final DeferredItem<Item> ZUCCHINI_SEEDS = ITEMS.register("zucchini_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ZUCCHINI_CROP.get(),new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
