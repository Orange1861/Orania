package orangeVillager61.Orania.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import orangeVillager61.Orania.Reference;
import orangeVillager61.Orania.items.OraniaItems;

public final class ItemRenderRegister {
	
	public static String modid = Reference.MOD_ID;
	
	public static void registerItemRenderer() {
	    reg(OraniaItems.raw_horse_meat);
	    reg(OraniaItems.bucket_of_salt);
	    reg(OraniaItems.bucket_of_brine);
	    reg(OraniaItems.cooked_horse_meat);
	    reg(OraniaItems.fire_opal);
	    reg(OraniaItems.salt);
	    reg(OraniaItems.raw_ender_meat);
	    reg(OraniaItems.raw_calamari);
	    reg(OraniaItems.cooked_calamari);
	    reg(OraniaItems.salted_calamari);
	    reg(OraniaItems.raw_creeper);
	    reg(OraniaItems.bucket_of_brine);
	    reg(OraniaItems.salted_chicken_cooked);
	    reg(OraniaItems.salted_porkchop_cooked);
	    reg(OraniaItems.salted_mutton_cooked);
	    reg(OraniaItems.salted_rabbit_cooked);
	    reg(OraniaItems.salted_steak_cooked);
	    reg(OraniaItems.salted_rotten_flesh);
	    reg(OraniaItems.salted_cooked_horse_meat);
	}	
		public static void reg(Item item) {
		    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
    }

