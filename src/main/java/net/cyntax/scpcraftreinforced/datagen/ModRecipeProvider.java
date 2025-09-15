package net.cyntax.scpcraftreinforced.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM, ModBlocks.DEEPSLATE_PLATINUM_ORE);
        List<ItemConvertible> IRIDIUM_SMELTABLES = List.of(ModItems.RAW_IRIDIUM, ModBlocks.DEEPSLATE_IRIDIUM_ORE);
        List<ItemConvertible> STEEL_BLASTABLES = List.of(ModItems.IRON_BLAST);

        List<ItemConvertible> DEEP_GRANITE_BRICK_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
        List<ItemConvertible> POLISHED_DEEP_GRANITE_BRICK_SLAB_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        List<ItemConvertible> POLISHED_DEEP_GRANITE_BRICK_STAIR_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        List<ItemConvertible> POLISHED_DEEP_GRANITE_BRICK_WALL_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);

        List<ItemConvertible> MARBLE_BRICK_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS);
        List<ItemConvertible> POLISHED_MARBLE_BRICK_SLAB_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB);
        List<ItemConvertible> POLISHED_MARBLE_BRICK_STAIR_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
        List<ItemConvertible> POLISHED_MARBLE_BRICK_WALL_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);


        offerSmelting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.3f, 200, "platinum_ingot");
        offerBlasting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.3f, 100, "platinum_ingot");
        offerSmelting(exporter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT, 0.3f, 200, "iridium_ingot");
        offerBlasting(exporter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT, 0.3f, 100, "iridium_ingot");
        offerBlasting(exporter, STEEL_BLASTABLES, RecipeCategory.MISC, ModItems.BLISTER_STEEL_INGOT, 0.5f, 100, "blister_steel_ingot");

        offerSmelting(exporter, DEEP_GRANITE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS, 0.15f, 200, "cracked_polished_deep_granite_bricks");
        offerBlasting(exporter, DEEP_GRANITE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS, 0.15f, 100, "cracked_polished_deep_granite_bricks");
        offerSmelting(exporter, POLISHED_DEEP_GRANITE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_deep_granite_bricks_slab");
        offerSmelting(exporter, POLISHED_DEEP_GRANITE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_deep_granite_bricks_stairs");
        offerSmelting(exporter, POLISHED_DEEP_GRANITE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL, 0.3f, 100, "cracked_polished_deep_granite_bricks_wall");
        offerBlasting(exporter, POLISHED_DEEP_GRANITE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_deep_granite_bricks_slab");
        offerBlasting(exporter, POLISHED_DEEP_GRANITE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_deep_granite_bricks_stairs");
        offerBlasting(exporter, POLISHED_DEEP_GRANITE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL, 0.3f, 100, "cracked_polished_deep_granite_bricks_wall");

        offerSmelting(exporter, MARBLE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS, 0.15f, 200, "cracked_polished_marble_bricks");
        offerBlasting(exporter, MARBLE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS, 0.15f, 100, "cracked_polished_marble_bricks");
        offerSmelting(exporter, POLISHED_MARBLE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_marble_bricks_slab");
        offerSmelting(exporter, POLISHED_MARBLE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_marble_bricks_stairs");
        offerSmelting(exporter, POLISHED_MARBLE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL, 0.3f, 100, "cracked_polished_marble_bricks_wall");
        offerBlasting(exporter, POLISHED_MARBLE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_marble_bricks_slab");
        offerBlasting(exporter, POLISHED_MARBLE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_marble_bricks_stairs");
        offerBlasting(exporter, POLISHED_MARBLE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL, 0.3f, 100, "cracked_polished_marble_bricks_wall");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.PLATINUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IRIDIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.IRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLISTER_STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLISTER_STEEL_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLISTER_STEEL_BLOCK_SLAB, ModBlocks.BLISTER_STEEL_BLOCK);
        createStairsRecipe(ModBlocks.BLISTER_STEEL_BLOCK_STAIRS, Ingredient.ofItems(ModBlocks.BLISTER_STEEL_BLOCK))
                .criterion(hasItem(ModBlocks.BLISTER_STEEL_BLOCK), conditionsFromItem(ModBlocks.BLISTER_STEEL_BLOCK))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK_SLAB, ModBlocks.PLATINUM_BLOCK);
        createStairsRecipe(ModBlocks.PLATINUM_BLOCK_STAIRS, Ingredient.ofItems(ModBlocks.PLATINUM_BLOCK))
                .criterion(hasItem(ModBlocks.PLATINUM_BLOCK), conditionsFromItem(ModBlocks.PLATINUM_BLOCK))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.IRIDIUM_BLOCK_SLAB, ModBlocks.IRIDIUM_BLOCK);
        createStairsRecipe(ModBlocks.IRIDIUM_BLOCK_STAIRS, Ingredient.ofItems(ModBlocks.IRIDIUM_BLOCK))
                .criterion(hasItem(ModBlocks.IRIDIUM_BLOCK), conditionsFromItem(ModBlocks.IRIDIUM_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_BLAST, 1)
                .input(Items.CHARCOAL)
                .input(Items.RAW_IRON)
                .criterion(hasItem(Items.RAW_IRON), conditionsFromItem(Items.RAW_IRON))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE, 4)
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', ModBlocks.DEEP_GRANITE)
                .criterion(hasItem(ModBlocks.DEEP_GRANITE), conditionsFromItem(ModBlocks.DEEP_GRANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS, 4)
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', ModBlocks.POLISHED_DEEP_GRANITE)
                .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS, 1)
                .pattern("X  ")
                .pattern("X  ")
                .pattern("   ")
                .input('X', ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB)
                .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS, 1)
                .input(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                .offerTo(exporter,"mossy_deep_granite_from_vine");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS, 1)
                .input(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                .offerTo(exporter,"mossy_deep_granite_from_moss");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_GRANITE_BUTTON, 1)
                .pattern("X  ")
                .pattern("   ")
                .pattern("   ")
                .input('X', ModBlocks.DEEP_GRANITE)
                .criterion(hasItem(ModBlocks.DEEP_GRANITE), conditionsFromItem(ModBlocks.DEEP_GRANITE))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DEEP_GRANITE_WALL, ModBlocks.DEEP_GRANITE);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.DEEP_GRANITE_SLAB, ModBlocks.DEEP_GRANITE);
        createStairsRecipe(ModBlocks.DEEP_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.DEEP_GRANITE))
                .criterion(hasItem(ModBlocks.DEEP_GRANITE), conditionsFromItem(ModBlocks.DEEP_GRANITE))
                .offerTo(exporter);

        offerPressurePlateRecipe(exporter,ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE, ModBlocks.POLISHED_DEEP_GRANITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_WALL, ModBlocks.POLISHED_DEEP_GRANITE);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_SLAB, ModBlocks.POLISHED_DEEP_GRANITE);
        createStairsRecipe(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DEEP_GRANITE))
                .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
        createStairsRecipe(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
        createStairsRecipe(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
        createStairsRecipe(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE, 4)
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_BRICKS, 4)
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', ModBlocks.POLISHED_MARBLE)
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS, 1)
                .pattern("X  ")
                .pattern("X  ")
                .pattern("   ")
                .input('X', ModBlocks.POLISHED_MARBLE_BRICKS_SLAB)
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS, 1)
                .input(ModBlocks.POLISHED_MARBLE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                .offerTo(exporter,"mossy_marble_from_vine");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS, 1)
                .input(ModBlocks.POLISHED_MARBLE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                .offerTo(exporter,"mossy_marble_from_moss");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MARBLE_BUTTON, 1)
                .pattern("X  ")
                .pattern("   ")
                .pattern("   ")
                .input('X', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE);
        createStairsRecipe(ModBlocks.MARBLE_STAIRS, Ingredient.ofItems(ModBlocks.MARBLE))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter);

        offerPressurePlateRecipe(exporter, ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE, ModBlocks.POLISHED_MARBLE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.POLISHED_MARBLE);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE);
        createStairsRecipe(ModBlocks.POLISHED_MARBLE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_MARBLE))
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_BRICKS_WALL, ModBlocks.POLISHED_MARBLE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_BRICKS_SLAB, ModBlocks.POLISHED_MARBLE_BRICKS);
        createStairsRecipe(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_MARBLE_BRICKS))
                .criterion(hasItem(ModBlocks.POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        createStairsRecipe(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS))
                .criterion(hasItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
        createStairsRecipe(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS))
                .offerTo(exporter);



        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                .input(ModBlocks.BLADEWOOD_LOG)
                .criterion(hasItem(ModBlocks.BLADEWOOD_LOG), conditionsFromItem(ModBlocks.BLADEWOOD_LOG))
                .offerTo(exporter,"bw_planks_from_log");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                .input(ModBlocks.STRIPPED_BLADEWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_BLADEWOOD_LOG), conditionsFromItem(ModBlocks.STRIPPED_BLADEWOOD_LOG))
                .offerTo(exporter,"bw_planks_from_stripped_log");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                .input(ModBlocks.BLADEWOOD_WOOD)
                .criterion(hasItem(ModBlocks.BLADEWOOD_WOOD), conditionsFromItem(ModBlocks.BLADEWOOD_WOOD))
                .offerTo(exporter,"bw_planks_from_wood");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                .input(ModBlocks.STRIPPED_BLADEWOOD_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_BLADEWOOD_WOOD), conditionsFromItem(ModBlocks.STRIPPED_BLADEWOOD_WOOD))
                .offerTo(exporter,"bw_planks_from_stripped_wood");

        createDoorRecipe(ModBlocks.BLADEWOOD_DOOR, Ingredient.ofItems(ModBlocks.BLADEWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        createDoorRecipe(ModBlocks.BLISTER_STEEL_DOOR, Ingredient.ofItems(ModItems.BLISTER_STEEL_INGOT))
                .criterion(hasItem(ModItems.BLISTER_STEEL_INGOT), conditionsFromItem(ModItems.BLISTER_STEEL_INGOT))
                .offerTo(exporter);

        createTrapdoorRecipe(ModBlocks.BLADEWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.BLADEWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        createTrapdoorRecipe(ModBlocks.BLISTER_STEEL_TRAPDOOR, Ingredient.ofItems(ModItems.BLISTER_STEEL_INGOT))
                .criterion(hasItem(ModItems.BLISTER_STEEL_INGOT), conditionsFromItem(ModItems.BLISTER_STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_BUTTON, 1)
                .pattern("X  ")
                .pattern("   ")
                .pattern("   ")
                .input('X', ModBlocks.BLADEWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        offerPressurePlateRecipe(exporter, ModBlocks.BLADEWOOD_PRESSURE_PLATE, ModBlocks.BLADEWOOD_PLANKS);
        createFenceRecipe(ModBlocks.BLADEWOOD_FENCE, Ingredient.ofItems(ModBlocks.BLADEWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        createFenceGateRecipe(ModBlocks.BLADEWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLADEWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLADEWOOD_SLAB, ModBlocks.BLADEWOOD_PLANKS);
        createStairsRecipe(ModBlocks.BLADEWOOD_STAIRS, Ingredient.ofItems(ModBlocks.BLADEWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IRON_GRATE, 2)
                .pattern("X X")
                .pattern(" X ")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OAK_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.OAK_SHELF)
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BIRCH_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.BIRCH_SHELF)
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SPRUCE_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.SPRUCE_SHELF)
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.JUNGLE_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.JUNGLE_SHELF)
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_OAK_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.DARK_OAK_SHELF)
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ACACIA_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.ACACIA_SHELF)
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.CHERRY_SHELF)
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MANGROVE_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.MANGROVE_SHELF)
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.BLADEWOOD_SHELF)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WARPED_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.WARPED_SHELF)
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRIMSON_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.CRIMSON_SHELF)
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GLASS_TABLE, 2)
                .pattern("WWW")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.GLASS)
                .criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IRON_TABLE, 2)
                .pattern("TTT")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.IRON_INGOT)
                .input('T', ModBlocks.IRON_SHELF)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OAK_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.OAK_PLANKS)
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BIRCH_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.BIRCH_PLANKS)
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SPRUCE_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.SPRUCE_PLANKS)
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.JUNGLE_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.JUNGLE_PLANKS)
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_OAK_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.DARK_OAK_PLANKS)
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ACACIA_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.ACACIA_PLANKS)
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.CHERRY_PLANKS)
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MANGROVE_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.MANGROVE_PLANKS)
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLADEWOOD_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', ModBlocks.BLADEWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WARPED_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.WARPED_PLANKS)
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRIMSON_CHAIR, 2)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .input('W', Blocks.CRIMSON_PLANKS)
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IRON_CHAIR, 2)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XX ")
                .input('X', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);



        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.OAK_SHELF, Blocks.OAK_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.BIRCH_SHELF, Blocks.BIRCH_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.SPRUCE_SHELF, Blocks.SPRUCE_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.JUNGLE_SHELF, Blocks.JUNGLE_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.ACACIA_SHELF, Blocks.ACACIA_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_OAK_SHELF, Blocks.DARK_OAK_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHERRY_SHELF, Blocks.CHERRY_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.MANGROVE_SHELF, Blocks.MANGROVE_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRIMSON_SHELF, Blocks.CRIMSON_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.WARPED_SHELF, Blocks.WARPED_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLADEWOOD_SHELF, ModBlocks.BLADEWOOD_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.IRON_SHELF, Items.IRON_INGOT);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_GLASS, 4)
                .pattern("PGP")
                .pattern("GIG")
                .pattern("PGP")
                .input('P', ModItems.PLATINUM_INGOT)
                .input('G', Blocks.GLASS)
                .input('I', Blocks.IRON_BARS)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_GLASS_PANE, 16)
                .pattern("   ")
                .pattern("GGG")
                .pattern("GGG")
                .input('G', ModBlocks.REINFORCED_GLASS)
                .criterion(hasItem(ModBlocks.REINFORCED_GLASS), conditionsFromItem(ModBlocks.REINFORCED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IRON_MESH_FENCE, 16)
                .pattern("   ")
                .pattern("GGG")
                .pattern("GGG")
                .input('G', ModBlocks.IRON_GRATE)
                .criterion(hasItem(ModBlocks.IRON_GRATE), conditionsFromItem(ModBlocks.IRON_GRATE))
                .offerTo(exporter);








        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_SWORD, 1)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_PICKAXE, 1)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_SHOVEL, 1)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_AXE, 1)
                .pattern(" II")
                .pattern(" SI")
                .pattern(" S ")
                .input('I', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_HOE, 1)
                .pattern(" II")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_SWORD, 1)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_PICKAXE, 1)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_SHOVEL, 1)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_AXE, 1)
                .pattern(" II")
                .pattern(" SI")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_HOE, 1)
                .pattern(" II")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLADEWOOD_SWORD, 1)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModBlocks.BLADEWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLADEWOOD_PICKAXE, 1)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModBlocks.BLADEWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLADEWOOD_SHOVEL, 1)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModBlocks.BLADEWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLADEWOOD_AXE, 1)
                .pattern(" II")
                .pattern(" SI")
                .pattern(" S ")
                .input('I', ModBlocks.BLADEWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLADEWOOD_HOE, 1)
                .pattern(" II")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModBlocks.BLADEWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .input('I', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_BOOTS, 1)
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRIDIUM_BOOTS, 1)
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.IRIDIUM_INGOT)
                .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                .offerTo(exporter);
    }
}