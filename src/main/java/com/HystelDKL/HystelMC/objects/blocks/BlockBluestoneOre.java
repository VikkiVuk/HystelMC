package com.HystelDKL.HystelMC.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBluestoneOre extends Block {

    public BlockBluestoneOre() {
        super(Properties.create(Material.IRON).hardnessAndResistance(4.9f, 30f).lightValue(0).sound(SoundType.STONE));
        setRegistryName("bluestone_ore");
        // TODO Auto-generated constructor stub
    }

}
