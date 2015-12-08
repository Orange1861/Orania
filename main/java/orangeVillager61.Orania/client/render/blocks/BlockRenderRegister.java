package orangeVillager61.Orania.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import orangeVillager61.Orania.Reference;
import orangeVillager61.Orania.blocks.OraniaBlocks;

public final class BlockRenderRegister {
	
	public static void preInit() {
		 ModelBakery.addVariantName(Item.getItemFromBlock(OraniaBlocks.advanced_brine_filter), "oa:advanced_brine_filter_full", "oa:advanced_brine_filter_empty");
	}
	
	public static String modid = Reference.MOD_ID;

	public static void registerBlockRenderer() {
	    reg(OraniaBlocks.fire_opal_block);
	    reg(OraniaBlocks.fire_opal_ore);
	    reg(OraniaBlocks.advanced_brine_filter, 0, "advanced_brine_filter_empty");
	    reg(OraniaBlocks.advanced_brine_filter, 1, "advanced_brine_filter_full");
	}
	
	
	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Block block, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
}
