package elementicraft.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class FireBall extends EntityThrowable
{
    private double damage;
    private EntityLivingBase shootingEntity;

	public FireBall(World worldIn)
    {
        super(worldIn);
        this.damage = 4.0D;
        this.setSize(0.3125F, 0.3125F);
    }

    public FireBall(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
        this.setSize(0.3125F, 0.3125F);
    }
    public FireBall(World worldIn, EntityLivingBase shooter)
    {
        this(worldIn, shooter.posX, shooter.posY + (double)shooter.getEyeHeight() - 0.10000000149011612D, shooter.posZ);
        this.shootingEntity = shooter;
        
    }

    public static void registerFixesSmallFireball(DataFixer fixer)
    {
        EntityFireball.registerFixesFireball(fixer, "SmallFireball");
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    
    protected void onImpact(RayTraceResult result)
    {
        if (!this.worldObj.isRemote)
        { 	
            if (result.entityHit != null){
                    
                        this.applyEnchantments(this.shootingEntity, result.entityHit);
						if(result.entityHit instanceof EntityLivingBase){
							result.entityHit.attackEntityFrom(DamageSource.onFire, 5.0F);
							this.kill();
							}
                    }
        }
    }


	/**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return false;
    }

    public void setHeadingFromThrower(Entity entityThrower, float rotationPitchIn, float rotationYawIn, float pitchOffset, float velocity, float inaccuracy)
    {
        float f = -MathHelper.sin(rotationYawIn * 0.017453292F) * MathHelper.cos(rotationPitchIn * 0.017453292F);
        float f1 = -MathHelper.sin((rotationPitchIn + pitchOffset) * 0.017453292F);
        float f2 = MathHelper.cos(rotationYawIn * 0.017453292F) * MathHelper.cos(rotationPitchIn * 0.017453292F);
        this.setThrowableHeading((double)f, (double)f1, (double)f2, velocity, inaccuracy);
        this.motionX += entityThrower.motionX;
        this.motionZ += entityThrower.motionZ;

        if (!entityThrower.onGround)
        {
            this.motionY += entityThrower.motionY;
        }
    }
}