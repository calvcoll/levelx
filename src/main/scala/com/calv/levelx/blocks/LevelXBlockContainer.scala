package com.calv.levelx.blocks

import net.minecraft.block.{BlockContainer, Block}
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import cpw.mods.fml.common.registry.GameRegistry
import com.calv.levelx.LevelX

/**
 * Created by calv on 08/06/14.
 */
abstract class LevelXBlockContainer (blockType :Material) extends BlockContainer(blockType) {
  protected val blockName :String

  def init(creativeTab :CreativeTabs) {
    this.register(creativeTab)
  }
  def register(creativeTab :CreativeTabs) {
    GameRegistry.registerBlock(this, this.blockName)
    this.setCreativeTab(creativeTab)
    this.setBlockName(this.blockName)
  }
}
