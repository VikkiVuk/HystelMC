package com.victor.HystelMC.materials;

import com.victor.HystelMC.Init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum HystelMCToolMaterials implements IItemTier
{
	bluestone(11.6f, 11.6f, 2103, 5, 30, ItemInit.BLUESTONE_INGOT),
	ruby(11.5f, 11.6f, 1560, 4, 30, ItemInit.RUBY),
	copper(10.4f, 10.6f, 1000, 3, 26, ItemInit.COPPER_INGOT),
	rainbow(15.1f, 13.0f, 3102, 6, 31, ItemInit.RAINBOW_GEM);

	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private HystelMCToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial)
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() 
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
