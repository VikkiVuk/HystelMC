package jayden.mod.objects.blocks.chest_rainbow;

import jayden.mod.Main;
import jayden.mod.init.BlockInit;
import jayden.mod.init.ItemInit;
import jayden.mod.util.handlers.ConfigHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand; 
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRainbowChest extends BlockContainer
{
	public BlockRainbowChest(String name) 
	{
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.hysteltab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(Main.instance, ConfigHandler.GUI_RAINBOW_CHEST, worldIn, pos.getX(), pos.getY(), pos.getZ()); 
		}
		
		return true;
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 
	{
		TileEntityRainbowChest tileentity = (TileEntityRainbowChest)worldIn.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);
		super.breakBlock(worldIn, pos, state);
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		if(stack.hasDisplayName())
		{
			TileEntity tileentity = worldIn.getTileEntity(pos);
			
			if(tileentity instanceof TileEntityRainbowChest)
			{
				((TileEntityRainbowChest)tileentity).setCustomName(stack.getDisplayName()); 
			}	
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityRainbowChest();
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
}
