package net.cyntax.scpcraftreinforced.item;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SCPCRAFT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SCPcraftReinforced.MOD_ID, "scpcraft_blocks_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLISTER_STEEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.scpcraftreinforced.scpcraftreinforced_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_IRIDIUM_ORE);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.IRIDIUM_BLOCK);
                        entries.add(ModBlocks.BLISTER_STEEL_BLOCK);

                        entries.add(ModBlocks.REINFORCED_GLASS);
                        entries.add(ModBlocks.REINFORCED_GLASS_PANE);

                        entries.add(ModBlocks.DEEP_GRANITE);
                        entries.add(ModBlocks.DEEP_GRANITE_STAIRS);
                        entries.add(ModBlocks.DEEP_GRANITE_SLAB);
                        entries.add(ModBlocks.DEEP_GRANITE_WALL);
                        entries.add(ModBlocks.DEEP_GRANITE_BUTTON);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_SLAB);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL);
                        entries.add(ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS);

                        entries.add(ModBlocks.MARBLE);
                        entries.add(ModBlocks.MARBLE_STAIRS);
                        entries.add(ModBlocks.MARBLE_SLAB);
                        entries.add(ModBlocks.MARBLE_WALL);
                        entries.add(ModBlocks.MARBLE_BUTTON);
                        entries.add(ModBlocks.POLISHED_MARBLE);
                        entries.add(ModBlocks.POLISHED_MARBLE_STAIRS);
                        entries.add(ModBlocks.POLISHED_MARBLE_SLAB);
                        entries.add(ModBlocks.POLISHED_MARBLE_WALL);
                        entries.add(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL);
                        entries.add(ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS);

                        entries.add(ModBlocks.BLADEWOOD_LOG);
                        entries.add(ModBlocks.BLADEWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_BLADEWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_BLADEWOOD_WOOD);
                        entries.add(ModBlocks.BLADEWOOD_LEAVES);
                        entries.add(ModBlocks.BLADEWOOD_SAPLING);
                        entries.add(ModBlocks.BLADEWOOD_PLANKS);
                        entries.add(ModBlocks.BLADEWOOD_STAIRS);
                        entries.add(ModBlocks.BLADEWOOD_SLAB);
                        entries.add(ModBlocks.BLADEWOOD_FENCE);
                        entries.add(ModBlocks.BLADEWOOD_FENCE_GATE);
                        entries.add(ModBlocks.BLADEWOOD_BUTTON);
                        entries.add(ModBlocks.BLADEWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLADEWOOD_DOOR);
                        entries.add(ModBlocks.BLADEWOOD_TRAPDOOR);

                        entries.add(ModBlocks.OAK_CHAIR);
                        entries.add(ModBlocks.BIRCH_CHAIR);
                        entries.add(ModBlocks.SPRUCE_CHAIR);
                        entries.add(ModBlocks.JUNGLE_CHAIR);
                        entries.add(ModBlocks.DARK_OAK_CHAIR);
                        entries.add(ModBlocks.ACACIA_CHAIR);
                        entries.add(ModBlocks.MANGROVE_CHAIR);
                        entries.add(ModBlocks.CHERRY_CHAIR);
                        entries.add(ModBlocks.WARPED_CHAIR);
                        entries.add(ModBlocks.CRIMSON_CHAIR);
                        entries.add(ModBlocks.BLADEWOOD_CHAIR);

                        entries.add(ModBlocks.OAK_TABLE);
                        entries.add(ModBlocks.BIRCH_TABLE);
                        entries.add(ModBlocks.SPRUCE_TABLE);
                        entries.add(ModBlocks.JUNGLE_TABLE);
                        entries.add(ModBlocks.DARK_OAK_TABLE);
                        entries.add(ModBlocks.ACACIA_TABLE);
                        entries.add(ModBlocks.MANGROVE_TABLE);
                        entries.add(ModBlocks.CHERRY_TABLE);
                        entries.add(ModBlocks.WARPED_TABLE);
                        entries.add(ModBlocks.CRIMSON_TABLE);
                        entries.add(ModBlocks.BLADEWOOD_TABLE);
                        entries.add(ModBlocks.GLASS_TABLE);

                        entries.add(ModBlocks.OAK_SHELF);
                        entries.add(ModBlocks.BIRCH_SHELF);
                        entries.add(ModBlocks.SPRUCE_SHELF);
                        entries.add(ModBlocks.JUNGLE_SHELF);
                        entries.add(ModBlocks.ACACIA_SHELF);
                        entries.add(ModBlocks.DARK_OAK_SHELF);
                        entries.add(ModBlocks.CHERRY_SHELF);
                        entries.add(ModBlocks.MANGROVE_SHELF);
                        entries.add(ModBlocks.CRIMSON_SHELF);
                        entries.add(ModBlocks.WARPED_SHELF);
                        entries.add(ModBlocks.BLADEWOOD_SHELF);

                    }).build());

    public static final ItemGroup SCPCRAFT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SCPcraftReinforced.MOD_ID, "scpcraft_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IRON_BLAST))
                    .displayName(Text.translatable("itemgroup.scpcraftreinforced.scpcraftreinforced_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.PLATINUM_SWORD);
                        entries.add(ModItems.PLATINUM_PICKAXE);
                        entries.add(ModItems.PLATINUM_SHOVEL);
                        entries.add(ModItems.PLATINUM_AXE);
                        entries.add(ModItems.PLATINUM_HOE);
                        entries.add(ModItems.PLATINUM_HELMET);
                        entries.add(ModItems.PLATINUM_CHESTPLATE);
                        entries.add(ModItems.PLATINUM_LEGGINGS);
                        entries.add(ModItems.PLATINUM_BOOTS);
                        entries.add(ModItems.RAW_IRIDIUM);
                        entries.add(ModItems.IRIDIUM_INGOT);
                        entries.add(ModItems.IRIDIUM_SWORD);
                        entries.add(ModItems.IRIDIUM_PICKAXE);
                        entries.add(ModItems.IRIDIUM_SHOVEL);
                        entries.add(ModItems.IRIDIUM_AXE);
                        entries.add(ModItems.IRIDIUM_HOE);
                        entries.add(ModItems.IRIDIUM_HELMET);
                        entries.add(ModItems.IRIDIUM_CHESTPLATE);
                        entries.add(ModItems.IRIDIUM_LEGGINGS);
                        entries.add(ModItems.IRIDIUM_BOOTS);
                        entries.add(ModItems.IRON_BLAST);
                        entries.add(ModItems.BLISTER_STEEL_INGOT);
                        entries.add(ModItems.BLADEWOOD_SWORD);
                        entries.add(ModItems.BLADEWOOD_PICKAXE);
                        entries.add(ModItems.BLADEWOOD_SHOVEL);
                        entries.add(ModItems.BLADEWOOD_AXE);
                        entries.add(ModItems.BLADEWOOD_HOE);

                    }).build());

    public static final ItemGroup SCPCRAFT_MUSIC_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SCPcraftReinforced.MOD_ID, "scpcraft_music_discs_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GENDER_SWITCHER_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.scpcraftreinforced.scpcraftreinforced_music_discs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LIVING_ROOM_MUSIC_DISC);
                        entries.add(ModItems.SKELETON_KEY_MUSIC_DISC);
                        entries.add(ModItems.FOUNTAIN_OF_YOUTH_MUSIC_DISC);
                        entries.add(ModItems.ZOMBIE_PLAGUE_MUSIC_DISC);
                        entries.add(ModItems.RED_ICE_MUSIC_DISC);
                        entries.add(ModItems.BAD_COMPOSITION_MUSIC_DISC);
                        entries.add(ModItems.SUPER_BALL_MUSIC_DISC);
                        entries.add(ModItems.UNSEEN_MOLD_MUSIC_DISC);
                        entries.add(ModItems.POSSESSIVE_MASK_MUSIC_DISC);
                        entries.add(ModItems.EVERYTHING_TREE_MUSIC_DISC);
                        entries.add(ModItems.PLAGUE_DOCTOR_MUSIC_DISC);
                        entries.add(ModItems.ERICS_TOY_MUSIC_DISC);
                        entries.add(ModItems.OLD_AI_MUSIC_DISC);
                        entries.add(ModItems.DARK_FORM_MUSIC_DISC);
                        entries.add(ModItems.ENDLESS_STAIRCASE_MUSIC_DISC);
                        entries.add(ModItems.SHY_GUY_MUSIC_DISC);
                        entries.add(ModItems.OLD_MAN_MUSIC_DISC);
                        entries.add(ModItems.GENDER_SWITCHER_MUSIC_DISC);
                        entries.add(ModItems.EYEPODS_MUSIC_DISC);
                        entries.add(ModItems.TELEKILL_ALLOY_MUSIC_DISC);
                        entries.add(ModItems.SCULPTURE_MUSIC_DISC);
                        entries.add(ModItems.SPECS_MUSIC_DISC);
                        entries.add(ModItems.REWIND_MAN_MUSIC_DISC);
                        entries.add(ModItems.SHADOW_LAMPS_MUSIC_DISC);
                        entries.add(ModItems.COLA_BOTTLE_MUSIC_DISC);
                        entries.add(ModItems.COFFEE_MACHINE_MUSIC_DISC);
                        entries.add(ModItems.TAKE_ONLY_TWO_MUSIC_DISC);
                        entries.add(ModItems.PERIPHERAL_JUMPER_MUSIC_DISC);
                        entries.add(ModItems.SONG_OF_GENESIS_MUSIC_DISC);
                        entries.add(ModItems.CONTAGIOUS_CRYSTAL_MUSIC_DISC);
                        entries.add(ModItems.BURNING_MAN_MUSIC_DISC);
                        entries.add(ModItems.COWBELL_MUSIC_DISC);
                        entries.add(ModItems.EYE_SPIDERS_MUSIC_DISC);
                        entries.add(ModItems.CRYSTALLINE_BUTTERFLIES_MUSIC_DISC);
                        entries.add(ModItems.BLACK_STATUE_MUSIC_DISC);
                        entries.add(ModItems.JADED_RING_MUSIC_DISC);
                        entries.add(ModItems.SWAMP_WOMAN_MUSIC_DISC);
                        entries.add(ModItems.BLUE_KEY_MUSIC_DISC);
                        entries.add(ModItems.CAMERA_DISRUPTION_MUSIC_DISC);
                        entries.add(ModItems.CLOCKWORKS_MUSIC_DISC);
                        entries.add(ModItems.WITH_MANY_VOICES_MUSIC_DISC);
                        entries.add(ModItems.SLEEP_KILLER_MUSIC_DISC);
                        entries.add(ModItems.RECURSIVE_ROOM_MUSIC_DISC);
                        entries.add(ModItems.BIRTHDAY_MONKEY_MUSIC_DISC);


                    }).build());

    public static void registerItemGroups() {
        SCPcraftReinforced.LOGGER.info("Registering Item Groups from " + SCPcraftReinforced.MOD_ID);
    }
}
