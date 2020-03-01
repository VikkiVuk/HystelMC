package jayden.mod.util.handlers;

import jayden.mod.objects.blocks.chest_bluestone.ContainerBluestoneChest;
import jayden.mod.objects.blocks.chest_bluestone.GuiBluestoneChest;
import jayden.mod.objects.blocks.chest_bluestone.TileEntityBluestoneChest;
import jayden.mod.objects.blocks.chest_copper.ContainerCopperChest;
import jayden.mod.objects.blocks.chest_copper.GuiCopperChest;
import jayden.mod.objects.blocks.chest_copper.TileEntityCopperChest;
import jayden.mod.objects.blocks.chest_rainbow.ContainerRainbowChest;
import jayden.mod.objects.blocks.chest_rainbow.GuiRainbowChest;
import jayden.mod.objects.blocks.chest_rainbow.TileEntityRainbowChest;
import jayden.mod.objects.blocks.chest_ruby.ContainerRubyChest;
import jayden.mod.objects.blocks.chest_ruby.GuiRubyChest;
import jayden.mod.objects.blocks.chest_ruby.TileEntityRubyChest;
import jayden.mod.objects.blocks.energy.storage.ContainerEnergyStorage;
import jayden.mod.objects.blocks.energy.storage.GuiEnergyStorage;
import jayden.mod.objects.blocks.energy.storage.TileEntityEnergyStorage;
import jayden.mod.objects.blocks.machines.energy.generators.ContainerGlowstoneGenerator;
import jayden.mod.objects.blocks.machines.energy.generators.GuiGlowstoneGenerator;
import jayden.mod.objects.blocks.machines.energy.generators.TileEntityGlowstoneGenerator;
import jayden.mod.objects.blocks.machines.rainPowerGen.ContainerRainPG;
import jayden.mod.objects.blocks.machines.rainPowerGen.GuiRainPG;
import jayden.mod.objects.blocks.machines.rainPowerGen.TileEntityRainPG;
import jayden.mod.objects.blocks.machines.sintering.ContainerElectricSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.ContainerSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.GuiElectricSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.GuiSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.TileEntityElectricSinteringFurnace;
import jayden.mod.objects.blocks.machines.sintering.TileEntitySinteringFurnace;
import jayden.mod.objects.blocks.silver_pec.ContainerSilverFurnace;
import jayden.mod.objects.blocks.silver_pec.GuiSilverFurnace;
import jayden.mod.objects.blocks.silver_pec.TileEntitySilverFurnace;
import jayden.mod.objects.blocks.token_atm.ContainerTokenAtm;
import jayden.mod.objects.blocks.token_atm.GuiTokenAtm;
import jayden.mod.objects.blocks.token_atm.TileEntityTokenAtm;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_SINTERING_FURNACE) return new ContainerSinteringFurnace(player.inventory, (TileEntitySinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_ELECTRIC_SINTERING_FURNACE) return new ContainerElectricSinteringFurnace(player.inventory, (TileEntityElectricSinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_GLOWSTONE_GENERATOR) return new ContainerGlowstoneGenerator(player.inventory, (TileEntityGlowstoneGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_ENERGY_STORAGE) return new ContainerEnergyStorage(player.inventory, (TileEntityEnergyStorage)world.getTileEntity(new BlockPos(x,y,z))); 
		if(ID == ConfigHandler.GUI_BLUESTONE_CHEST) return new ContainerBluestoneChest(player.inventory, (TileEntityBluestoneChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_RUBY_CHEST) return new ContainerRubyChest(player.inventory, (TileEntityRubyChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_COPPER_CHEST) return new ContainerCopperChest(player.inventory, (TileEntityCopperChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_RAINBOW_CHEST) return new ContainerRainbowChest(player.inventory, (TileEntityRainbowChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_TOKEN_ATM) return new ContainerTokenAtm(player.inventory, (TileEntityTokenAtm)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_RAINPG) return new ContainerRainPG(player.inventory, (TileEntityRainPG)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_SILVER_FURNACE) return new ContainerSilverFurnace(player.inventory, (TileEntitySilverFurnace)world.getTileEntity(new BlockPos(x,y,z)));


		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_SINTERING_FURNACE) return new GuiSinteringFurnace(player.inventory, (TileEntitySinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_GLOWSTONE_GENERATOR) return new GuiGlowstoneGenerator(player.inventory, (TileEntityGlowstoneGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_ELECTRIC_SINTERING_FURNACE) return new GuiElectricSinteringFurnace(player.inventory, (TileEntityElectricSinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_ENERGY_STORAGE) return new GuiEnergyStorage(player.inventory, (TileEntityEnergyStorage)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_BLUESTONE_CHEST) return new GuiBluestoneChest(player.inventory, (TileEntityBluestoneChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_RUBY_CHEST) return new GuiRubyChest(player.inventory, (TileEntityRubyChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_COPPER_CHEST) return new GuiCopperChest(player.inventory, (TileEntityCopperChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_RAINBOW_CHEST) return new GuiRainbowChest(player.inventory, (TileEntityRainbowChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_TOKEN_ATM) return new GuiTokenAtm(player.inventory, (TileEntityTokenAtm)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == ConfigHandler.GUI_RAINPG) return new GuiRainPG(player.inventory, (TileEntityRainPG)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == ConfigHandler.GUI_SILVER_FURNACE) return new GuiSilverFurnace(player.inventory, (TileEntitySilverFurnace)world.getTileEntity(new BlockPos(x,y,z)));



		return null;
	}
}
