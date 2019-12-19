package com.victor.HystelMC.items;

import com.victor.HystelMC.HystelMC;

import net.minecraft.item.Item;

public class CopperIngoty extends Item {

	public CopperIngoty() {
        super(new Item.Properties().maxStackSize(64).group(HystelMC.setup.itemGroup));
        setRegistryName("copper_ingot");

	}
}
