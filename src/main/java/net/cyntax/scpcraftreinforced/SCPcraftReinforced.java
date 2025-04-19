package net.cyntax.scpcraftreinforced;

import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.cyntax.scpcraftreinforced.block.entity.ModBlockEntities;
import net.cyntax.scpcraftreinforced.entity.ModEntities;
import net.cyntax.scpcraftreinforced.item.ModItemGroups;
import net.cyntax.scpcraftreinforced.item.ModItems;
import net.cyntax.scpcraftreinforced.sound.ModSounds;
import net.cyntax.scpcraftreinforced.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SCPcraftReinforced implements ModInitializer {
	public static final String MOD_ID = "scpcraftreinforced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModEntities.registerModEntities();
		ModItemGroups.registerItemGroups();
		ModOreGeneration.generateOres();
		ModBlockEntities.registerBlockEntities();

		StrippableBlockRegistry.register(ModBlocks.BLADEWOOD_LOG, ModBlocks.STRIPPED_BLADEWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLADEWOOD_WOOD, ModBlocks.STRIPPED_BLADEWOOD_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLADEWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLADEWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_LEAVES, 30, 60);

	}
}