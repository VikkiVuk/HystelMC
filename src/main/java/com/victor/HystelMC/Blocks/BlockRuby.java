package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.1f, 30f).lightValue(0).sound(SoundType.METAL));
		setRegistryName("ruby_block");
		// TODO Auto-generated constructor stub
	}

}
