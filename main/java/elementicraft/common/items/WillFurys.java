package elementicraft.common.items;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import elementicraft.client.Elementicraft;
import net.minecraft.entity.EntityLivingBase;import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class WillFurys extends Item implements IBauble {

	public WillFurys(){
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setCreativeTab(Elementicraft.Tabs);
		this.setRegistryName("WillFurys");
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage()==0) {
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1, 1, false, false));
		}		
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if (!player.worldObj.isRemote) {
			player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.1F, 1.3f);
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, EnumHand hand) {
		if(!par2World.isRemote) { 
			InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(par3EntityPlayer);
			for(int i = 0; i < baubles.getSizeInventory(); i++)
				if(baubles.getStackInSlot(i) == null && baubles.isItemValidForSlot(i, par1ItemStack)) {
					baubles.setInventorySlotContents(i, par1ItemStack.copy());
					if(!par3EntityPlayer.capabilities.isCreativeMode){
						par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.currentItem, null);
					}
					onEquipped(par1ItemStack, par3EntityPlayer);
					break;
				}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, par1ItemStack);	
	}
	
	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
	@Override
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add(ChatFormatting.AQUA+"Vitesse : +25%");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}

}
