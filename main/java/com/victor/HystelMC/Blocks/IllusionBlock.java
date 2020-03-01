package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class IllusionBlock extends Block {

    public IllusionBlock() {
        super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.1f));
        setRegistryName("custom_block");
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}
