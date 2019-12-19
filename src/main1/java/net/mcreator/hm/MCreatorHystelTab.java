package net.mcreator.hm;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementshm.ModElement.Tag
public class MCreatorHystelTab extends Elementshm.ModElement {
	public MCreatorHystelTab(Elementshm instance) {
		super(instance, 10);
	}
	public static CreativeTabs tab = new CreativeTabs("tabhysteltab") {
		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorBluestoneblock.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	}.setBackgroundImageName("hysteltab.png");
}
