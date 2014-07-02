package com.calv.levelx.proxys

import cpw.mods.fml.client.registry.ClientRegistry
import com.calv.levelx.renderers.RendererToolAltar
import com.calv.levelx.tileentitys.TileEntityToolAltar
import cpw.mods.fml.relauncher.{Side, SideOnly}
import net.minecraftforge.client.MinecraftForgeClient
import net.minecraft.item.{ItemStack, Item}
import com.calv.levelx.{LevelXRegistry, LevelX}
import net.minecraft.block.Block
import net.minecraft.client.renderer.ItemRenderer
import net.minecraftforge.client.IItemRenderer.ItemRenderType
import com.calv.levelx.helpers.LevelXBlockToItemRenderer

/**
 * Created by Calv on 08/06/14.
 */
class ClientProxy extends CommonProxy {

  this.registerTESR

  @SideOnly(Side.CLIENT)
  def registerTESR {
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileEntityToolAltar], new RendererToolAltar)
    MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(LevelX.registry.toolAltar), new LevelXBlockToItemRenderer(new RendererToolAltar))
  }

}
