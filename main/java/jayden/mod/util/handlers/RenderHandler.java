package jayden.mod.util.handlers;

import jayden.mod.init.BlockInit;
import jayden.mod.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler 
{
	
	public static void registerCustomMeshesAndStates()
	{
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.CHOCOLATE_MILK_FLUID), new ItemMeshDefinition() 
		{	
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) 
			{
				return new ModelResourceLocation("hrm:chocolate_milk", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.CHOCOLATE_MILK_FLUID, new StateMapperBase() 
		{	
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("hrm:chocolate_milk", "fluid");
			}
		});	
		
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.WHITE_WATER_FLUID), new ItemMeshDefinition() 
		{	
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":white_water", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.WHITE_WATER_FLUID, new StateMapperBase() 
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":white_water", "fluid");
			}
		});
		
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.MOLTEN_COPPER_FLUID), new ItemMeshDefinition() 
		{	
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":molten_copper", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.MOLTEN_COPPER_FLUID, new StateMapperBase() 
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":molten_copper", "fluid");
			}
		});
		
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.MOLTEN_BLUESTONE_FLUID), new ItemMeshDefinition() 
		{	
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":molten_bluestone", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.MOLTEN_BLUESTONE_FLUID, new StateMapperBase() 
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":molten_bluestone", "fluid");
			}
		});
		
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.MOLTEN_RUBY_FLUID), new ItemMeshDefinition() 
		{	
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":molten_ruby", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.MOLTEN_RUBY_FLUID, new StateMapperBase() 
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) 
			{
				return new ModelResourceLocation(Reference.MOD_ID + ":molten_ruby", "fluid");
			}
		});
	

	}
	
	
		

}


