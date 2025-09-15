package net.cyntax.scpcraftreinforced.item;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> PLATINUM_ARMOR_MATERIAL = registerArmorMaterial("platinum",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SCPcraftReinforced.MOD_ID, "platinum"))), 0,0));

    public static final RegistryEntry<ArmorMaterial> IRIDIUM_ARMOR_MATERIAL = registerArmorMaterial("iridium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 6);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.IRIDIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SCPcraftReinforced.MOD_ID, "iridium"))), 0,0));




    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(SCPcraftReinforced.MOD_ID, name), material.get());
    }
}