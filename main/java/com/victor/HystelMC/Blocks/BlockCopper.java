package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block {

	public BlockCopper() {
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.1f, 30f).lightValue(0).sound(SoundType.METAL));
		setRegistryName("copper_block");
		// TODO Auto-generated constructor stub
	}

}
