package com.HystelDKL.HystelMC.init;

import com.HystelDKL.HystelMC.HystelMC;
import com.HystelDKL.HystelMC.objects.items.DinkyWinky;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HystelItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HystelMC.MOD_ID);

    public static final RegistryObject<Item> DEFERRED_TEST  = ITEMS.register("deferred_test", () -> new DinkyWinky(new Item.Properties().maxStackSize(1).rarity(Rarity.RARE)));
}
