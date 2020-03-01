package jayden.mod.util.handlers;

import jayden.mod.objects.blocks.chest_bluestone.TileEntityBluestoneChest;
import jayden.mod.objects.blocks.chest_copper.TileEntityCopperChest;
import jayden.mod.objects.blocks.chest_rainbow.TileEntityRainbowChest;
import jayden.mod.objects.blocks.chest_ruby.TileEntityRubyChest;
import jayden.mod.objects.blocks.energy.storage.TileEntityEnergyStorage;
import jayden.mod.objects.blocks.machines.energy.generators.TileEntityGlowstoneGenerator;
import jayden.mod.objects.blocks.machines.rainPowerGen.TileEntityRainPG;
import jayden.mod.objects.blocks.machines.sintering.TileEntityElectricSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.TileEntitySinteringFurnace;
import jayden.mod.objects.blocks.silver_pec.TileEntitySilverFurnace;
import jayden.mod.objects.blocks.token_atm.TileEntityTokenAtm;
import jayden.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySinteringFurnace.class, new ResourceLocation(Reference.MOD_ID + ":sintering_furnace"));
		GameRegistry.registerTileEntity(TileEntityElectricSinteringFurnace.class, new ResourceLocation(Reference.MOD_ID + ":electric_sintering_furnace"));
		GameRegistry.registerTileEntity(TileEntityGlowstoneGenerator.class, new ResourceLocation(Reference.MOD_ID + ":glowstone_generator"));
		GameRegistry.registerTileEntity(TileEntityEnergyStorage.class, new ResourceLocation(Reference.MOD_ID + ":energy_storage"));
		GameRegistry.registerTileEntity(TileEntityBluestoneChest.class, new ResourceLocation(Reference.MOD_ID + ":bluestone_chest"));
		GameRegistry.registerTileEntity(TileEntityRubyChest.class, new ResourceLocation(Reference.MOD_ID + ":ruby_chest"));
		GameRegistry.registerTileEntity(TileEntityCopperChest.class, new ResourceLocation(Reference.MOD_ID + ":copper_chest"));
		GameRegistry.registerTileEntity(TileEntityRainbowChest.class, new ResourceLocation(Reference.MOD_ID + ":rainbow_chest"));
		GameRegistry.registerTileEntity(TileEntityTokenAtm.class, new ResourceLocation(Reference.MOD_ID + ":token_atm"));
		GameRegistry.registerTileEntity(TileEntityRainPG.class, new ResourceLocation(Reference.MOD_ID + ":rainpg"));
		GameRegistry.registerTileEntity(TileEntitySilverFurnace.class, new ResourceLocation(Reference.MOD_ID + ":silver_furnace"));


	}
}
