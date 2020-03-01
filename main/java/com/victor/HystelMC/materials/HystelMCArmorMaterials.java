package com.victor.HystelMC.materials;

import com.victor.HystelMC.HystelMC;
import com.victor.HystelMC.Init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum HystelMCArmorMaterials implements IArmorMaterial {

	
	
	bluestone("bluestone", 579, new int[] {7, 6, 8, 5}, 25, ItemInit.BLUESTONE_INGOT, "ITEM_ARMOR_EQUIP_DIAMOND", 0.0f),
	ruby("ruby", 500, new int[] {6, 5, 7, 4}, 12, ItemInit.RUBY, "ITEM_ARMOR_EQUIP_IRON", 0.0f),
	copper("copper", 472, new int[] {4, 5, 6, 3}, 11, ItemInit.COPPER_INGOT, "ITEM_ARMOR_EQUIP_IRON", 0.0f),
	rainbow("rainbow", 589, new int[] {9, 9, 9, 9}, 11, ItemInit.RAINBOW_GEM, "ITEM_ARMOR_EQUIP_DIAMOND", 1.0f);


	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	
	private HystelMCArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness) 
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughness = toughness;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) 
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public String getName() 
	{
		return HystelMC.MOD_ID + ":" + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
	
}
