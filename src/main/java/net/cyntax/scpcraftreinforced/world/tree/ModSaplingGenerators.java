package net.cyntax.scpcraftreinforced.world.tree;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator BLADEWOOD = new SaplingGenerator(SCPcraftReinforced.MOD_ID + ":bladewood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLADEWOOD_KEY), Optional.empty());
}