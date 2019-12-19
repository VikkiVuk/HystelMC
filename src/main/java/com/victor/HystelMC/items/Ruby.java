package com.victor.HystelMC.items;

import com.victor.HystelMC.HystelMC;

import net.minecraft.item.Item;

public class Ruby extends Item {

	public Ruby() {
        super(new Item.Properties().maxStackSize(64).group(HystelMC.setup.itemGroup));
        setRegistryName("ruby");

	}
}
