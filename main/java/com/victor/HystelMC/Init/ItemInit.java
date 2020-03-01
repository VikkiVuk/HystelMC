package com.victor.HystelMC.Init;

import com.victor.HystelMC.items.BluestoneIngot;
import com.victor.HystelMC.items.CopperIngoty;
import com.victor.HystelMC.items.RainbowGem;
import com.victor.HystelMC.items.Ruby;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.ObjectHolder;

public class ItemInit {

	//Items
	@ObjectHolder("hm:bluestone_ingot")
	public static BluestoneIngot BLUESTONE_INGOT;
	@ObjectHolder("hm:ruby")
	public static Ruby RUBY;
	@ObjectHolder("hm:copper_ingot")
	public static CopperIngoty COPPER_INGOT;
	@ObjectHolder("hm:rainbow_gem")
	public static RainbowGem RAINBOW_GEM;


	//Armor
	//Bluestone
	public static Item bluestone_helmet;
	public static Item bluestone_chestplate;
	public static Item bluestone_leggings;
	public static Item bluestone_boots;
	//Ruby
	public static Item ruby_helmet;
	public static Item ruby_chestplate;
	public static Item ruby_leggings;
	public static Item ruby_boots;
	//Copper
	public static Item copper_helmet;
	public static Item copper_chestplate;
	public static Item copper_leggings;
	public static Item copper_boots;
	//Rainbow
	public static Item rainbow_helmet;
	public static Item rainbow_chestplate;
	public static Item rainbow_leggings;
	public static Item rainbow_boots;

	//Tools
	//Bluestone
	public static Item bluestone_axe;
	public static Item bluestone_hoe;
	public static Item bluestone_pickaxe;
	public static Item bluestone_shovel;
	public static Item bluestone_sword;
	//Ruby
	public static Item ruby_axe;
	public static Item ruby_hoe;
	public static Item ruby_pickaxe;
	public static Item ruby_shovel;
	public static Item ruby_sword;
	//Copper
	public static Item copper_axe;
	public static Item copper_hoe;
	public static Item copper_pickaxe;
	public static Item copper_shovel;
	public static Item copper_sword;
	//Rainbow
	public static Item rainbow_axe;
	public static Item rainbow_hoe;
	public static Item rainbow_pickaxe;
	public static Item rainbow_shovel;
	public static Item rainbow_sword;

	//Miscellaneous
	public static Item UNKNOWN_ITEM;
	public static Item MICROPHONE;

	//Eggs
	public static Item unknown_cow_egg;

	//Tokens
	public static Item iron_token;
	public static Item gold_token;
	public static Item ruby_token;
	public static Item bluestone_token;
	public static Item rainbow_token;



}
