package net.cyntax.scpcraftreinforced.datagen;

import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, oreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_IRIDIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_IRIDIUM_ORE, ModItems.RAW_IRIDIUM));
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.IRIDIUM_BLOCK);
        addDrop(ModBlocks.BLISTER_STEEL_BLOCK);

        addDrop(ModBlocks.DEEP_GRANITE);
        addDrop(ModBlocks.DEEP_GRANITE_SLAB, slabDrops(ModBlocks.DEEP_GRANITE_SLAB));
        addDrop(ModBlocks.DEEP_GRANITE_STAIRS);
        addDrop(ModBlocks.DEEP_GRANITE_BUTTON);
        addDrop(ModBlocks.DEEP_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_SLAB, slabDrops(ModBlocks.POLISHED_DEEP_GRANITE_SLAB));
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB, slabDrops(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB));
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        addDrop(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
        addDrop(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
        addDrop(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS);

        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.MARBLE_SLAB, slabDrops(ModBlocks.MARBLE_SLAB));
        addDrop(ModBlocks.MARBLE_STAIRS);
        addDrop(ModBlocks.MARBLE_BUTTON);
        addDrop(ModBlocks.MARBLE_WALL);
        addDrop(ModBlocks.POLISHED_MARBLE);
        addDrop(ModBlocks.POLISHED_MARBLE_SLAB, slabDrops(ModBlocks.POLISHED_MARBLE_SLAB));
        addDrop(ModBlocks.POLISHED_MARBLE_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_MARBLE_WALL);
        addDrop(ModBlocks.POLISHED_MARBLE_BRICKS);
        addDrop(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB, slabDrops(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB));
        addDrop(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        addDrop(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        addDrop(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS);

        addDrop(ModBlocks.BLADEWOOD_LOG);
        addDrop(ModBlocks.BLADEWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_BLADEWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_BLADEWOOD_LOG);
        addDrop(ModBlocks.BLADEWOOD_PLANKS);
        addDrop(ModBlocks.BLADEWOOD_SAPLING);
        addDrop(ModBlocks.BLADEWOOD_SLAB, slabDrops(ModBlocks.BLADEWOOD_SLAB));
        addDrop(ModBlocks.BLADEWOOD_STAIRS);
        addDrop(ModBlocks.BLADEWOOD_BUTTON);
        addDrop(ModBlocks.BLADEWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.BLADEWOOD_DOOR, doorDrops(ModBlocks.BLADEWOOD_DOOR));
        addDrop(ModBlocks.BLADEWOOD_TRAPDOOR);
        addDrop(ModBlocks.BLADEWOOD_FENCE);
        addDrop(ModBlocks.BLADEWOOD_FENCE_GATE);
        addDrop(ModBlocks.BLADEWOOD_LEAVES, leavesDrops(ModBlocks.BLADEWOOD_LEAVES, ModBlocks.BLADEWOOD_SAPLING, 0.0625f));

        addDrop(ModBlocks.OAK_CHAIR);
        addDrop(ModBlocks.BIRCH_CHAIR);
        addDrop(ModBlocks.SPRUCE_CHAIR);
        addDrop(ModBlocks.JUNGLE_CHAIR);
        addDrop(ModBlocks.DARK_OAK_CHAIR);
        addDrop(ModBlocks.ACACIA_CHAIR);
        addDrop(ModBlocks.CHERRY_CHAIR);
        addDrop(ModBlocks.MANGROVE_CHAIR);
        addDrop(ModBlocks.BLADEWOOD_CHAIR);
        addDrop(ModBlocks.WARPED_CHAIR);
        addDrop(ModBlocks.CRIMSON_CHAIR);

        addDrop(ModBlocks.OAK_TABLE);
        addDrop(ModBlocks.BIRCH_TABLE);
        addDrop(ModBlocks.SPRUCE_TABLE);
        addDrop(ModBlocks.JUNGLE_TABLE);
        addDrop(ModBlocks.DARK_OAK_TABLE);
        addDrop(ModBlocks.ACACIA_TABLE);
        addDrop(ModBlocks.CHERRY_TABLE);
        addDrop(ModBlocks.MANGROVE_TABLE);
        addDrop(ModBlocks.BLADEWOOD_TABLE);
        addDrop(ModBlocks.WARPED_TABLE);
        addDrop(ModBlocks.CRIMSON_TABLE);
        addDrop(ModBlocks.GLASS_TABLE);

        addDrop(ModBlocks.OAK_SHELF);
        addDrop(ModBlocks.BIRCH_SHELF);
        addDrop(ModBlocks.SPRUCE_SHELF);
        addDrop(ModBlocks.JUNGLE_SHELF);
        addDrop(ModBlocks.ACACIA_SHELF);
        addDrop(ModBlocks.DARK_OAK_SHELF);
        addDrop(ModBlocks.CHERRY_SHELF);
        addDrop(ModBlocks.MANGROVE_SHELF);
        addDrop(ModBlocks.CRIMSON_SHELF);
        addDrop(ModBlocks.WARPED_SHELF);
        addDrop(ModBlocks.BLADEWOOD_SHELF);

        addDrop(ModBlocks.REINFORCED_GLASS);
        addDrop(ModBlocks.REINFORCED_GLASS_PANE);

    }
}
