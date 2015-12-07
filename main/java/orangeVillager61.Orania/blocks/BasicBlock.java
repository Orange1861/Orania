ackage orangeVillager61.Orania.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import orangeVillager61.Orania.Orania;

public class BasicBlock extends Block {

    public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Orania.tabOrania);
        this.setHardness(hardness);
        this.setResistance(resistance);
 
    }

    public BasicBlock(String unlocalizedName, Material material) {
    	this(unlocalizedName, material, 2.0f, 10.0f);
        this.setCreativeTab(Orania.tabOrania);
    }
    
}


