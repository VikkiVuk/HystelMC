package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class BlockBC extends Block {

    public BlockBC() {
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.1f));
        setRegistryName("better_cauldron");
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}
