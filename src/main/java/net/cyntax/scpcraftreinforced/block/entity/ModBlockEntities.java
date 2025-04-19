package net.cyntax.scpcraftreinforced.block.entity;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.block.entity.custom.ShelfBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ShelfBlockEntity> SHELF_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(SCPcraftReinforced.MOD_ID, "shelf_be"),
                    BlockEntityType.Builder.create(ShelfBlockEntity::new, ModBlocks.OAK_SHELF, ModBlocks.BIRCH_SHELF, ModBlocks.SPRUCE_SHELF, ModBlocks.JUNGLE_SHELF, ModBlocks.ACACIA_SHELF,
                            ModBlocks.DARK_OAK_SHELF, ModBlocks.CHERRY_SHELF, ModBlocks.MANGROVE_SHELF, ModBlocks.WARPED_SHELF, ModBlocks.CRIMSON_SHELF, ModBlocks.BLADEWOOD_SHELF).build());

    public static void registerBlockEntities() {
        SCPcraftReinforced.LOGGER.info("Registering modded block entities from " + SCPcraftReinforced.MOD_ID);
    }
}
