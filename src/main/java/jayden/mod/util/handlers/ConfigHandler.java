package jayden.mod.util.handlers;

import java.io.File;

import jayden.mod.Main;
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
	
	public static boolean spawnCustomBiomesInOverworld; 
	
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

		category = "Biomes";
		config.addCustomCategoryComment(category, "Declare whether you wish to spawn biomes in overworld");
		spawnCustomBiomesInOverworld = config.getBoolean("spawn Bluestome biome in overworld", category, true, "Declare whether you wish to spawn Bluestone Biome in overworld");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}
