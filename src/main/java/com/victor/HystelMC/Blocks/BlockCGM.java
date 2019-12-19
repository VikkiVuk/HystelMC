package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class BlockCGM extends Block {

    public BlockCGM() {
        super(Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(2.1f));
        setRegistryName("custom_glassy_mobble");
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}
