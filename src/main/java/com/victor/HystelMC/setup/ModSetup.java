package com.victor.HystelMC.setup;

import com.victor.HystelMC.Init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("hysteltab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.BLUESTONE_INGOT);
        }
    };

    public void init() {

    }
}
