package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSpeaker extends Block {

    public BlockSpeaker() {
        super(Block.Properties.create(Material.WOOL).hardnessAndResistance(5.1f, 30f).lightValue(0).sound(SoundType.CLOTH));
        setRegistryName("speakers");
        // TODO Auto-generated constructor stub
    }

}
