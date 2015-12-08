package orangeVillager61.Orania.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class OraniaBlocks {

	public static Block fire_opal_block;
	public static Block basic_brine_filter;
	public static Block fire_opal_ore;
	public static Block advanced_brine_filter;
	
	public static void createBlocks()
	{
		GameRegistry.registerBlock(advanced_brine_filter = new BlockPropertiesAdvancedBrineFilter("advanced_brine_filter", Material.iron, 20.0F, 60.0F), ItemBlockMeta.class, "advanced_brine_filter");
		GameRegistry.registerBlock(fire_opal_block = new BasicBlock("fire_opal_block", Material.iron), "fire_opal_block");
		GameRegistry.registerBlock(fire_opal_ore = new Fire_opal_ore("fire_opal_ore", Material.rock), "fire_opal_ore");
	}
		
	public static void harvestLevel(){
		OraniaBlocks.fire_opal_ore.setHarvestLevel("pickaxe", 2);
		OraniaBlocks.fire_opal_block.setHarvestLevel("pickaxe", 2);
		OraniaBlocks.advanced_brine_filter.setHarvestLevel("pickaxe", 3);
	}
}
