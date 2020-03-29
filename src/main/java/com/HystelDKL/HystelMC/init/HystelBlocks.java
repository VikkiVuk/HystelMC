package com.HystelDKL.HystelMC.init;

import com.HystelDKL.HystelMC.HystelMC;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HystelBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, HystelMC.MOD_ID);

    public static final RegistryObject<Block> QUARRY  = BLOCKS.register("quarry", () -> new Block(Block.Properties.create(Material.ANVIL).sound(SoundType.ANVIL)));
}
