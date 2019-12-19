package jayden.mod.init;

import java.util.ArrayList;
import java.util.List;

import jayden.mod.objects.armour.ArmourBase;
import jayden.mod.objects.armour.ArmourModel;
import jayden.mod.objects.items.ItemBase;
import jayden.mod.objects.items.food.ItemCustomFood;
import jayden.mod.objects.items.food.ItemTomatoSeed;
import jayden.mod.objects.tools.ToolAxe;
import jayden.mod.objects.tools.ToolHoe;
import jayden.mod.objects.tools.ToolPickaxe;
import jayden.mod.objects.tools.ToolShovel;
import jayden.mod.objects.tools.ToolSword;
import jayden.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
    //Material
	
	//Copper
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 4, 1561, 7.0F, 7.0F, 22);
	public static final ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MOD_ID + ":copper",  13, new int[]{4, 5, 6, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	//Ruby
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 5, 1947, 8.0F, 8.0F, 22);
	public static final ArmorMaterial ARMOUR_RUBY = EnumHelper.addArmorMaterial("armour_ruby", Reference.MOD_ID + ":ruby",  13, new int[]{6, 5, 7, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	//Bluestone
	public static final ToolMaterial TOOL_BLUESTONE = EnumHelper.addToolMaterial("tool_bluestone", 6, 2498, 9.0F, 9.0F, 25);
	public static final ArmorMaterial ARMOUR_BLUESTONE = EnumHelper.addArmorMaterial("armour_bluestone", Reference.MOD_ID + ":bluestone",  13, new int[]{7, 6, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	//Rainbow
	public static final ToolMaterial TOOL_RAINBOW = EnumHelper.addToolMaterial("tool_rainbow", 7, 2598, 9.5F, 9.5F, 28);
	public static final ArmorMaterial ARMOUR_RAINBOW = EnumHelper.addArmorMaterial("armour_rainbow", Reference.MOD_ID + ":rainbow",  33, new int[]{4, 7, 9, 5}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.1F);
	//Trivia
	public static final ArmorMaterial ARMOUR_TRIVIA = EnumHelper.addArmorMaterial("armour_trivia", Reference.MOD_ID + ":trivia",  25, new int[]{5, 7, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	//BedrockBreaker
	public static final ToolMaterial TOOL_BEDROCK = EnumHelper.addToolMaterial("tool_bedrock", 10, 2598, 11.9F, 10.9F, 100);

	 public static final List<Item> ITEMS = new ArrayList<Item>();
	 
	 //Items
	 public static final Item RUBY = new ItemBase("ruby"); 
	 public static final Item BLUESTONE_INGOT = new ItemBase("bluestone_ingot");
	 public static final Item RAINBOW_TOKEN = new ItemBase("rainbow_token");
	 public static final Item GOLD_TOKEN = new ItemBase("gold_token");
	 public static final Item IRON_TOKEN = new ItemBase("iron_token");
	 public static final Item RUBY_TOKENT = new ItemBase("ruby_token");
	 public static final Item BLUESTONE_TOKEN = new ItemBase("bluestone_token");
	 public static final Item MICROPHONE = new ItemBase("microphone");
	 public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	 public static final Item DIAMOND_INGOT = new ItemBase("diamond_ingot");
	 public static final Item FLOURBAG = new ItemBase("flourbag");
	 public static final Item WHEATFLOUR = new ItemBase("wheatflour");
	 public static final Item RAINBOW_GEM = new ItemBase("rainbow_gem");
	 public static final Item UNKNOWN_ITEM = new ItemBase("unknown_item");
	 public static final Item DOLLAR = new ItemBase("dollar");
	 
	 //Tools
	 //Copper
	 public static final Item COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER);
	 public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER);
	 public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
	 public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER);
	 public static final Item COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER);
	 //Ruby
	 public static final Item RUBY_AXE = new ToolAxe("ruby_axe", TOOL_RUBY);
	 public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", TOOL_RUBY);
	 public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", TOOL_RUBY);
	 public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", TOOL_RUBY);
	 public static final Item RUBY_SWORD = new ToolSword("ruby_sword", TOOL_RUBY);
	 //Bluestone
	 public static final Item BLUESTONE_AXE = new ToolAxe("bluestone_axe", TOOL_BLUESTONE);
	 public static final Item BLUESTONE_HOE = new ToolHoe("bluestone_hoe", TOOL_BLUESTONE);
	 public static final Item BLUESTONE_PICKAXE = new ToolPickaxe("bluestone_pickaxe", TOOL_BLUESTONE);
	 public static final Item BLUESTONE_SHOVEL = new ToolShovel("bluestone_shovel", TOOL_BLUESTONE);
	 public static final Item BLUESTONE_SWORD = new ToolSword("bluestone_sword", TOOL_BLUESTONE);
	 //Rainbow
	 public static final Item RAINBOW_AXE = new ToolAxe("rainbow_axe", TOOL_RAINBOW);
	 public static final Item RAINBOW_HOE = new ToolHoe("rainbow_hoe", TOOL_RAINBOW);
	 public static final Item RAINBOW_PICKAXE = new ToolPickaxe("rainbow_pickaxe", TOOL_RAINBOW);
	 public static final Item RAINBOW_SHOVEL = new ToolShovel("rainbow_shovel", TOOL_RAINBOW);
	 public static final Item RAINBOW_SWORD = new ToolSword("rainbow_sword", TOOL_RAINBOW);
	 
	 //Armour
	 //Copper
	 public static final Item COPPER_HELMET = new ArmourBase("copper_helmet", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
	 public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
	 public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings", ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
	 public static final Item COPPER_BOOTS = new ArmourBase("copper_boots", ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);
	 //Bluestone
	 public static final Item BLUESTONE_HELMET = new ArmourBase("bluestone_helmet", ARMOUR_BLUESTONE, 1, EntityEquipmentSlot.HEAD);
	 public static final Item BLUESTONE_CHESTPLATE = new ArmourBase("bluestone_chestplate", ARMOUR_BLUESTONE, 1, EntityEquipmentSlot.CHEST);
	 public static final Item BLUESTONE_LEGGINGS = new ArmourBase("bluestone_leggings", ARMOUR_BLUESTONE, 2, EntityEquipmentSlot.LEGS);
	 public static final Item BLUESTONE_BOOTS = new ArmourBase("bluestone_boots", ARMOUR_BLUESTONE, 1, EntityEquipmentSlot.FEET);
	 //Ruby
	 public static final Item RUBY_HELMET = new ArmourBase("ruby_helmet", ARMOUR_RUBY, 1, EntityEquipmentSlot.HEAD);
	 public static final Item RUBY_CHESTPLATE = new ArmourBase("ruby_chestplate", ARMOUR_RUBY, 1, EntityEquipmentSlot.CHEST);
	 public static final Item RUBY_LEGGINGS = new ArmourBase("ruby_leggings", ARMOUR_RUBY, 2, EntityEquipmentSlot.LEGS);
	 public static final Item RUBY_BOOTS = new ArmourBase("ruby_boots", ARMOUR_RUBY, 1, EntityEquipmentSlot.FEET);
	 //Rainbow
	 public static final Item RAINBOW_HELMET = new ArmourBase("rainbow_helmet", ARMOUR_RAINBOW, 1, EntityEquipmentSlot.HEAD);
	 public static final Item RAINBOW_CHESTPLATE = new ArmourBase("rainbow_chestplate", ARMOUR_RAINBOW, 1, EntityEquipmentSlot.CHEST);
	 public static final Item RAINBOW_LEGGINGS = new ArmourBase("rainbow_leggings", ARMOUR_RAINBOW, 2, EntityEquipmentSlot.LEGS);
	 public static final Item RAINBOW_BOOTS = new ArmourBase("rainbow_boots", ARMOUR_RAINBOW, 1, EntityEquipmentSlot.FEET);
	 //Trivia (Custom Model, Does not have something with trivia questions!)
	 public static final Item TRIVIA_HELMET = new ArmourModel("trivia_helmet", ARMOUR_TRIVIA, EntityEquipmentSlot.HEAD);
 
	 
	 //Food
	 public static final Item RICE_BOWL = new ItemCustomFood("rice_bowl", 8, false);
	 public static final Item RICE = new ItemCustomFood("rice", 1, false);
	 public static final Item TOMATO = new ItemCustomFood("tomato", 5, false);
	 public static final Item PIZZA = new ItemCustomFood("pizza", 5, false);
	 public static final Item CHESSE = new ItemCustomFood("chesse", 4, false);
	 public static final Item SAUSAGE = new ItemCustomFood("sausage", 6, false);
	 public static final Item FRIES = new ItemCustomFood("fries", 5, false);
	 public static final Item GRATED_CHESSE = new ItemCustomFood("grated_chesse", 6, false);
	 public static final Item BEEF_BURGER = new ItemCustomFood("beef_burger", 6, false);
	 public static final Item BUTTER = new ItemCustomFood("butter", 4, false);
	 public static final Item BEEF_PATTY = new ItemCustomFood("beef_patty", 4, false);
	 public static final Item BACON = new ItemCustomFood("bacon", 5, false);
	 public static final Item CHESSEBURGER = new ItemCustomFood("chesseburger", 6, false);
	 public static final Item CRACKER = new ItemCustomFood("cracker", 3, false);
	 public static final Item CHESSE_AND_CRACKER = new ItemCustomFood("chesse_and_cracker", 7, false);
	 
	 //Miscenallious
	 public static final Item BLUESTONE_STICK = new ItemBase("bluestone_stick");
	 public static final Item RUBY_STICK = new ItemBase("ruby_stick");
	 public static final Item COPPER_STICK = new ItemBase("copper_stick");
	 public static final Item RAINBOW_STICK = new ItemBase("rainbow_stick");
	 public static final Item TOMATO_SEED = new ItemTomatoSeed("tomato_seed", 1, false);
	 
	 
	 //Electronics 
	 

	 
	
	 
}
