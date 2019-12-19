package net.mcreator.hm;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.HashMap;

@Elementshm.ModElement.Tag
public class MCreatorTest1 extends Elementshm.ModElement {
	public MCreatorTest1(Elementshm instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTest1!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorTest1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorTest1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorTest1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTest1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((new ItemStack(Items.DIAMOND, (int) (1)).getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity)
				.getHeldItemMainhand() : ItemStack.EMPTY).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DIAMOND, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("There you go!"), (true));
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(hm.instance, MCreatorBluestoneBlockGUI.GUIID, world, x, y, z);
			if (entity instanceof EntityPlayerMP)
				MCreatorDiamondGenOpnACH.trigger.triggerAdvancement((EntityPlayerMP) entity);
		} else {
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("You don't have diamond in your main hand"), (true));
			}
			if (entity instanceof EntityPlayerMP)
				MCreatorDiamondGenFail.trigger.triggerAdvancement((EntityPlayerMP) entity);
		}
	}
}
