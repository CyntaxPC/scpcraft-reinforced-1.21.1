package net.cyntax.scpcraftreinforced.datagen;

import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.IRIDIUM_BLOCK)
                .add(ModBlocks.BLISTER_STEEL_BLOCK)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE)
                .add(ModBlocks.DEEP_GRANITE)
                .add(ModBlocks.POLISHED_DEEP_GRANITE)
                .add(ModBlocks.MARBLE)
                .add(ModBlocks.POLISHED_MARBLE)
                .add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS)
                .add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS)
                .add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS)
                .add(ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS)
                .add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB)
                .add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB)
                .add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS)
                .add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS)
                .add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL)
                .add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_MARBLE_BRICKS)
                .add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS)
                .add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS)
                .add(ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS)
                .add(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB)
                .add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB)
                .add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS)
                .add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS)
                .add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_MARBLE_BRICKS_WALL)
                .add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL)
                .add(ModBlocks.REINFORCED_GLASS)
                .add(ModBlocks.REINFORCED_GLASS_PANE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLADEWOOD_LOG)
                .add(ModBlocks.BLADEWOOD_WOOD)
                .add(ModBlocks.STRIPPED_BLADEWOOD_LOG)
                .add(ModBlocks.STRIPPED_BLADEWOOD_WOOD)
                .add(ModBlocks.BLADEWOOD_CHAIR)
                .add(ModBlocks.BLADEWOOD_TABLE)
                .add(ModBlocks.BLADEWOOD_SLAB)
                .add(ModBlocks.BLADEWOOD_STAIRS)
                .add(ModBlocks.BLADEWOOD_FENCE)
                .add(ModBlocks.BLADEWOOD_BUTTON)
                .add(ModBlocks.BLADEWOOD_PRESSURE_PLATE)
                .add(ModBlocks.BLADEWOOD_DOOR)
                .add(ModBlocks.BLADEWOOD_TRAPDOOR)
                .add(ModBlocks.BLADEWOOD_FENCE_GATE)
                .add(ModBlocks.BLADEWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.IRIDIUM_BLOCK)
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE)
                .add(ModBlocks.BLADEWOOD_LOG)
                .add(ModBlocks.BLADEWOOD_WOOD)
                .add(ModBlocks.STRIPPED_BLADEWOOD_LOG)
                .add(ModBlocks.STRIPPED_BLADEWOOD_WOOD)
                .add(ModBlocks.BLADEWOOD_CHAIR)
                .add(ModBlocks.BLADEWOOD_TABLE)
                .add(ModBlocks.BLADEWOOD_SLAB)
                .add(ModBlocks.BLADEWOOD_STAIRS)
                .add(ModBlocks.BLADEWOOD_FENCE)
                .add(ModBlocks.BLADEWOOD_BUTTON)
                .add(ModBlocks.BLADEWOOD_PRESSURE_PLATE)
                .add(ModBlocks.BLADEWOOD_DOOR)
                .add(ModBlocks.BLADEWOOD_TRAPDOOR)
                .add(ModBlocks.BLADEWOOD_FENCE_GATE)
                .add(ModBlocks.BLADEWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.BLISTER_STEEL_BLOCK)
                .add(ModBlocks.REINFORCED_GLASS)
                .add(ModBlocks.REINFORCED_GLASS_PANE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLADEWOOD_LOG)
                .add(ModBlocks.BLADEWOOD_WOOD)
                .add(ModBlocks.STRIPPED_BLADEWOOD_LOG)
                .add(ModBlocks.STRIPPED_BLADEWOOD_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.BLADEWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BLADEWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DEEP_GRANITE_WALL)
                .add(ModBlocks.POLISHED_DEEP_GRANITE_WALL)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.POLISHED_MARBLE_WALL)
                .add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL)
                .add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_MARBLE_BRICKS_WALL)
                .add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PLATINUM_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_IRIDIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BLADEWOOD_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

    }
}
