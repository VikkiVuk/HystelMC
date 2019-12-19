package net.mcreator.hm;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

@Elementshm.ModElement.Tag
public class MCreatorBluestoneBlockGUIOnButtonClicked extends Elementshm.ModElement {
	public MCreatorBluestoneBlockGUIOnButtonClicked(Elementshm instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorBluestoneBlockGUIOnButtonClicked!");
			return;
		}
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorBluestoneBlockGUIOnButtonClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBluestoneBlockGUIOnButtonClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guiinventory.get("text:label1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText()).contains("Diamonds"))) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(Items.DIAMOND, (int) (64)));
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("CORRECT! Here's your diamonds!!"), (false));
			}
			Minecraft.getMinecraft().player.closeScreen();
		} else {
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Wrong! You get nothing!"), (false));
			}
			Minecraft.getMinecraft().player.closeScreen();
		}
	}
}
