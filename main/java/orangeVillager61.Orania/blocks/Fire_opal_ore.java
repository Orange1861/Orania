package orangeVillager61.Orania.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import orangeVillager61.Orania.Orania;
import orangeVillager61.Orania.items.OraniaItems;

public class Fire_opal_ore extends Block{
	
	protected Fire_opal_ore(String unlocalizedName, Material mat){
        super(mat);
		this.setHarvestLevel("pickaxe", 2);
        this.setHardness(4.5f);
        this.setResistance(10.0f);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Orania.tabOrania);
    }
	
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
	    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	    drops.add(new ItemStack(Blocks.netherrack));
	    if (RANDOM.nextFloat() < 0.3F)
	    	drops.add(new ItemStack(OraniaItems.fire_opal));
	    return drops;
	    
	}
}

	
