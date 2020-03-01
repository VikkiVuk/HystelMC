package com.victor.HystelMC.Blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;


public class BlockTA extends Block {


    public BlockTA() {
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.1f));

    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }


}
