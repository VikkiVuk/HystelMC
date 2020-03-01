package com.victor.HystelMC.Init;

import com.victor.HystelMC.HystelMC;
import com.victor.HystelMC.HystelMCRegistries;
import com.victor.HystelMC.entities.UnknownCow;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class EntityInit {

    public static EntityType<?> unknown_cow = EntityType.Builder.create(UnknownCow::new, EntityClassification.CREATURE).build(HystelMCRegistries.MODID + ":unknown_cow").setRegistryName(HystelMCRegistries.location("unknown_cow"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        ItemInit.unknown_cow_egg = registerEntitySpawnEgg(unknown_cow, 0x2f5882, 0x6f1499, "unknown_cow")
                );

    }

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(unknown_cow, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE);
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(HystelMCRegistries.hysteltab));
        item.setRegistryName(HystelMCRegistries.location(name));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, 10, 1, 10));
            }
        }
    }

}
