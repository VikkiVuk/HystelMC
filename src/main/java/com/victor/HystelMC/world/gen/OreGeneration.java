package com.victor.HystelMC.world.gen;

import com.victor.HystelMC.Init.BlockInit;
import com.victor.HystelMC.config.OregenConfig;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {

    public static void setupOreGeneration()

    {

        if(OregenConfig.generate_overworld.get())

        {

            for(Biome biome : ForgeRegistries.BIOMES)

            {

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.bluestone_ore.getDefaultState(), OregenConfig.bluestone_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ruby_ore.getDefaultState(), OregenConfig.ruby_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.copper_ore.getDefaultState(), OregenConfig.copper_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.rainbow_ore.getDefaultState(), OregenConfig.rainbow_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));


            }

        }

    }

}
