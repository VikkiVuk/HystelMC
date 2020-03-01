package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.shapes.VoxelShape;

public class BlockResta extends Block{

	
	  public BlockResta() {
	        super(Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(2.1f));
	        setRegistryName("custom_resta");
	    }
	  
	  @Override
	  public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	  }


	
}
