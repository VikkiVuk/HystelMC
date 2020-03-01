package jayden.mod.objects.blocks.token_atm;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import jayden.mod.HystelMC;
import jayden.mod.init.BlockInit;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import jayden.mod.util.handlers.ConfigHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTokenAtm extends BlockContainer implements IHasModel {
	
	private static final AxisAlignedBB BACK = new AxisAlignedBB(0, 0, -1, 1, 1.5, -0.875);
	private static final AxisAlignedBB LEFT_SIDE = new AxisAlignedBB(0, 0, -0.875, 0.062, 1.5, 1.125);
	private static final AxisAlignedBB RIGHT_SIDE = new AxisAlignedBB(0.938, 0, -0.875, 1, 1.5, 1.125);
	private static final AxisAlignedBB BOTTOM = new AxisAlignedBB(0.062, 0, -0.875, 0.938, 0.062, 1.125);
	private static final AxisAlignedBB TOP = new AxisAlignedBB(0.062, 1.438, -0.875, 0.938, 1.5, 1.125);
	private static final AxisAlignedBB FRONT_BOTTOM = new AxisAlignedBB(0.062, 0.062, 1.062, 0.938, 0.438, 1.125);
	private static final AxisAlignedBB FRONT_LEFT_SIDE = new AxisAlignedBB(0.062, 0.438, 1.062, 0.188, 1.438, 1.125);
	private static final AxisAlignedBB FRONT_RIGHT_SIDE = new AxisAlignedBB(0.812, 0.438, 1.062, 0.938, 1.438, 1.125);
	private static final AxisAlignedBB FRONT_TOP = new AxisAlignedBB(0.188, 1.375, 1.062, 0.812, 1.438, 1.125);
	private static final AxisAlignedBB FRONT_HOLE_FOR_TOKEN_LEFT = new AxisAlignedBB(0.312, 0.438, 1.062, 0.375, 0.688, 1.125);
	private static final AxisAlignedBB FRONT_HOLE_FOR_TOKEN_RIGH = new AxisAlignedBB(0.625, 0.438, 1.062, 0.688, 0.688, 1.125);
	private static final AxisAlignedBB FRONT_HOLE_FOR_TOKEN_TOP = new AxisAlignedBB(0.375, 0.625, 1.062, 0.625, 0.688, 1.125);
	private static final AxisAlignedBB SCREEN = new AxisAlignedBB(0.25, 1, 1.125, 0.75, 1.25, 1.188);
	private static final AxisAlignedBB BACKGROUND_FRONT_LEFT = new AxisAlignedBB(0.188, 0.438, 1.062, 0.312, 1.375, 1.125);
	private static final AxisAlignedBB BACKGROUND_FRONT_RIGHT = new AxisAlignedBB(0.688, 0.438, 1.062, 0.812, 1.375, 1.125);
	private static final AxisAlignedBB BACKGROUND_FRONT_EVERY = new AxisAlignedBB(0.312, 0.688, 1.062, 0.688, 1.375, 1.125);
	private static final AxisAlignedBB EVERYTHIUNGINSIDE = new AxisAlignedBB(0.062, 0.062, -0.375, 0.938, 1.438, 1.062);
	
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(BACK, LEFT_SIDE, RIGHT_SIDE, BOTTOM, TOP, FRONT_BOTTOM, FRONT_LEFT_SIDE, FRONT_RIGHT_SIDE, FRONT_TOP, FRONT_HOLE_FOR_TOKEN_LEFT, FRONT_HOLE_FOR_TOKEN_RIGH, FRONT_HOLE_FOR_TOKEN_TOP, SCREEN, BACKGROUND_FRONT_LEFT, BACKGROUND_FRONT_RIGHT, BACKGROUND_FRONT_EVERY, EVERYTHIUNGINSIDE);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, -1, 1, 1.5, 1.188);

	
	public BlockTokenAtm(String name)
	{
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.5F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(HystelMC.hysteltab);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;			
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) 
	{
		return false;
	} 
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
	    return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entity, boolean isActualState)
	{
	    entityBox = entityBox.offset(-pos.getX(), -pos.getY(), -pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOXES)
	    {
	        if (entityBox.intersects(box))
	            collidingBoxes.add(box.offset(pos));
	    }
	}

	@Override
	@Nullable
	public RayTraceResult collisionRayTrace(IBlockState state, World world, BlockPos pos, Vec3d start, Vec3d end)
	{
	    double distanceSq;
	    double distanceSqShortest = Double.POSITIVE_INFINITY;
	    RayTraceResult resultClosest = null;
	    RayTraceResult result;
	    start = start.subtract(pos.getX(), pos.getY(), pos.getZ());
	    end = end.subtract(pos.getX(), pos.getY(), pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOXES)
	    {
	        result = box.calculateIntercept(start, end);
	        if (result == null)
	            continue;

	        distanceSq = result.hitVec.squareDistanceTo(start);
	        if (distanceSq < distanceSqShortest)
	        {
	            distanceSqShortest = distanceSq;
	            resultClosest = result;
	        }
	    }
	    return resultClosest == null ? null : new RayTraceResult(RayTraceResult.Type.BLOCK, resultClosest.hitVec.addVector(pos.getX(), pos.getY(), pos.getZ()), resultClosest.sideHit, pos);
	    
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(HystelMC.instance, ConfigHandler.GUI_TOKEN_ATM, worldIn, pos.getX(), pos.getY(), pos.getZ()); 
		}
		
		return true;
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 
	{
		TileEntityTokenAtm tileentity = (TileEntityTokenAtm)worldIn.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);
		super.breakBlock(worldIn, pos, state);
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		if(stack.hasDisplayName())
		{
			TileEntity tileentity = worldIn.getTileEntity(pos);
			
			if(tileentity instanceof TileEntityTokenAtm)
			{
				((TileEntityTokenAtm)tileentity).setCustomName(stack.getDisplayName()); 
			}	
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TileEntityTokenAtm();
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) 
	{
		return EnumBlockRenderType.MODEL;
	}
	
    @Override
    public void registerModels() 
   {
 
  	 HystelMC.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
  	 
   }
    
    
  @Override
public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
	// TODO Auto-generated method stub
	  super.dropXpOnBlockBreak(worldIn, pos, 15);
}
	
	
	
	




}