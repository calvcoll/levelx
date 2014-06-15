package com.calv.levelx.helpers

import net.minecraftforge.client.IItemRenderer
import net.minecraft.item.ItemStack
import net.minecraftforge.client.IItemRenderer.{ItemRendererHelper, ItemRenderType}

/**
 * Created by Calv on 15/06/14.
 */
class LevelXBlockToItemRenderer(tileEntityRenderer :LevelXTileEntityRenderer) extends IItemRenderer {
  override def renderItem(renderType :ItemRenderType, item :ItemStack, data :AnyRef*) = {
    tileEntityRenderer.renderTileEntity()
  }

  override def shouldUseRenderHelper(`type`: ItemRenderType, item: ItemStack, helper: ItemRendererHelper): Boolean = true

  override def handleRenderType(item: ItemStack, `type`: ItemRenderType): Boolean = true
}
