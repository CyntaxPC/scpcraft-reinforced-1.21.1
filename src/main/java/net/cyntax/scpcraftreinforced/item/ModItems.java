package net.cyntax.scpcraftreinforced.item;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_PLATINUM=registerItem("raw_platinum",new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT=registerItem("platinum_ingot",new Item(new Item.Settings()));
    public static final Item RAW_IRIDIUM=registerItem("raw_iridium",new Item(new Item.Settings()));
    public static final Item IRIDIUM_INGOT=registerItem("iridium_ingot",new Item(new Item.Settings()));
    public static final Item BLISTER_STEEL_INGOT=registerItem("blister_steel_ingot",new Item(new Item.Settings()));
    public static final Item IRON_BLAST=registerItem("iron_blast",new Item(new Item.Settings()));



    public static final Item GENDER_SWITCHER_MUSIC_DISC=registerItem("gender_switcher_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.GENDER_SWITCHER_SONG_KEY).maxCount(1)));
    public static final Item BURNING_MAN_MUSIC_DISC=registerItem("burning_man_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.BURNING_MAN_SONG_KEY).maxCount(1)));
    public static final Item EYEPODS_MUSIC_DISC=registerItem("eyepods_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.EYEPODS_SONG_KEY).maxCount(1)));
    public static final Item RED_ICE_MUSIC_DISC=registerItem("red_ice_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.RED_ICE_SONG_KEY).maxCount(1)));
    public static final Item SWAMP_WOMAN_MUSIC_DISC=registerItem("swamp_woman_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SWAMP_WOMAN_SONG_KEY).maxCount(1)));
    public static final Item UNSEEN_MOLD_MUSIC_DISC=registerItem("unseen_mold_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.UNSEEN_MOLD_SONG_KEY).maxCount(1)));
    public static final Item DARK_FORM_MUSIC_DISC=registerItem("dark_form_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.DARK_FORM_SONG_KEY).maxCount(1)));
    public static final Item TELEKILL_ALLOY_MUSIC_DISC=registerItem("telekill_alloy_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.TELEKILL_ALLOY_SONG_KEY).maxCount(1)));
    public static final Item SKELETON_KEY_MUSIC_DISC=registerItem("skeleton_key_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SKELETON_KEY_SONG_KEY).maxCount(1)));
    public static final Item SUPER_BALL_MUSIC_DISC=registerItem("super_ball_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SUPER_BALL_SONG_KEY).maxCount(1)));
    public static final Item FOUNTAIN_OF_YOUTH_MUSIC_DISC=registerItem("fountain_of_youth_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.FOUNTAIN_OF_YOUTH_SONG_KEY).maxCount(1)));
    public static final Item EVERYTHING_TREE_MUSIC_DISC=registerItem("everything_tree_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.EVERYTHING_TREE_SONG_KEY).maxCount(1)));
    public static final Item REWIND_MAN_MUSIC_DISC=registerItem("rewind_man_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.REWIND_MAN_SONG_KEY).maxCount(1)));
    public static final Item SONG_OF_GENESIS_MUSIC_DISC=registerItem("song_of_genesis_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SONG_OF_GENESIS_SONG_KEY).maxCount(1)));
    public static final Item EYE_SPIDERS_MUSIC_DISC=registerItem("eye_spiders_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.EYE_SPIDERS_SONG_KEY).maxCount(1)));
    public static final Item LIVING_ROOM_MUSIC_DISC=registerItem("living_room_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.LIVING_ROOM_SONG_KEY).maxCount(1)));
    public static final Item ZOMBIE_PLAGUE_MUSIC_DISC=registerItem("zombie_plague_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.ZOMBIE_PLAGUE_SONG_KEY).maxCount(1)));
    public static final Item BAD_COMPOSITION_MUSIC_DISC=registerItem("bad_composition_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.BAD_COMPOSITION_SONG_KEY).maxCount(1)));
    public static final Item POSSESSIVE_MASK_MUSIC_DISC=registerItem("possessive_mask_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.POSSESSIVE_MASK_SONG_KEY).maxCount(1)));
    public static final Item PLAGUE_DOCTOR_MUSIC_DISC=registerItem("plague_doctor_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.PLAGUE_DOCTOR_SONG_KEY).maxCount(1)));
    public static final Item ERICS_TOY_MUSIC_DISC=registerItem("erics_toy_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.ERICS_TOY_SONG_KEY).maxCount(1)));
    public static final Item OLD_AI_MUSIC_DISC=registerItem("old_ai_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.OLD_AI_SONG_KEY).maxCount(1)));
    public static final Item ENDLESS_STAIRCASE_MUSIC_DISC=registerItem("endless_staircase_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.ENDLESS_STAIRCASE_SONG_KEY).maxCount(1)));
    public static final Item SHY_GUY_MUSIC_DISC=registerItem("shy_guy_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SHY_GUY_SONG_KEY).maxCount(1)));
    public static final Item OLD_MAN_MUSIC_DISC=registerItem("old_man_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.OLD_MAN_SONG_KEY).maxCount(1)));
    public static final Item SCULPTURE_MUSIC_DISC=registerItem("sculpture_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SCULPTURE_SONG_KEY).maxCount(1)));
    public static final Item SPECS_MUSIC_DISC=registerItem("specs_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SPECS_SONG_KEY).maxCount(1)));
    public static final Item SHADOW_LAMPS_MUSIC_DISC=registerItem("shadow_lamps_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SHADOW_LAMPS_SONG_KEY).maxCount(1)));
    public static final Item COLA_BOTTLE_MUSIC_DISC=registerItem("cola_bottle_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.COLA_BOTTLE_SONG_KEY).maxCount(1)));
    public static final Item COFFEE_MACHINE_MUSIC_DISC=registerItem("coffee_machine_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.COFFEE_MACHINE_SONG_KEY).maxCount(1)));
    public static final Item TAKE_ONLY_TWO_MUSIC_DISC=registerItem("take_only_two_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.TAKE_ONLY_TWO_SONG_KEY).maxCount(1)));
    public static final Item PERIPHERAL_JUMPER_MUSIC_DISC=registerItem("peripheral_jumper_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.PERIPHERAL_JUMPER_SONG_KEY).maxCount(1)));
    public static final Item CONTAGIOUS_CRYSTAL_MUSIC_DISC=registerItem("contagious_crystal_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.CONTAGIOUS_CRYSTAL_SONG_KEY).maxCount(1)));
    public static final Item COWBELL_MUSIC_DISC=registerItem("cowbell_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.COWBELL_SONG_KEY).maxCount(1)));
    public static final Item CRYSTALLINE_BUTTERFLIES_MUSIC_DISC=registerItem("crystalline_butterflies_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.CRYSTALLINE_BUTTERFLIES_SONG_KEY).maxCount(1)));
    public static final Item BLACK_STATUE_MUSIC_DISC=registerItem("black_statue_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.BLACK_STATUE_SONG_KEY).maxCount(1)));
    public static final Item JADED_RING_MUSIC_DISC=registerItem("jaded_ring_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.JADED_RING_SONG_KEY).maxCount(1)));
    public static final Item BLUE_KEY_MUSIC_DISC=registerItem("blue_key_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.BLUE_KEY_SONG_KEY).maxCount(1)));
    public static final Item CAMERA_DISRUPTION_MUSIC_DISC=registerItem("camera_disruption_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.CAMERA_DISRUPTION_SONG_KEY).maxCount(1)));
    public static final Item CLOCKWORKS_MUSIC_DISC=registerItem("clockworks_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.CLOCKWORKS_SONG_KEY).maxCount(1)));
    public static final Item WITH_MANY_VOICES_MUSIC_DISC=registerItem("with_many_voices_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.WITH_MANY_VOICES_SONG_KEY).maxCount(1)));
    public static final Item SLEEP_KILLER_MUSIC_DISC=registerItem("sleep_killer_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SLEEP_KILLER_SONG_KEY).maxCount(1)));
    public static final Item RECURSIVE_ROOM_MUSIC_DISC=registerItem("recursive_room_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.RECURSIVE_ROOM_SONG_KEY).maxCount(1)));
    public static final Item BIRTHDAY_MONKEY_MUSIC_DISC=registerItem("birthday_monkey_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.BIRTHDAY_MONKEY_SONG_KEY).maxCount(1)));



    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 3, -2.4f))));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 1, -2.8f))));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 1.5f, -3.0f))));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 6, -3.2f))));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 0, -3f))));

    public static final Item IRIDIUM_SWORD = registerItem("iridium_sword",
            new SwordItem(ModToolMaterials.IRIDIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 3, -2.4f))));
    public static final Item IRIDIUM_PICKAXE = registerItem("iridium_pickaxe",
            new PickaxeItem(ModToolMaterials.IRIDIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 1, -2.8f))));
    public static final Item IRIDIUM_SHOVEL = registerItem("iridium_shovel",
            new ShovelItem(ModToolMaterials.IRIDIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 1.5f, -3.0f))));
    public static final Item IRIDIUM_AXE = registerItem("iridium_axe",
            new AxeItem(ModToolMaterials.IRIDIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 6, -3.2f))));
    public static final Item IRIDIUM_HOE = registerItem("iridium_hoe",
            new HoeItem(ModToolMaterials.IRIDIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRIDIUM, 0, -3f))));

    public static final Item BLADEWOOD_SWORD = registerItem("bladewood_sword",
            new SwordItem(ModToolMaterials.BLADEWOOD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLADEWOOD, 3, -2.4f))));
    public static final Item BLADEWOOD_PICKAXE = registerItem("bladewood_pickaxe",
            new PickaxeItem(ModToolMaterials.BLADEWOOD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLADEWOOD, 1, -2.8f))));
    public static final Item BLADEWOOD_SHOVEL = registerItem("bladewood_shovel",
            new ShovelItem(ModToolMaterials.BLADEWOOD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLADEWOOD, 1.5f, -3.0f))));
    public static final Item BLADEWOOD_AXE = registerItem("bladewood_axe",
            new AxeItem(ModToolMaterials.BLADEWOOD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLADEWOOD, 6, -3.2f))));
    public static final Item BLADEWOOD_HOE = registerItem("bladewood_hoe",
            new HoeItem(ModToolMaterials.BLADEWOOD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLADEWOOD, 0, -3f))));



    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));

    public static final Item IRIDIUM_HELMET = registerItem("iridium_helmet",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item IRIDIUM_CHESTPLATE = registerItem("iridium_chestplate",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item IRIDIUM_LEGGINGS = registerItem("iridium_leggings",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item IRIDIUM_BOOTS = registerItem("iridium_boots",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SCPcraftReinforced.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SCPcraftReinforced.LOGGER.info("Registering modded items from " + SCPcraftReinforced.MOD_ID);
    }
}
