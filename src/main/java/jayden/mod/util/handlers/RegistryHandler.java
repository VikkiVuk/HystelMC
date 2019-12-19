package jayden.mod.util.handlers;

import jayden.mod.Main;
import jayden.mod.commands.CommandTeleportDimension;
import jayden.mod.init.BlockInit;
import jayden.mod.init.FluidInit;
import jayden.mod.init.ItemInit;
import jayden.mod.objects.blocks.animation.RenderBluestoneChest;
import jayden.mod.objects.blocks.animation.RenderCopperChest;
import jayden.mod.objects.blocks.animation.RenderRainbowChest;
import jayden.mod.objects.blocks.animation.RenderRubyChest;
import jayden.mod.objects.blocks.chest_bluestone.TileEntityBluestoneChest;
import jayden.mod.objects.blocks.chest_copper.TileEntityCopperChest;
import jayden.mod.objects.blocks.chest_rainbow.TileEntityRainbowChest;
import jayden.mod.objects.blocks.chest_ruby.TileEntityRubyChest;
import jayden.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBluestoneChest.class, new RenderBluestoneChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRubyChest.class, new RenderRubyChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperChest.class, new RenderCopperChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRainbowChest.class, new RenderRainbowChest());
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{		
		 Main.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.BLUESTONE_CHEST), 0, "inventory");
		 Main.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.RUBY_CHEST), 0, "inventory");
		 Main.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.COPPER_CHEST), 0, "inventory");
		 Main.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.RAINBOW_CHEST), 0, "inventory");
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void otherRegistries()
	{
		
	}
	
	public static void initRegistries(FMLInitializationEvent event) 
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());	
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event) 
	{
		FluidInit.registerFluids();
		RenderHandler.registerCustomMeshesAndStates();
		ConfigHandler.registerConfig(event);
	}

	public static void postInitRegistries(FMLPostInitializationEvent event) 
	{
		GameRegistry.addSmelting(new ItemStack(Items.DIAMOND), new ItemStack(ItemInit.DIAMOND_INGOT), 5);
		GameRegistry.addSmelting(new ItemStack(BlockInit.BLUESTONE_ORE, 1), new ItemStack(ItemInit.BLUESTONE_INGOT), 3);
		GameRegistry.addSmelting(new ItemStack(BlockInit.RUBY_ORE, 1), new ItemStack(ItemInit.RUBY), 3);
		GameRegistry.addSmelting(new ItemStack(BlockInit.COPPER_ORE, 1), new ItemStack(ItemInit.COPPER_INGOT), 3);
		GameRegistry.addSmelting(new ItemStack(BlockInit.RAINBOW_ORE, 1), new ItemStack(ItemInit.RAINBOW_GEM), 3);
	}

	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDimension());
	}
	
	
	
	
}
