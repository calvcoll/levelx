package com.calv.levelx.blocks

import net.minecraft.block.{BlockContainer, Block}
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import cpw.mods.fml.common.registry.GameRegistry
import com.calv.levelx.LevelX

/**
 * Created by calv on 08/06/14.
 */
abstract class LevelXBlockContainer (blockType :Material, creativeTab :CreativeTabs) extends BlockContainer(blockType) {
  protected val blockName :String

  def init = {
    this.register
  }
  def register = {
    this.setCreativeTab(creativeTab)
    this.setBlockName(this.blockName)
    this.setBlockTextureName(LevelX.modRegisterName + ":" + this.blockName)
  }
}
