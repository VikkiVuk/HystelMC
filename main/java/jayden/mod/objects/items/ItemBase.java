package jayden.mod.objects.items;

import jayden.mod.HystelMC;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
  public ItemBase(String name) {
	  setUnlocalizedName(name);
	  setRegistryName(name);
	  setCreativeTab(HystelMC.hysteltab);
	  
	  ItemInit.ITEMS.add(this);
  }

         @Override
       public void registerModels() 
       {
	   
       HystelMC.proxy.registerItemRenderer(this, 0, "inventory");
        	 
       }

}
