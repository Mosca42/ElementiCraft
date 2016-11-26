package elementicraft.common.entity;

import elementicraft.common.MCACommonLibrary.IMCAnimatedEntity;
import elementicraft.common.MCACommonLibrary.animation.AnimationHandler;
import elementicraft.common.animations.New.AnimationHandlerNew;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class elem_terre extends EntityCreature implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerNew(this);
	public elem_terre(World par1World) {
		super(par1World);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
	}
	
	@Override
	public AnimationHandler getAnimationHandler() {
		return animHandler;
	}

	@Override
	public void onUpdate()
	{
            super.onUpdate();
        }

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
	}
	
    protected void onDeathUpdate()
    {
    	if(!this.worldObj.isRemote) {
        this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, 1));
        this.worldObj.spawnEntityInWorld(new EntityElementsOrbEarth(this.worldObj, this.posX, this.posY, this.posZ, 1));
    	}
        this.setDead();
        
        for (int k = 0; k < 20; ++k)
        {
            double d2 = this.rand.nextGaussian() * 0.02D;
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d2, d0, d1, new int[0]);
        }
    }
}