package net.cyntax.scpcraftreinforced.block;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.block.custom.ChairBlock;
import net.cyntax.scpcraftreinforced.block.custom.GlassTableBlock;
import net.cyntax.scpcraftreinforced.block.custom.ShelfBlock;
import net.cyntax.scpcraftreinforced.block.custom.TableBlock;
import net.cyntax.scpcraftreinforced.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5f, 3)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5f, 3)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block BLISTER_STEEL_BLOCK = registerBlock("blister_steel_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f, 7)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5f, 7)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.5f, 7)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));









    public static final Block DEEP_GRANITE = registerBlock("deep_granite",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE = registerBlock("polished_deep_granite",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DEEP_GRANITE_BRICKS = registerBlock("polished_deep_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS = registerBlock("cracked_polished_deep_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS = registerBlock("mossy_polished_deep_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_POLISHED_DEEP_GRANITE_BRICKS = registerBlock("chiseled_polished_deep_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f, 6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEP_GRANITE_STAIRS = registerBlock("deep_granite_stairs",
            new StairsBlock(ModBlocks.DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEP_GRANITE_SLAB = registerBlock("deep_granite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block  DEEP_GRANITE_BUTTON = registerBlock("deep_granite_button",
            new ButtonBlock(BlockSetType.IRON, 6, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

    public static final Block DEEP_GRANITE_WALL= registerBlock("deep_granite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE_STAIRS = registerBlock("polished_deep_granite_stairs",
            new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE_SLAB = registerBlock("polished_deep_granite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE_WALL= registerBlock("polished_deep_granite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE_PRESSURE_PLATE = registerBlock("polished_deep_granite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

    public static final Block POLISHED_DEEP_GRANITE_BRICKS_STAIRS = registerBlock("polished_deep_granite_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE_BRICKS_SLAB = registerBlock("polished_deep_granite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEP_GRANITE_BRICKS_WALL= registerBlock("polished_deep_granite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS = registerBlock("cracked_polished_deep_granite_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB = registerBlock("cracked_polished_deep_granite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL= registerBlock("cracked_polished_deep_granite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS = registerBlock("mossy_polished_deep_granite_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB = registerBlock("mossy_polished_deep_granite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL= registerBlock("mossy_polished_deep_granite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));











    public static final Block MARBLE = registerBlock("marble",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE = registerBlock("polished_marble",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_MARBLE_BRICKS = registerBlock("polished_marble_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_POLISHED_MARBLE_BRICKS = registerBlock("cracked_polished_marble_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_POLISHED_MARBLE_BRICKS = registerBlock("mossy_polished_marble_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_POLISHED_MARBLE_BRICKS = registerBlock("chiseled_polished_marble_bricks",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new StairsBlock(ModBlocks.MARBLE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MARBLE_BUTTON = registerBlock("marble_button",
            new ButtonBlock(BlockSetType.IRON, 6, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

    public static final Block MARBLE_WALL= registerBlock("marble_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE_WALL= registerBlock("polished_marble_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE_PRESSURE_PLATE = registerBlock("polished_marble_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

    public static final Block POLISHED_MARBLE_BRICKS_STAIRS = registerBlock("polished_marble_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE_BRICKS_SLAB = registerBlock("polished_marble_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE_BRICKS_WALL= registerBlock("polished_marble_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_POLISHED_MARBLE_BRICKS_STAIRS = registerBlock("cracked_polished_marble_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_POLISHED_MARBLE_BRICKS_SLAB = registerBlock("cracked_polished_marble_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_POLISHED_MARBLE_BRICKS_WALL= registerBlock("cracked_polished_marble_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_POLISHED_MARBLE_BRICKS_STAIRS = registerBlock("mossy_polished_marble_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_POLISHED_MARBLE_BRICKS_SLAB = registerBlock("mossy_polished_marble_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_POLISHED_MARBLE_BRICKS_WALL= registerBlock("mossy_polished_marble_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));










    public static final Block BLADEWOOD_LOG = registerBlock("bladewood_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_WOOD = registerBlock("bladewood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block STRIPPED_BLADEWOOD_LOG = registerBlock("stripped_bladewood_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block STRIPPED_BLADEWOOD_WOOD = registerBlock("stripped_bladewood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_PLANKS = registerBlock("bladewood_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(5f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_LEAVES = registerBlock("bladewood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));

    public static final Block BLADEWOOD_SAPLING = registerBlock("bladewood_sapling",
            new SaplingBlock(ModSaplingGenerators.BLADEWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block BLADEWOOD_STAIRS = registerBlock("bladewood_stairs",
            new StairsBlock(ModBlocks.BLADEWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_SLAB = registerBlock("bladewood_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_BUTTON = registerBlock("bladewood_button",
            new ButtonBlock(BlockSetType.CHERRY, 6, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).noCollision()));

    public static final Block BLADEWOOD_PRESSURE_PLATE = registerBlock("bladewood_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).noCollision()));

    public static final Block BLADEWOOD_FENCE = registerBlock("bladewood_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_FENCE_GATE = registerBlock("bladewood_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_DOOR = registerBlock("bladewood_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));

    public static final Block BLADEWOOD_TRAPDOOR = registerBlock("bladewood_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));










    public static final Block OAK_CHAIR = registerBlock("oak_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLADEWOOD_CHAIR = registerBlock("bladewood_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_CHAIR = registerBlock("warped_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
            new ChairBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));


    public static final Block OAK_TABLE = registerBlock("oak_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_TABLE = registerBlock("birch_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_TABLE = registerBlock("spruce_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_TABLE = registerBlock("jungle_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_TABLE = registerBlock("acacia_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_TABLE = registerBlock("cherry_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_TABLE = registerBlock("mangrove_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLADEWOOD_TABLE = registerBlock("bladewood_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_TABLE = registerBlock("warped_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CRIMSON_TABLE = registerBlock("crimson_table",
            new TableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block GLASS_TABLE = registerBlock("glass_table",
            new GlassTableBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.GLASS)));


    public static final Block REINFORCED_GLASS = registerBlock("reinforced_glass",
            new TranslucentBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block REINFORCED_GLASS_PANE = registerBlock("reinforced_glass_pane",
            new PaneBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()));


    public static final Block OAK_SHELF = registerBlock("oak_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_SHELF = registerBlock("birch_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_SHELF = registerBlock("spruce_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_SHELF = registerBlock("jungle_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_SHELF = registerBlock("acacia_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_SHELF = registerBlock("dark_oak_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block MANGROVE_SHELF = registerBlock("mangrove_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_SHELF = registerBlock("cherry_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_SHELF = registerBlock("warped_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_SHELF = registerBlock("crimson_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLADEWOOD_SHELF = registerBlock("bladewood_shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));








    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SCPcraftReinforced.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SCPcraftReinforced.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        SCPcraftReinforced.LOGGER.info("Registering modded blocks from " + SCPcraftReinforced.MOD_ID);
    }
}
