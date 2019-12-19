package com.victor.HystelMC.items;

import com.victor.HystelMC.HystelMC;
import net.minecraft.item.Item;

public class RainbowGem extends Item {

    public RainbowGem() {
        super(new Item.Properties().maxStackSize(64).group(HystelMC.setup.itemGroup));
        setRegistryName("rainbow_gem");

    }
}
