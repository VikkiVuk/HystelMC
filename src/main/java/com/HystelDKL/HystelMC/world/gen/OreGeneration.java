package com.HystelDKL.HystelMC.world.gen;

import com.HystelDKL.HystelMC.init.BlockInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
    public static void generateOre()
    {
            for (Biome biome : ForgeRegistries.BIOMES) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 5, 5, 60));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.bluestone_ore.getDefaultState(), 10)).withPlacement(customConfig));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ruby_ore.getDefaultState(), 10)).withPlacement(customConfig));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.copper_ore.getDefaultState(), 10)).withPlacement(customConfig));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.rainbow_ore.getDefaultState(), 10)).withPlacement(customConfig));

        }
    }
}
