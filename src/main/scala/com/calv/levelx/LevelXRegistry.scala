package com.calv.levelx

import net.minecraft.item.{Item, ItemStack}
import net.minecraft.creativetab.CreativeTabs
import com.calv.levelx.blocks.{LevelXBlockContainer, BlockToolAltar}
import com.calv.levelx.tileentitys.TileEntityToolAltar
import net.minecraft.block.Block
import cpw.mods.fml.relauncher.{Side, SideOnly}
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraftforge.client.MinecraftForgeClient
import com.calv.levelx.renderers.RendererToolAltar
import com.calv.levelx.helpers.LevelXBlockToItemRenderer

/**
 * Created by calv on 08/06/14.
 */
object LevelXRegistry {

  val toolAltar = new BlockToolAltar()

  val modTab = new CreativeTabs(LevelX.modRegisterName){
    override def getIconItemStack(): ItemStack = new ItemStack(toolAltar)
    override def getTabIconItem(): Item = new Item()
  }

  toolAltar.init
  toolAltar.setCreativeTab(modTab)

  def register = {
    GameRegistry.registerBlock(toolAltar, toolAltar.blockName)
  }

}
