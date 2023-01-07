package net.trique.wardentools.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.trique.wardentools.world.feature.ModConfiguredFeatures;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> SCULK_GEODE_PLACED = PlacedFeatures.register("sculk_geode_placed",
            ModConfiguredFeatures.SCULK_GEODE, RarityFilterPlacementModifier.of(22),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-8), YOffset.fixed(24)),
            BiomePlacementModifier.of());


    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}