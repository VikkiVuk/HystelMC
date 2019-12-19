package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBluestone extends Block {

	public BlockBluestone() {
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.3f, 30f).lightValue(0).sound(SoundType.METAL));
		 setRegistryName("bluestone_block");
	}

}
