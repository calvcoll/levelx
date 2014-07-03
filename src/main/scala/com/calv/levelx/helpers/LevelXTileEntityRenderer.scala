package com.calv.levelx.helpers

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler
import net.minecraft.tileentity.TileEntity
import org.lwjgl.opengl.GL11

/**
 * Created by Calv on 15/06/14.
 */
abstract class LevelXTileEntityRenderer extends TileEntitySpecialRenderer with ISimpleBlockRenderingHandler {

  def renderTileEntityAt(tileEntity :TileEntity, x :Double, y :Double, z :Double, f :Float) {
    GL11.glPushMatrix()
    GL11.glTranslated(x, y, z)
    renderTileEntity()
    GL11.glPopMatrix()
  }

  def renderTileEntity()

}
