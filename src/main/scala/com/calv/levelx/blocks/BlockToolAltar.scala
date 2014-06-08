package com.calv.levelx.blocks

import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.block.Block
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.{Item, ItemStack}

/**
 * Created by calv on 08/06/14.
 */
class BlockToolAltar extends LevelXBlock(Material.rock){
  val blockName = "toolAltar"

  def init(creativeTab :CreativeTabs) {
    this.register(creativeTab)
    this.setHardness(2F)
    this.setStepSound(Block.soundTypeStone)
    this.setHarvestLevel("pickaxe", 10)
    GameRegistry.addShapelessRecipe(new ItemStack(this),new ItemStack(Block.getBlockFromName("minecraft:stone")),new ItemStack(Block.getBlockFromName("minecraft:coalore")))
  }
}
