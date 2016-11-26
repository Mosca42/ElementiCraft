package elementicraft.common.event;

import elementicraft.common.entity.EntityElementsOrbEarth;
import elementicraft.common.entity.EntityElementsOrbEnd;
import elementicraft.common.entity.EntityElementsOrbFire;
import elementicraft.common.entity.EntityElementsOrbWater;
import elementicraft.common.entity.EntityElementsOrbWind;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropEssence {

	@SubscribeEvent
	public void DropTerre(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntityCreeper || event.getEntity() instanceof EntitySpider || event.getEntity() instanceof EntityCaveSpider || event.getEntity() instanceof EntitySpider || event.getEntity() instanceof EntitySilverfish || event.getEntity() instanceof EntitySpider || event.getEntity() instanceof EntityWitch)) {
			return;
		}
		if (!event.getEntity().worldObj.isRemote) {
			event.getEntity().worldObj.spawnEntityInWorld(new EntityElementsOrbEarth(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 1));
		}
	}

	@SubscribeEvent
	public void DropEau(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntityPolarBear || event.getEntity() instanceof EntityGuardian || event.getEntity() instanceof EntitySlime || event.getEntity() instanceof EntityWitch)) {
			return;
		}
		if (!event.getEntity().worldObj.isRemote) {
			event.getEntity().worldObj.spawnEntityInWorld(new EntityElementsOrbWater(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 1));
		}
	}

	@SubscribeEvent
	public void DropFeu(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntityBlaze || event.getEntity() instanceof EntityMagmaCube || event.getEntity() instanceof EntityPigZombie || event.getEntity() instanceof EntityWitch)) {
			return;
		}
		if (!event.getEntity().worldObj.isRemote) {
			event.getEntity().worldObj.spawnEntityInWorld(new EntityElementsOrbFire(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 1));
		}
	}

	@SubscribeEvent
	public void DropAir(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntityGhast || event.getEntity() instanceof EntityBat || event.getEntity() instanceof EntityWitch)) {
			return;
		}
		if (!event.getEntity().worldObj.isRemote) {
			event.getEntity().worldObj.spawnEntityInWorld(new EntityElementsOrbWind(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 1));
		}
	}

	@SubscribeEvent
	public void DropEnd(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntityEnderman || event.getEntity() instanceof EntityEndermite || event.getEntity() instanceof EntityShulker || event.getEntity() instanceof EntitySkeleton || event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntityWitch)) {
			return;
		}
		if (!event.getEntity().worldObj.isRemote) {
			event.getEntity().worldObj.spawnEntityInWorld(new EntityElementsOrbEnd(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, 1));
		}
	}
}
