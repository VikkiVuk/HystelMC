package net.mcreator.hm;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementshm.ModElement.Tag
public class MCreatorBluestoneArmor extends Elementshm.ModElement {
	@GameRegistry.ObjectHolder("hm:bluestonearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("hm:bluestonearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("hm:bluestonearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("hm:bluestonearmorboots")
	public static final Item boots = null;

	public MCreatorBluestoneArmor(Elementshm instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BLUESTONEARMOR", "hm:bluestone_", 25, new int[]{3, 7, 8, 4}, 10, null, 0.1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("bluestonearmorhelmet")
				.setRegistryName("bluestonearmorhelmet").setCreativeTab(MCreatorHystelTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bluestonearmorbody")
				.setRegistryName("bluestonearmorbody").setCreativeTab(MCreatorHystelTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("bluestonearmorlegs")
				.setRegistryName("bluestonearmorlegs").setCreativeTab(MCreatorHystelTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("bluestonearmorboots")
				.setRegistryName("bluestonearmorboots").setCreativeTab(MCreatorHystelTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("hm:bluestonearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("hm:bluestonearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("hm:bluestonearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("hm:bluestonearmorboots", "inventory"));
	}
}
