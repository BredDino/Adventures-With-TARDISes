package net.awt.entity.custom;

import net.awt.entity.ModEntities;
import net.awt.item.ModItems;
import net.awt.sound.AWTSound;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CybermatEntity extends HostileEntity {

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public CybermatEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super((EntityType<? extends HostileEntity>) entityType, world);
    }


    private void setupAnimationStates(){
     if (this.idleAnimationTimeout <= 0){
         this.idleAnimationTimeout = this.random.nextInt(40) + 80;
         this.idleAnimationState.start(this.age);
     } else{
         --this.idleAnimationTimeout;
     }
    }

    @Override
    protected void initDataTracker() {

    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient){
          setupAnimationStates();
        }
    }


    public static DefaultAttributeContainer.Builder createCybermatAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,50)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.25f)
                .add(EntityAttributes.GENERIC_ARMOR,1);

    }
    Nullable
    @Override
    public HostileEntity createChild(ServerWorld world, HostileEntity entity) {
        return ModEntities.CYBERMAT.create(world);
    }

}
