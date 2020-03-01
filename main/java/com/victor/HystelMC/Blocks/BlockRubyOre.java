package com.victor.HystelMC.Blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRubyOre extends Block {

    public BlockRubyOre() {
        super(Block.Properties.create(Material.IRON).hardnessAndResistance(4.1f, 30f).lightValue(0).sound(SoundType.STONE));
        setRegistryName("ruby_ore");
        // TODO Auto-generated constructor stub
    }
}
