package com.HystelDKL.HystelMC.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCopperOre extends Block {

    public BlockCopperOre() {
        super(Properties.create(Material.IRON).hardnessAndResistance(3.9f, 30f).lightValue(0).sound(SoundType.STONE));
        setRegistryName("copper_ore");
        // TODO Auto-generated constructor stub
    }

}
