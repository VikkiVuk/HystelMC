package com.HystelDKL.HystelMC.init;

import com.HystelDKL.HystelMC.HystelMC;
import com.HystelDKL.HystelMC.objects.blocks.ModStonePressurePlateBlock;
import com.HystelDKL.HystelMC.objects.blocks.ModStoneButtonBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HystelBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, HystelMC.MOD_ID);

    //public static final RegistryObject<Block> QUARRY  = BLOCKS.register("quarry", () -> new BlockQuarry(Block.Properties.create(Material.ANVIL).sound(SoundType.ANVIL)));

    public static final RegistryObject<Block> BLUESTONE_STAIRS = BLOCKS.register("bluestone_stairs", () -> new StairsBlock(() -> BlockInit.bluestone_block.getDefaultState(), Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)));
    public static final RegistryObject<Block> BLUESTONE_FENCE = BLOCKS.register("bluestone_fence", () -> new FenceBlock(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)));
    public static final RegistryObject<Block> BLUESTONE_BUTTON = BLOCKS.register("bluestone_button", () -> new ModStoneButtonBlock(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)));
    public static final RegistryObject<Block> BLUESTONE_PRESSUREPLATE = BLOCKS.register("bluestone_pressure_plate", () -> new ModStonePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)));
}
