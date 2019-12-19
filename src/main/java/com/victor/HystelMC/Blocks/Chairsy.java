package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


public class Chairsy extends Block
{
	
	  public Chairsy() {
	        super(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).hardnessAndResistance(2.0f).lightValue(14));
	        setRegistryName("chairsy");
	    }
	  
	  
	  @Override
	  public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	  }
	 
		

	 
	  
}
