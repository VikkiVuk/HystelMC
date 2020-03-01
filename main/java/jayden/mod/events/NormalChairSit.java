package jayden.mod.events;

import java.util.List;

import jayden.mod.util.Reference;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import jayden.mod.objects.blocks.BlockChair;
import jayden.mod.objects.blocks.BlockChairsy;
import jayden.mod.objects.blocks.BlockModernChair;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class NormalChairSit
{
    @SubscribeEvent
    public static void onInteractWithBlock(PlayerInteractEvent.RightClickBlock event)
    {
        EntityPlayer player = event.getEntityPlayer();
        if(player.getRidingEntity() != null)
        {
            return;
        }

        World worldIn = event.getWorld();
        BlockPos pos = event.getPos();
        Vec3d vec = new Vec3d(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
        double maxDist = 2.0D;
        if((vec.x - player.posX) * (vec.x - player.posX) + (vec.y - player.posY) * (vec.y - player.posY) + (vec.z - player.posZ) * (vec.z - player.posZ) > maxDist * maxDist)
        {
            return;
        }

        IBlockState state = worldIn.getBlockState(pos);
        ItemStack mainStack = player.getHeldItemMainhand();
        ItemStack offStack = player.getHeldItemOffhand();
        if(!mainStack.isEmpty() || !offStack.isEmpty())
        {
            return;
        }

        if(state.getBlock() instanceof BlockChair)
        {
            //List<SeatNormalChair> seats = worldIn.getEntitiesWithinAABB(SeatNormalChair.class, new AxisAlignedBB(pos, pos.add(1, 1, 1)));
        	SeatNormalChair seat = new SeatNormalChair(worldIn, pos);
            worldIn.spawnEntity(seat);
            player.startRiding(seat);
        }
    }

    public static class SeatNormalChair extends Entity
    {
        public SeatNormalChair(World worldIn, BlockPos pos)
        {
            this(worldIn);
            setPosition(pos.getX() + 0.5D, pos.getY() + 0.3D, pos.getZ() + 0.5D);
        }

        public SeatNormalChair(World worldIn)
        {
            super(worldIn);
            setSize(0.0F, 0.0F);
        }

        @Override
        public void onUpdate()
        {
            super.onUpdate();
            BlockPos pos = getPosition();
            if(!(getEntityWorld().getBlockState(pos).getBlock() instanceof BlockChair))
            {
                setDead();
                return;
            }

            List<Entity> passengers = getPassengers();
            if(passengers.isEmpty())
            {
                setDead();
            }
            for(Entity entity : passengers)
            {
                if(entity.isSneaking())
                {
                    setDead();
                }
            }
        }

        @Override
        protected void entityInit()
        {

        }

        @Override
        protected void readEntityFromNBT(NBTTagCompound compound)
        {

        }

        @Override
        protected void writeEntityToNBT(NBTTagCompound compound)
        {

        }
    }
}