package net.cyntax.scpcraftreinforced.datagen;

import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.item.ModItems;
import net.cyntax.scpcraftreinforced.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLADEWOOD_LOG.asItem())
                .add(ModBlocks.BLADEWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLADEWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLADEWOOD_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.BLADEWOOD_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BLADEWOOD_SWORD)
                .add(ModItems.PLATINUM_SWORD)
                .add(ModItems.IRIDIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BLADEWOOD_PICKAXE)
                .add(ModItems.PLATINUM_PICKAXE)
                .add(ModItems.IRIDIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BLADEWOOD_SHOVEL)
                .add(ModItems.PLATINUM_SHOVEL)
                .add(ModItems.IRIDIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BLADEWOOD_AXE)
                .add(ModItems.PLATINUM_AXE)
                .add(ModItems.IRIDIUM_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BLADEWOOD_HOE)
                .add(ModItems.PLATINUM_HOE)
                .add(ModItems.IRIDIUM_HOE);

        getOrCreateTagBuilder(ModTags.Items.PLATINUM_REPAIR)
                .add(ModItems.PLATINUM_INGOT);

        getOrCreateTagBuilder(ModTags.Items.IRIDIUM_REPAIR)
                .add(ModItems.IRIDIUM_INGOT);

        getOrCreateTagBuilder(ModTags.Items.BLADEWOOD_REPAIR)
                .add(ModBlocks.BLADEWOOD_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PLATINUM_HELMET)
                .add(ModItems.PLATINUM_CHESTPLATE)
                .add(ModItems.PLATINUM_LEGGINGS)
                .add(ModItems.IRIDIUM_HELMET)
                .add(ModItems.IRIDIUM_CHESTPLATE)
                .add(ModItems.IRIDIUM_LEGGINGS)
                .add(ModItems.IRIDIUM_BOOTS);


    }
}
