package com.calv.levelx

import net.minecraft.item.{Item, ItemStack}
import net.minecraft.creativetab.CreativeTabs
import com.calv.levelx.blocks.BlockToolAltar
import com.calv.levelx.tileentitys.TileEntityToolAltar
import net.minecraft.block.Block
import cpw.mods.fml.relauncher.{Side, SideOnly}

/**
 * Created by calv on 08/06/14.
 */
class LevelXRegistry {
  val modTab = new CreativeTabs(LevelX.modRegisterName){
    override def getIconItemStack(): ItemStack = new ItemStack(Block.getBlockById(1))
    override def getTabIconItem(): Item = new Item()
  }

  val toolAltar = new BlockToolAltar
  toolAltar.init(modTab)

}
