package jayden.mod.init;

import java.util.ArrayList;
import java.util.List;

import jayden.mod.HystelMC;
import jayden.mod.objects.blocks.BlockBLPlanks;
import jayden.mod.objects.blocks.BlockBetterCauldron;
import jayden.mod.objects.blocks.BlockBluestone;
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
import jayden.mod.objects.blocks.BlockLemonPlant;
import jayden.mod.objects.blocks.BlockModernChair;
import jayden.mod.objects.blocks.BlockNormalGlassTable;
import jayden.mod.objects.blocks.BlockRainbowPlanks;
import jayden.mod.objects.blocks.BlockRuby;
import jayden.mod.objects.blocks.BlockRubyPlanks;
import jayden.mod.objects.blocks.BlockSantaHat;
import jayden.mod.objects.blocks.BlockSpkB;
import jayden.mod.objects.blocks.BlockSpruceTable;
import jayden.mod.objects.blocks.BlockTeleporter;
import jayden.mod.objects.blocks.BlockTomatoPlant;
import jayden.mod.objects.blocks.chest_bluestone.BlockBluestoneChest;
import jayden.mod.objects.blocks.chest_copper.BlockCopperChest;
import jayden.mod.objects.blocks.chest_rainbow.BlockRainbowChest;
import jayden.mod.objects.blocks.chest_ruby.BlockRubyChest;
import jayden.mod.objects.blocks.energy.storage.BlockEnergyStorage;
import jayden.mod.objects.blocks.fluids.BlockMoltenBluestoneFluid;
import jayden.mod.objects.blocks.fluids.BlockMoltenCopperFluid;
import jayden.mod.objects.blocks.fluids.BlockMoltenRubyFluid;
import jayden.mod.objects.blocks.fluids.BlockWhiteWaterFluid;
import jayden.mod.objects.blocks.machines.energy.generators.BlockGlowstoneGenerator;
import jayden.mod.objects.blocks.machines.rainPowerGen.BlockRainPG;
import jayden.mod.objects.blocks.machines.sintering.BlockElectricSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.BlockSinteringFurnace;
import jayden.mod.objects.blocks.ores.BlockOres;
import jayden.mod.objects.blocks.silver_pec.SilverFurnace;
import jayden.mod.objects.blocks.slime.BlockBlackSlime;
import jayden.mod.objects.blocks.slime.BlockBlueSlime;
import jayden.mod.objects.blocks.slime.BlockBrownSlime;
import jayden.mod.objects.blocks.slime.BlockCyanSlime;
import jayden.mod.objects.blocks.slime.BlockGraySlime;
import jayden.mod.objects.blocks.slime.BlockGreenSlime;
import jayden.mod.objects.blocks.slime.BlockLightBlueSlime;
import jayden.mod.objects.blocks.slime.BlockLimeSlime;
import jayden.mod.objects.blocks.slime.BlockMagentaSlime;
import jayden.mod.objects.blocks.slime.BlockOrangeSlime;
import jayden.mod.objects.blocks.slime.BlockPurpleSlime;
import jayden.mod.objects.blocks.slime.BlockRedSlime;
import jayden.mod.objects.blocks.slime.BlockWhiteSlime;
import jayden.mod.objects.blocks.slime.BlockYellowSlime;
import jayden.mod.objects.blocks.token_atm.BlockTokenAtm;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
		
    //Machines
    public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace"); 
    public static final Block ELECTRIC_SINTERING_FURNACE = new BlockElectricSinteringFurnace("electric_sintering_furnace");
    public static final Block GLOWSTONE_GENERATOR = new BlockGlowstoneGenerator("glowstone_generator");
    public static final Block RAINPG = new BlockRainPG("rainpg");
    //Silver furnace
	public static final Block SILVER_FURNACE_OFF = new SilverFurnace("silver_furnace_off", false).setCreativeTab(HystelMC.hysteltab);
	public static final Block SILVER_FURNACE_ON = new SilverFurnace("silver_furnace_on", true);
    
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
	public static final Block WHITE_WATER_FLUID = new BlockWhiteWaterFluid("white_water", FluidInit.WHITE_WATER_FLUID, Material.WATER);
	public static final Block MOLTEN_COPPER_FLUID = new BlockMoltenCopperFluid("molten_copper", FluidInit.MOLTEN_COPPER_FLUID, Material.LAVA);
	public static final Block MOLTEN_BLUESTONE_FLUID = new BlockMoltenBluestoneFluid("molten_bluestone", FluidInit.MOLTEN_BLUESTONE_FLUID, Material.LAVA);
	public static final Block MOLTEN_RUBY_FLUID = new BlockMoltenRubyFluid("molten_ruby", FluidInit.MOLTEN_RUBY_FLUID, Material.LAVA);

    
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
    public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
    
    //Planks
    public static final Block BLUESTONE_PLANKS = new BlockBLPlanks("bluestone_planks");
    public static final Block RUBY_PLANKS = new BlockRubyPlanks("ruby_planks"); 
    public static final Block COPPER_PLANKS = new BlockCopperPlanks("copper_planks");
    public static final Block RAINBOW_PLANKS = new BlockRainbowPlanks("rainbow_planks");
    
    //Crops
    public static final Block TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");
    public static final Block LEMON_PLANT = new BlockLemonPlant("lemon_plant");
    
    //Slime Blocks
    public static final Block RED_SLIME = new BlockRedSlime("red_slime");
    public static final Block BLUE_SLIME = new BlockBlueSlime("blue_slime");
    public static final Block GREEN_SLIME = new BlockGreenSlime("green_slime");
    public static final Block PURPLE_SLIME = new BlockPurpleSlime("purple_slime");
    public static final Block BLACK_SLIME = new BlockBlackSlime("black_slime");
    public static final Block WHITE_SLIME = new BlockWhiteSlime("white_slime");
    public static final Block GRAY_SLIME = new BlockGraySlime("gray_slime");
    public static final Block YELLOW_SLIME = new BlockYellowSlime("yellow_slime");
    public static final Block ORANGE_SLIME = new BlockOrangeSlime("orange_slime");
    public static final Block CYAN_SLIME = new BlockCyanSlime("cyan_slime");
    public static final Block LIGHT_BLUE_SLIME = new BlockLightBlueSlime("light_blue_slime");
    public static final Block LIME_SLIME = new BlockLimeSlime("lime_slime");
    public static final Block MAGENTA_SLIME = new BlockMagentaSlime("pink_slime"); 
    public static final Block BROWN_SLIME = new BlockBrownSlime("brown_slime");

  
    
   
    
    
}
	