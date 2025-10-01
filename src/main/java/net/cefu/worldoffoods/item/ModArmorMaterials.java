package net.cefu.worldoffoods.item;

import net.cefu.worldoffoods.WorldOfFoods;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final Holder<ArmorMaterial> COPPER_ARMOR_MATERIAL = register("copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 1);
                // ArmorItem.Type.BODY satırı kaldırıldı.
            }),
            9, // enchantability
            SoundEvents.ARMOR_EQUIP_IRON, // Ses demir yerine bakır olarak değiştirildi
            0.0f, // toughness
            0.0f, // knockback resistance
            () -> Ingredient.of(Items.COPPER_INGOT), // Tamir malzemesi
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, "copper")))
    );

    // Metod imzası daha sade ve modern hale getirildi
    public static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> defense,
                                                 int enchantability, Holder<SoundEvent> equipSound, float toughness,
                                                 float knockbackResistance, Supplier<Ingredient> repairIngredient,
                                                 List<ArmorMaterial.Layer> layers) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(WorldOfFoods.MOD_ID, name);

        // ArmorMaterial constructor'ı doğrudan gelen map'i kullanabilir.
        ArmorMaterial material = new ArmorMaterial(defense, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance);

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location, material);
    }
}