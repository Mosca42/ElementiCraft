package elementicraft.common.blocs;

import elementicraft.client.Elementicraft;
import elementicraft.common.tiles.TileEntityTableSort;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TableSort extends BlockContainer {

	public TableSort(Material materiel) {
		super(materiel);
		this.setHardness(15.0F);
		this.setResistance(25.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {


			playerIn.openGui(Elementicraft.instance, 0, worldIn, pos.getX(), pos.getY(), pos.getZ());
			return true;
		
	}

	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileEntity tile = world.getTileEntity(pos);
		
		if(tile instanceof TileEntityTableSort) {
			InventoryHelper.dropInventoryItems(world, pos, (TileEntityTableSort)tile);
		}
		super.breakBlock(world, pos, state);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTableSort();
	}
	@Override
	public boolean hasTileEntity() { 
		return true; 
	}
}
