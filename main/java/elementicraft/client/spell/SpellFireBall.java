package elementicraft.client.spell;

import elementicraft.common.entity.FireBall;
import elementicraft.common.utils.ManaUtils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SpellFireBall extends Item {
	public int mana;

	public SpellFireBall(int mana) {
		this.mana = mana;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
			if(ManaUtils.getMana(playerIn) >= mana)
			{
				if(!worldIn.isRemote){
				ManaUtils.removeMana(playerIn, mana);
				FireBall fireball = new FireBall(worldIn, playerIn);
				fireball.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3F, 0F);
				worldIn.spawnEntityInWorld(fireball); 
				}
			}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}

}
