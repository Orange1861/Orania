package orangeVillager61.Orania;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import orangeVillager61.Orania.blocks.OraniaBlocks;
import orangeVillager61.Orania.items.OraniaItems;

public class OraniaRecipes 
{
	
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(OraniaBlocks.fire_opal_block),
				"OOO",
				"OOO",
				"OOO",
				'O', OraniaItems.fire_opal);
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				"  l",
				"OOO",
				"O O",
				'O', Items.leather, 'l', Items.lead);
		GameRegistry.addRecipe(new ItemStack(OraniaBlocks.advanced_brine_filter),
				"C C",
				"O O",
				"OOO",
				'C', Blocks.cobblestone, 'O', Blocks.obsidian);
		
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_cooked_horse_meat), OraniaItems.salt, OraniaItems.cooked_horse_meat);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_calamari), OraniaItems.salt, OraniaItems.cooked_calamari);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.fire_opal, 9), OraniaBlocks.fire_opal_block);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salt, 4), OraniaItems.bucket_of_salt);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_steak_cooked), OraniaItems.salt, Items.cooked_beef);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_mutton_cooked), OraniaItems.salt, Items.cooked_mutton);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_porkchop_cooked), OraniaItems.salt, Items.cooked_porkchop);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_rabbit_cooked), OraniaItems.salt, Items.cooked_rabbit);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_chicken_cooked), OraniaItems.salt, Items.cooked_chicken);
		GameRegistry.addShapelessRecipe(new ItemStack(OraniaItems.salted_rotten_flesh), OraniaItems.salt, Items.rotten_flesh);
	
		//Smelting Recipes
		GameRegistry.addSmelting(OraniaItems.raw_horse_meat, new ItemStack(OraniaItems.cooked_horse_meat), 0.35F);
		GameRegistry.addSmelting(OraniaItems.raw_calamari, new ItemStack(OraniaItems.cooked_calamari), 0.35F);
		GameRegistry.addSmelting(OraniaItems.bucket_of_brine, new ItemStack(OraniaItems.bucket_of_salt), 0.35F);

	}

	public static void main(String[] args) {
	}
	
}
