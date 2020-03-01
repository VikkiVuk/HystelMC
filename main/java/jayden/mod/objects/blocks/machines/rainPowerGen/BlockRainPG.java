package jayden.mod.objects.blocks.machines.rainPowerGen;



import jayden.mod.HystelMC;
import jayden.mod.objects.blocks.BlockBase;
import jayden.mod.util.handlers.ConfigHandler;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRainPG extends BlockBase
{
	public BlockRainPG(String name)
	{
		super(name, Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(2.9F);
		setHarvestLevel("pickaxe", 1);
		setResistance(28.9F);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) 
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityRainPG();
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(HystelMC.instance, ConfigHandler.GUI_RAINPG, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}
}
