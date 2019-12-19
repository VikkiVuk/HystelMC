package jayden.mod.objects.items;

import jayden.mod.Main;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
  public ItemBase(String name) {
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

}
