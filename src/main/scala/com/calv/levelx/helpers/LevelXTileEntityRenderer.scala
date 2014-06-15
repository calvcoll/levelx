package com.calv.levelx.helpers

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler

/**
 * Created by Calv on 15/06/14.
 */
abstract class LevelXTileEntityRenderer extends TileEntitySpecialRenderer with ISimpleBlockRenderingHandler {
  def renderTileEntity()
}
