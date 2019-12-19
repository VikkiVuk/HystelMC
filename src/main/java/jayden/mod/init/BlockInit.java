package jayden.mod.init;

import java.util.ArrayList;
import java.util.List;

import jayden.mod.objects.blocks.BlockBLOre;
import jayden.mod.objects.blocks.BlockBLPlanks;
import jayden.mod.objects.blocks.BlockBetterCauldron;
import jayden.mod.objects.blocks.BlockBluestone;
import jayden.mod.objects.blocks.BlockCOOre;
import jayden.mod.objects.blocks.BlockChair;
import jayden.mod.objects.blocks.BlockChairsy;
import jayden.mod.objects.blocks.BlockCoffeTable;
import jayden.mod.objects.blocks.BlockCookieJar;
import jayden.mod.objects.blocks.BlockCopper;
import jayden.mod.objects.blocks.BlockCopperPlanks;
import jayden.mod.objects.blocks.BlockCusBob;
import jayden.mod.objects.blocks.BlockCustomBlock;
import jayden.mod.objects.blocks.BlockCustomGlassyMobble;
import jayden.mod.objects.blocks.BlockFluid;
import jayden.mod.objects.blocks.BlockHRCM;
import jayden.mod.objects.blocks.BlockHystelSomething;
import jayden.mod.objects.blocks.BlockModernChair;
import jayden.mod.objects.blocks.BlockNormalGlassTable;
import jayden.mod.objects.blocks.BlockRBOre;
import jayden.mod.objects.blocks.BlockRINOre;
import jayden.mod.objects.blocks.BlockRainbowPlanks;
import jayden.mod.objects.blocks.BlockRuby;
import jayden.mod.objects.blocks.BlockRubyPlanks;
import jayden.mod.objects.blocks.BlockSantaHat;
import jayden.mod.objects.blocks.BlockSlimes;
import jayden.mod.objects.blocks.BlockSpkB;
import jayden.mod.objects.blocks.BlockSpruceTable;
import jayden.mod.objects.blocks.BlockTeleporter;
import jayden.mod.objects.blocks.BlockTomatoPlant;
import jayden.mod.objects.blocks.chest_bluestone.BlockBluestoneChest;
import jayden.mod.objects.blocks.chest_copper.BlockCopperChest;
import jayden.mod.objects.blocks.chest_rainbow.BlockRainbowChest;
import jayden.mod.objects.blocks.chest_ruby.BlockRubyChest;
import jayden.mod.objects.blocks.energy.storage.BlockEnergyStorage;
import jayden.mod.objects.blocks.machines.energy.generators.BlockGlowstoneGenerator;
import jayden.mod.objects.blocks.machines.sintering.BlockElectricSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.BlockSinteringFurnace;
import jayden.mod.objects.blocks.token_atm.BlockTokenAtm;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
		
    //Machines
    public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace"); 
    public static final Block ELECTRIC_SINTERING_FURNACE = new BlockElectricSinteringFurnace("electric_sintering_furnace");
    public static final Block GLOWSTONE_GENERATOR = new BlockGlowstoneGenerator("glowstone_generator");
    
    //3D Blocks
    public static final Block COFFE_TABLE = new BlockCoffeTable("coffe_table");
    public static final Block CUSTOM_GLASSY_MOBBLE = new BlockCustomGlassyMobble("custom_glassy_mobble");
    public static final Block CHAIRSY = new BlockChairsy("chairsy");
    public static final Block BETTER_CAULDRON = new BlockBetterCauldron("better_cauldron");
    public static final Block TOKEN_ATM = new BlockTokenAtm("token_atm");	
    public static final Block CUSTOM_BLOCK = new BlockCustomBlock("custom_block");
    public static final Block COOKIE_JAR = new BlockCookieJar("cookie_jar", Material.GLASS); 
    public static final Block SANTA_HAT = new BlockSantaHat("santa_hat");
    public static final Block SPRUCE_TABLE = new BlockSpruceTable("spruce_table");
    public static final Block NORMAL_GLASS_TABLE = new BlockNormalGlassTable("normal_glass_table");
    public static final Block HYSTEL_SOMETHING = new BlockHystelSomething("hystel_something");
    public static final Block MODERN_CHAIR = new BlockModernChair("modern_chair");
    public static final Block CHAIR = new BlockChair("chair");
    
    //Fluids
    public static final Block CHOCOLATE_MILK_FLUID = new BlockFluid("chocolate_milk", FluidInit.CHOCOLATE_MILK_FLUID, Material.WATER);
    
    //Blocks
    public static final Block BLOCK_RUBY = new BlockRuby("block_ruby", Material.IRON);
    public static final Block BLUESTONE_BLOCK = new BlockBluestone("bluestone_block", Material.IRON);
    public static final Block CUSTOMIZED_BOBBLE = new BlockCusBob("customized_bobble", Material.CLOTH); 
    public static final Block SPEAKERS = new BlockSpkB("speakers", Material.IRON);
    public static final Block COPPER_BLOCK = new BlockCopper("copper_block", Material.IRON);
    
    //Teleporters
    public static final Block BLOCK_TELEPORTER = new BlockTeleporter("block_teleporter");
     
    //Storage
    public static final Block ENERGY_STORAGE = new BlockEnergyStorage("energy_storage");
    public static final Block BLUESTONE_CHEST = new BlockBluestoneChest("bluestone_chest");
    public static final Block RUBY_CHEST = new BlockRubyChest("ruby_chest");
    public static final Block COPPER_CHEST = new BlockCopperChest("copper_chest");
    public static final Block RAINBOW_CHEST = new BlockRainbowChest("rainbow_chest");
    
    //Hardened Blocks or Fluids
    public static final Block HARDENED_CHOCOLATE_MILK = new BlockHRCM("hardened_chocolate_milk"); 
       
    //Ores
    public static final Block BLUESTONE_ORE = new BlockBLOre("bluestone_ore");
    public static final Block RUBY_ORE = new BlockRBOre("ruby_ore");
    public static final Block COPPER_ORE = new BlockCOOre("copper_ore"); 
    public static final Block RAINBOW_ORE = new BlockRINOre("rainbow_ore");
    
    //Planks
    public static final Block BLUESTONE_PLANKS = new BlockBLPlanks("bluestone_planks");
    public static final Block RUBY_PLANKS = new BlockRubyPlanks("ruby_planks"); 
    public static final Block COPPER_PLANKS = new BlockCopperPlanks("copper_planks");
    public static final Block RAINBOW_PLANKS = new BlockRainbowPlanks("rainbow_planks");
    
    //Crops
    public static final Block TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");
    
    //Sticky blocks   
    /*
    public static final Block BROWN_SLIME = new BlockSlimes("brown_slime");
    public static final Block RED_SLIME = new BlockSlimes("red_slime");
    public static final Block BLUE_SLIME = new BlockSlimes("blue_slime");
    public static final Block GREEN_SLIME = new BlockSlimes("green_slime");
    public static final Block PURPLE_SLIME = new BlockSlimes("purple_slime");
    public static final Block PINK_SLIME = new BlockSlimes("pink_slime");
    public static final Block BLACK_SLIME = new BlockSlimes("black_slime");
    public static final Block WHITE_SLIME = new BlockSlimes("white_slime");
    public static final Block GRAY_SLIME = new BlockSlimes("gray_slime");
    public static final Block AQUA_SLIME = new BlockSlimes("aqua_slime"); 
    public static final Block YELLOW_SLIME = new BlockSlimes("yellow_slime");
    public static final Block ORANGE_SLIME = new BlockSlimes("orange_slime");
    public static final Block CYAN_SLIME = new BlockSlimes("cyan_slime");
    public static final Block LIGHT_BLUE_SLIME = new BlockSlimes("light_blue_slime");
    public static final Block LIGHT_GRAY_SLIME = new BlockSlimes("light_gray_slime");
    public static final Block LIME_SLIME = new BlockSlimes("lime_slime");
    public static final Block MAGENTA_SLIME = new BlockSlimes("pink_slime"); 
    */
    
   
    
    
}
	