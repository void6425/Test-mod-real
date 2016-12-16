package com.void6425.Testmod.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityChestPlus extends TileEntity {
private int count;

@Override
public NBTTagCompound writeToNBT(NBTTagCompound compound){
	compound.setInteger("count", count);
	return super.writeToNBT(compound);
}
	@Override
	public void readFromNBT(NBTTagCompound compound){
		count = compound.getInteger("count");
		super.readFromNBT(compound);
	}

public int getCount(){
	return count;
}
public void incrementCount(){
	count++;
}
public void decrementCount(){
	count--;
}






}
