package com.calv.levelx

import net.minecraft.item.{Item, ItemStack}
import net.minecraft.creativetab.CreativeTabs
import com.calv.levelx.blocks.BlockToolAltar
import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.FMLCommonHandler
import cpw.mods.fml.relauncher.{SideOnly, Side}
import com.calv.levelx.tileentitys.TileEntityToolAltar
import cpw.mods.fml.client.registry.ClientRegistry
import com.calv.levelx.renderers.RendererToolAltar
import net.minecraftforge.client.MinecraftForgeClient
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
    GameRegistry.registerTileEntity(classOf[TileEntityToolAltar], "toolAltarTileEntity")
    val side = FMLCommonHandler.instance().getEffectiveSide
    if (side == Side.CLIENT) {
      registerTESR
    }
  }

  @SideOnly(Side.CLIENT)
  def registerTESR = {
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileEntityToolAltar], new RendererToolAltar)
    MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(LevelX.registry.toolAltar), new LevelXBlockToItemRenderer(new RendererToolAltar))
  }
}
