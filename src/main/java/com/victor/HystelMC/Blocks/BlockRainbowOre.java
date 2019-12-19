package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRainbowOre extends Block {

    public BlockRainbowOre() {
        super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.1f, 30f).lightValue(0).sound(SoundType.STONE));
        setRegistryName("rainbow_ore");
        // TODO Auto-generated constructor stub
    }

}

