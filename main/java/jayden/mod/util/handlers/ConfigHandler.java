package jayden.mod.util.handlers;

import java.io.File;

import jayden.mod.HystelMC;
import jayden.mod.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{	

	public static Configuration config;
	
	public static int GUI_SINTERING_FURNACE = 1;
	public static int GUI_ELECTRIC_SINTERING_FURNACE = 2;
	public static int GUI_GLOWSTONE_GENERATOR = 3;
	public static int GUI_ENERGY_STORAGE = 4;
	public static int GUI_BLUESTONE_CHEST = 0;
	public static int GUI_RUBY_CHEST = 5;
	public static int GUI_COPPER_CHEST = 6;
	public static int GUI_RAINBOW_CHEST = 7;
	public static int GUI_TOKEN_ATM = 8;
	public static int GUI_RAINPG = 9;
	public static int GUI_SILVER_FURNACE = 10;
	
	public static boolean spawnCustomBiomesInOverworld; 
	
	public static boolean doOreGeneration; 
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "ID's";
		config.addCustomCategoryComment(category, "Set ID's for each entity and gui");
		GUI_SINTERING_FURNACE = config.getInt("Sintering Furnace Gui ID", category, 1, 1, 600, "Gui ID for sintering furnace");
		GUI_ELECTRIC_SINTERING_FURNACE = config.getInt("Electric Sintering Furnace Gui ID", category, 2, 2, 500, "Gui ID for electric sintering furnace");
		GUI_GLOWSTONE_GENERATOR = config.getInt("Glowstone Generator Gui ID", category, 3, 3, 400, "Gui ID for glowstone generator");
		GUI_ENERGY_STORAGE = config.getInt("Energy Storage Gui ID", category, 4, 4, 300, "Gui ID for energy storage");
		GUI_BLUESTONE_CHEST = config.getInt("Bluestone Chest Gui ID", category, 0, 0, 200, "Gui ID for bluestone chest");
		GUI_RUBY_CHEST = config.getInt("Ruby Chest Gui ID", category, 5, 5, 100, "Gui ID for ruby chest");
		GUI_COPPER_CHEST = config.getInt("Copper Chest Gui ID", category, 6, 6, 100, "Gui ID for copper chest");
		GUI_RAINBOW_CHEST = config.getInt("Rainbow Chest Gui ID", category, 7, 7, 100, "Gui ID for rainbow chest");
		GUI_TOKEN_ATM = config.getInt("Token Atm Gui ID", category, 8, 8, 100, "Gui ID for token atm");
		GUI_RAINPG = config.getInt("Rain Power Gen Gui ID", category, 9, 9, 100, "Gui ID for rain power gen");
		GUI_SILVER_FURNACE = config.getInt("Silver Furnace Gui ID", category, 10, 10, 100, "Gui ID for silver furnace");

		category = "Biomes";
		config.addCustomCategoryComment(category, "Declare whether you wish to spawn biomes in overworld");
		spawnCustomBiomesInOverworld = config.getBoolean("spawn Bluestome biome in overworld", category, true, "Declare whether you wish to spawn Bluestone Biome in overworld");
		
		category = "Ores";
		config.addCustomCategoryComment(category, "Declare whether you want the mod to do ore gen or not.");
		doOreGeneration = config.getBoolean("Declare whether you want the mod to do ore gen or not.", category, true, "Declare whether you want the mod to do ore gen or not.");
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		HystelMC.config = new File(event.getModConfigurationDirectory() + "/" + "hystelmc-config");
		HystelMC.config.mkdirs();
		init(new File(HystelMC.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}
