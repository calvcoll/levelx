package com.calv.levelx.blocks

import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.block.Block
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.ItemStack
import com.calv.levelx.tileentitys.TileEntityToolAltar
import net.minecraft.world.{IBlockAccess, World}

/**
 * Created by calv on 08/06/14.
 */
class BlockToolAltar() extends LevelXBlockContainer(Material.rock, null){
  val blockName = "toolAltar"

  override def createNewTileEntity(world :World, metadata :Int) = new TileEntityToolAltar

  override def shouldSideBeRendered(blockAccess :IBlockAccess, i :Int, j:Int, k:Int, l:Int) = false
  override def isOpaqueCube() = false

  override def init = {
    this.setHardness(2F)
    this.setStepSound(Block.soundTypeStone)
    this.setHarvestLevel("pickaxe", 10)
    GameRegistry.addShapelessRecipe(new ItemStack(this),new ItemStack(Block.getBlockFromName("minecraft:stone")),
                                                        new ItemStack(Block.getBlockFromName("minecraft:coalore")))
    this.setBlockName(this.blockName)
  }

}
