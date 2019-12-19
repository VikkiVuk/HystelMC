package jayden.mod.objects.items.food;

import jayden.mod.Main;
import jayden.mod.init.BlockInit;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemTomatoSeed extends ItemFood implements IHasModel, IPlantable {

	public ItemTomatoSeed(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.hysteltab);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
    public void registerModels() 
    {
	   
    Main.proxy.registerItemRenderer(this, 0, "inventory");
     	 
    }
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state = worldIn.getBlockState(pos);
		if(facing == EnumFacing.UP && player.canPlayerEdit(pos, facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
		{ 
			worldIn.setBlockState(pos.up(), BlockInit.TOMATO_PLANT.getDefaultState());
			stack.shrink(1);
			return EnumActionResult.SUCCESS;
		}
		
		else return EnumActionResult.FAIL;
		
	}
	
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
 
	}
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return BlockInit.TOMATO_PLANT.getDefaultState();
	}
	
}
