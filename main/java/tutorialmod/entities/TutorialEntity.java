package tutorialmod.entities;

import tutorialmod.init.TutorialEntities;

import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

public class TutorialEntity extends MonsterEntity
{
	@SuppressWarnings("unchecked")
	public TutorialEntity(EntityType<? extends MonsterEntity> type, World worldIn) 
	{
		super((EntityType<? extends MonsterEntity>) TutorialEntities.tutorial_entity, worldIn);
	}

	@Override
	protected void registerGoals()
	{
		
		super.registerGoals();
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.6d, true));
		this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 2.0f));
		this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
	}
	
	@Override
	protected void registerAttributes() 
	{
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(50.0d);
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0d);
		//this.getAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(35.0d);
		this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(1.0d);
		this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0d);
	}
	
	@Override
    protected int getExperiencePoints(PlayerEntity player) {
      return 100;
    }
	
}