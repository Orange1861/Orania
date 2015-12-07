package orangeVillager61.Orania;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import orangeVillager61.Orania.items.OraniaItems;

public class OraniaTab extends CreativeTabs{

	public OraniaTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		
		return OraniaItems.fire_opal;
	}

}
