package jayden.mod.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import jayden.mod.Main;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool implements IHasModel 
{

  private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.BED, Blocks.ACACIA_DOOR, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.ACACIA_STAIRS, Blocks.BIRCH_DOOR, Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE, Blocks.BIRCH_STAIRS, Blocks.DARK_OAK_DOOR, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE, Blocks.DARK_OAK_STAIRS, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB, Blocks.WOODEN_SLAB, Blocks.DOUBLE_WOODEN_SLAB, Blocks.OAK_DOOR, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.OAK_STAIRS);
private float efficiencyOnProperMaterial;
 
  public ToolAxe(String name, ToolMaterial material) 
  {
	  super(material, EFFECTIVE_ON);
	  setUnlocalizedName(name);
	  setRegistryName(name);
	  setCreativeTab(Main.hysteltab);
	  
	  ItemInit.ITEMS.add(this);
  }
  public float getStrVsBlock(ItemStack stack, IBlockState state)
  {
	  Material material = state.getMaterial();
	  if (material != Material.WOOD && material != Material.PLANTS && material != Material.VINE)
		return super.getDestroySpeed(stack, state);
	else
		return this.efficiencyOnProperMaterial;
  }
  @Override
  public void registerModels() {
  
   	 Main.proxy.registerItemRenderer(this, 0, "inventory");
   	 
}
	
 

	




	
}
