package orangeVillager61.Orania;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import orangeVillager61.Orania.blocks.BlockPropertiesAdvancedBrineFilter;
import orangeVillager61.Orania.blocks.ItemBlockMeta;
import orangeVillager61.Orania.blocks.OraniaBlocks;
import orangeVillager61.Orania.items.OraniaItems;
import orangeVillager61.Orania.mobDrops.EnderdragonDrops;
import orangeVillager61.Orania.mobDrops.EndermanDrops;
import orangeVillager61.Orania.mobDrops.EndermiteDrops;
import orangeVillager61.Orania.mobDrops.HorseDrops;
import orangeVillager61.Orania.mobDrops.SquidDrops;
import orangeVillager61.Orania.world.ChestGen;
import orangeVillager61.Orania.world.OraniaWorldGenerator;

public class CommonProxy {
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	OraniaItems.createItems();
    	OraniaBlocks.createBlocks();
    	MinecraftForge.EVENT_BUS.register(new HorseDrops());
    	MinecraftForge.EVENT_BUS.register(new SquidDrops());
    	MinecraftForge.EVENT_BUS.register(new EndermanDrops());
    	MinecraftForge.EVENT_BUS.register(new EndermiteDrops());
    	MinecraftForge.EVENT_BUS.register(new EnderdragonDrops());
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	OraniaRecipes.addRecipes();
    	GameRegistry.registerWorldGenerator(new OraniaWorldGenerator(), 90);
    	ChestGen.Int();
   }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

	}
