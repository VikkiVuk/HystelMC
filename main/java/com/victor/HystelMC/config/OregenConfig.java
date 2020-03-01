package com.victor.HystelMC.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig {

    public static ForgeConfigSpec.IntValue bluestone_chance;
    public static ForgeConfigSpec.IntValue ruby_chance;
    public static ForgeConfigSpec.IntValue copper_chance;
    public static ForgeConfigSpec.IntValue rainbow_chance;

    public static ForgeConfigSpec.BooleanValue generate_overworld;



    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)

    {

        server.comment("HystelMC Ore Generation Config");



        bluestone_chance = server

                .comment("Maximum number of ore veins of the bluestone ore that can spawn in one chunk, needs new world to apply")

                .defineInRange("oregen.tutorial_chance", 20, 1, 1000000);

        ruby_chance = server

                .comment("Maximum number of ore veins of the ruby ore that can spawn in one chunk, needs new world to apply")

                .defineInRange("oregen.tutorial_chance", 20, 1, 1000000);

        copper_chance = server

                .comment("Maximum number of ore veins of the copper ore that can spawn in one chunk, needs new world to apply")

                .defineInRange("oregen.tutorial_chance", 20, 1, 1000000);

        rainbow_chance = server

                .comment("Maximum number of ore veins of the rainbow ore that can spawn in one chunk, needs new world to apply")

                .defineInRange("oregen.tutorial_chance", 20, 1, 1000000);



        generate_overworld = server

                .comment("Decide if you want HystelMC ores to spawn in the overworld, needs new world to apply")

                .define("oregen.generate_overworld", true);

    }

}
