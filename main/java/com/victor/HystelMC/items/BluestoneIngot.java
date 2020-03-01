package com.victor.HystelMC.items;

import com.victor.HystelMC.HystelMC;

import net.minecraft.item.Item;

public class BluestoneIngot extends Item {

	public BluestoneIngot() {
        super(new Item.Properties().maxStackSize(64).group(HystelMC.setup.itemGroup));
        setRegistryName("bluestone_ingot");

	}

}
