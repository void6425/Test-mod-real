package com.void6425.Testmod.blocks;

import javax.annotation.Nullable;

import com.void6425.Testmod.registry.ModItemsRegistry;
import com.void6425.Testmod.tiles.TileEntityCounter;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockCounter extends BlockTileEntity<TileEntityCounter> {
	
	public BlockCounter(){
		super(Material.IRON);
		setRegistryName("chestPlus");
		setUnlocalizedName("chestPlus");		
	}
	@Override
	public boolean onBlockActivated(World world,BlockPos pos,IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float HitY, float HitZ ){
		
		if (!world.isRemote){
			TileEntityCounter tile = getTileEntity(world, pos);
			if (tile.getCount() == 1){
				if(player.isSneaking()){
					player.inventory.addItemStackToInventory((new ItemStack(ModItemsRegistry.Testitem, 1)));
				}else{
					player.inventory.addItemStackToInventory((new ItemStack(ModItemsRegistry.Testitem, 64)));
				}
				
				
				
			}
			
			
			if (side == EnumFacing.DOWN){
				tile.decrementCount();
			}else if(side == EnumFacing.EAST){
				tile.incrementCount();
			}
		player.addChatMessage(new TextComponentString("Count:" + tile.getCount()));
		
		}
		return true;
	}
	
	@Override
	public Class<TileEntityCounter> getTileEntityClass() {
		return TileEntityCounter.class;
	}
	
	@Nullable
	@Override
	public TileEntityCounter createTileEntity(World world, IBlockState state) {
		return new TileEntityCounter();
	}
	
	
	
	
}
