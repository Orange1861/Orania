package orangeVillager61.Orania.world;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import orangeVillager61.Orania.items.OraniaItems;

public class ChestGen {

	public static void Int(){
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OraniaItems.salt),3,10,30));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(OraniaItems.fire_opal), 2, 32, 20));  
	}

}
