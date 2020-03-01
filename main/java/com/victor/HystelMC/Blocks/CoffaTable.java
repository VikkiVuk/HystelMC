package com.victor.HystelMC.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class CoffaTable extends Block {

    public CoffaTable() {
        super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.1f));
        setRegistryName("coffee_table");
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}
