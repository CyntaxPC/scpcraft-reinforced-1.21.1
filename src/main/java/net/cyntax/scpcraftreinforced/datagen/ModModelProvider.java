
package net.cyntax.scpcraftreinforced.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_IRIDIUM_ORE);
        BlockStateModelGenerator.BlockTexturePool blisterSteelBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLISTER_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool platinumBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATINUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool iridiumBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.IRIDIUM_BLOCK);

        blisterSteelBlockPool.stairs(ModBlocks.BLISTER_STEEL_BLOCK_STAIRS);
        blisterSteelBlockPool.slab(ModBlocks.BLISTER_STEEL_BLOCK_SLAB);

        platinumBlockPool.stairs(ModBlocks.PLATINUM_BLOCK_STAIRS);
        platinumBlockPool.slab(ModBlocks.PLATINUM_BLOCK_SLAB);

        iridiumBlockPool.stairs(ModBlocks.IRIDIUM_BLOCK_STAIRS);
        iridiumBlockPool.slab(ModBlocks.IRIDIUM_BLOCK_SLAB);



        blockStateModelGenerator.registerGlassPane(ModBlocks.REINFORCED_GLASS, ModBlocks.REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.IRON_GRATE, ModBlocks.IRON_MESH_FENCE);


        BlockStateModelGenerator.BlockTexturePool deepGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEP_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DEEP_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedPolishedDeepGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedDeepGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS);


        deepGranitePool.stairs(ModBlocks.DEEP_GRANITE_STAIRS);
        deepGranitePool.slab(ModBlocks.DEEP_GRANITE_SLAB);
        deepGranitePool.wall(ModBlocks.DEEP_GRANITE_WALL);
        deepGranitePool.button(ModBlocks.DEEP_GRANITE_BUTTON);
        polishedDeepGranitePool.stairs(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS);
        polishedDeepGranitePool.slab(ModBlocks.POLISHED_DEEP_GRANITE_SLAB);
        polishedDeepGranitePool.wall(ModBlocks.POLISHED_DEEP_GRANITE_WALL);
        polishedDeepGranitePool.pressurePlate(ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE);
        polishedDeepGraniteBricksPool.stairs(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        polishedDeepGraniteBricksPool.slab(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        polishedDeepGraniteBricksPool.wall(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);
        crackedPolishedDeepGraniteBricksPool.stairs(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        crackedPolishedDeepGraniteBricksPool.slab(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        crackedPolishedDeepGraniteBricksPool.wall(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL);
        mossyPolishedDeepGraniteBricksPool.stairs(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        mossyPolishedDeepGraniteBricksPool.slab(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        mossyPolishedDeepGraniteBricksPool.wall(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL);



        BlockStateModelGenerator.BlockTexturePool marblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        BlockStateModelGenerator.BlockTexturePool polishedMarblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE);
        BlockStateModelGenerator.BlockTexturePool polishedMarbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedPolishedMarbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedMarbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS);
        marblePool.stairs(ModBlocks.MARBLE_STAIRS);
        marblePool.slab(ModBlocks.MARBLE_SLAB);
        marblePool.wall(ModBlocks.MARBLE_WALL);
        marblePool.button(ModBlocks.MARBLE_BUTTON);
        polishedMarblePool.stairs(ModBlocks.POLISHED_MARBLE_STAIRS);
        polishedMarblePool.slab(ModBlocks.POLISHED_MARBLE_SLAB);
        polishedMarblePool.wall(ModBlocks.POLISHED_MARBLE_WALL);
        polishedMarblePool.pressurePlate(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE);
        polishedMarbleBricksPool.stairs(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
        polishedMarbleBricksPool.slab(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB);
        polishedMarbleBricksPool.wall(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);
        crackedPolishedMarbleBricksPool.stairs(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS);
        crackedPolishedMarbleBricksPool.slab(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB);
        crackedPolishedMarbleBricksPool.wall(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL);
        mossyPolishedMarbleBricksPool.stairs(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS);
        mossyPolishedMarbleBricksPool.slab(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB);
        mossyPolishedMarbleBricksPool.wall(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL);


        blockStateModelGenerator.registerLog(ModBlocks.BLADEWOOD_LOG).log(ModBlocks.BLADEWOOD_LOG).wood(ModBlocks.BLADEWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLADEWOOD_LOG).log(ModBlocks.STRIPPED_BLADEWOOD_LOG).wood(ModBlocks.STRIPPED_BLADEWOOD_WOOD);
        BlockStateModelGenerator.BlockTexturePool bladewoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLADEWOOD_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLADEWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.BLADEWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        bladewoodPool.stairs(ModBlocks.BLADEWOOD_STAIRS);
        bladewoodPool.slab(ModBlocks.BLADEWOOD_SLAB);
        bladewoodPool.fence(ModBlocks.BLADEWOOD_FENCE);
        bladewoodPool.fenceGate(ModBlocks.BLADEWOOD_FENCE_GATE);
        bladewoodPool.button(ModBlocks.BLADEWOOD_BUTTON);
        bladewoodPool.pressurePlate(ModBlocks.BLADEWOOD_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.BLADEWOOD_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.BLISTER_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLADEWOOD_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLISTER_STEEL_TRAPDOOR);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OAK_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BIRCH_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.JUNGLE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DARK_OAK_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MANGROVE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLADEWOOD_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WARPED_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CRIMSON_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.IRON_CHAIR);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OAK_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BIRCH_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.JUNGLE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DARK_OAK_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MANGROVE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLADEWOOD_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WARPED_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CRIMSON_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.IRON_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GLASS_TABLE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_IRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BLAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLISTER_STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.GENDER_SWITCHER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNING_MAN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EYEPODS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_ICE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWAMP_WOMAN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSEEN_MOLD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_FORM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TELEKILL_ALLOY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SKELETON_KEY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPER_BALL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOUNTAIN_OF_YOUTH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVERYTHING_TREE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.REWIND_MAN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SONG_OF_GENESIS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EYE_SPIDERS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_ROOM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZOMBIE_PLAGUE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAD_COMPOSITION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.POSSESSIVE_MASK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLAGUE_DOCTOR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ERICS_TOY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLD_AI_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDLESS_STAIRCASE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHY_GUY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLD_MAN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCULPTURE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPECS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADOW_LAMPS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COLA_BOTTLE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COFFEE_MACHINE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TAKE_ONLY_TWO_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PERIPHERAL_JUMPER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONTAGIOUS_CRYSTAL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COWBELL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRYSTALLINE_BUTTERFLIES_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_STATUE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADED_RING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_KEY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAMERA_DISRUPTION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOCKWORKS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITH_MANY_VOICES_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLEEP_KILLER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RECURSIVE_ROOM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRTHDAY_MONKEY_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModBlocks.BLADEWOOD_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModBlocks.OAK_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BIRCH_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.SPRUCE_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.JUNGLE_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.DARK_OAK_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.ACACIA_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MANGROVE_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CHERRY_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BLADEWOOD_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.WARPED_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CRIMSON_CHAIR.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.IRON_CHAIR.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModBlocks.OAK_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BIRCH_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.SPRUCE_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.JUNGLE_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.DARK_OAK_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.ACACIA_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MANGROVE_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CHERRY_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BLADEWOOD_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.WARPED_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CRIMSON_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.GLASS_TABLE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.IRON_TABLE.asItem(), Models.GENERATED);



        itemModelGenerator.register(ModItems.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRIDIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLADEWOOD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLADEWOOD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLADEWOOD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLADEWOOD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLADEWOOD_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATINUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRIDIUM_BOOTS));

    }
}
