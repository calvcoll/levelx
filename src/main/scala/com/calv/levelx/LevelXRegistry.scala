package com.calv.levelx

import net.minecraft.item.{Item, ItemStack}
import net.minecraft.creativetab.CreativeTabs
import com.calv.levelx.blocks.BlockToolAltar

/**
 * Created by calv on 08/06/14.
 */
class LevelXRegistry {
  val modTab = new CreativeTabs(LevelX.modRegisterName){
    override def getIconItemStack(): ItemStack = {
      return new ItemStack(toolAltar)
    }
    override def getTabIconItem(): Item = {
      return new Item()
    }
  }
  val toolAltar = new BlockToolAltar

  def init {
    this.toolAltar.init(this.modTab)
  }
}
