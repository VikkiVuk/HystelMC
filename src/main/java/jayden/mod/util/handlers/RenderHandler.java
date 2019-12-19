package jayden.mod.util.handlers;

import jayden.mod.init.BlockInit;
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
	

	}
	
	
		

}


