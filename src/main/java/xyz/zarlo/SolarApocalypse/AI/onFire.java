package xyz.zarlo.SolarApocalypse.AI;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;

public class onFire  extends EntityAIBase {

	private EntityLiving theEntity;
	public boolean foundWater = false;
	
	public onFire(EntityLiving par1EntityLiving)
	{
	this.theEntity = par1EntityLiving;
	}
	@Override
	public boolean shouldExecute() {
		
		return theEntity.isBurning();
		
	}

	@Override
	public void startExecuting()
	{
		findWater();
		
	}

	@Override
	public void resetTask()
	{
		foundWater = false;
	}

	public void updateTask()
	{
		
		 
		if(foundWater == false)
			findWater();
		
	}
	
	
	public void findWater()
	{
		
		World world = theEntity.world;
		
		
		
		this.theEntity.getNavigator().getPathToXYZ(x, y, z);
		
	}
	

}
