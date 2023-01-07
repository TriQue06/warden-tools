package net.trique.wardentools.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.trique.wardentools.WardenTools;
import net.trique.wardentools.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {


    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> SCULK_GEODE =
            ConfiguredFeatures.register("sculk_geode", Feature.GEODE,
                    new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                            BlockStateProvider.of(ModBlocks.SCULK_CRYSTAL_BLOCK),
                            BlockStateProvider.of(ModBlocks.BUDDING_SCULK),
                            BlockStateProvider.of(Blocks.CALCITE),
                            BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                            List.of(ModBlocks.ECHO_BUD.getDefaultState(), ModBlocks.ECHO_CLUSTER.getDefaultState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                            new GeodeCrackConfig(0.95, 2.0, 2),
                            0.35, 0.083,
                            true, UniformIntProvider.create(4, 6),
                            UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                            -16, 16, 0.05, 1));


    public static void registerConfiguredFeatures() {
        WardenTools.LOGGER.debug("Registering the ModConfiguredFeatures for " + WardenTools.MOD_ID);
    }
}