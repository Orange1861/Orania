package orangeVillager61.Orania.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import orangeVillager61.Orania.Orania;
import orangeVillager61.Orania.items.OraniaItems;

public class BlockPropertiesAdvancedBrineFilter extends BasicBlock implements IMetaBlockName{

	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockPropertiesAdvancedBrineFilter.EnumType.class);
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
	    list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
	    list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, meta == 0 ? EnumType.EMPTY : EnumType.FULL);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		EnumType type = (EnumType) state.getValue(TYPE);
		return type.getID();
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { TYPE });
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return stack.getItemDamage() == 0 ? "empty" : "full";
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}
	
	public BlockPropertiesAdvancedBrineFilter(String unlocalizedName, Material material, float hardness, float resistance) {
		super(unlocalizedName, material, hardness, resistance);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.EMPTY));
		
	}
	
	public enum EnumType implements IStringSerializable {
		EMPTY(0, "empty"), FULL(1, "full");

		private int ID;
		private String name;

		private EnumType(int ID, String name) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}

		public int getID() {
			return this.ID;
		}

		@Override
		public String toString() {
			return this.getName();
		}

		}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		 
			if (state.getValue(TYPE) == EnumType.EMPTY){
			ItemStack itemstack = playerIn.getCurrentEquippedItem();
			if (itemstack.getItem() == Items.water_bucket){
				worldIn.setBlockState(pos, (this.blockState.getBaseState().withProperty(TYPE, EnumType.FULL)));
				if (!playerIn.capabilities.isCreativeMode) {
					playerIn.destroyCurrentEquippedItem();
					return true;
					}
				
			}
		}
		if (!worldIn.isRemote){
		if (state.getValue(TYPE) == EnumType.FULL){
			worldIn.setBlockState(pos, (this.blockState.getBaseState().withProperty(TYPE, EnumType.EMPTY)));
			EntityItem entityitem1 = new EntityItem(worldIn, hitX, hitY, hitZ, new ItemStack(Items.bucket, 1));
			EntityItem entityitem2 = new EntityItem(worldIn, hitX, hitY, hitZ, new ItemStack(OraniaItems.bucket_of_brine, 1));
			worldIn.spawnEntityInWorld(entityitem1);
			worldIn.spawnEntityInWorld(entityitem2);
			return true;
			}
		}
		return false;
			}
	
			@Override
			public String getSpecialName1(ItemStack stack) {
				return null;
			}
}
	
