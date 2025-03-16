package net.cyntax.scpcraftreinforced.world;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.cyntax.scpcraftreinforced.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_PLATINUM_ORE_KEY = registerKey("deepslate_platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_IRIDIUM_ORE_KEY = registerKey("deepslate_iridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEP_GRANITE_KEY = registerKey("deep_granite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARBLE_KEY = registerKey("marble");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLADEWOOD_KEY = registerKey("bladewood");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);



        List<OreFeatureConfig.Target> overworldPlatinumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldIridiumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_IRIDIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDeepGranite =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEP_GRANITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMarble =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.MARBLE.getDefaultState()));


        register(context, DEEPSLATE_PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 14));
        register(context, DEEPSLATE_IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldIridiumOres, 12));
        register(context, DEEP_GRANITE_KEY, Feature.ORE, new OreFeatureConfig(overworldDeepGranite, 36));
        register(context, MARBLE_KEY, Feature.ORE, new OreFeatureConfig(overworldMarble, 36));


        register(context, BLADEWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.BLADEWOOD_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(ModBlocks.BLADEWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 2),
                new TwoLayersFeatureSize(1, 0, 1)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(SCPcraftReinforced.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}