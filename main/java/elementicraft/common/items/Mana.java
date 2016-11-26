package elementicraft.common.items;

import elementicraft.client.Elementicraft;
import elementicraft.common.utils.ManaUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Mana extends Item {

	public Mana(){
		this.setMaxStackSize(1);
		this.setCreativeTab(Elementicraft.Tabs);
		this.setRegistryName("Mana");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if(!worldIn.isRemote){
			ManaUtils.addMana(playerIn, 500);
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
	
}
