package com.calv.levelx.renderers

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraft.util.ResourceLocation
import com.calv.levelx.LevelX
import net.minecraft.tileentity.TileEntity
import org.lwjgl.opengl.GL11
import net.minecraft.client.Minecraft
import net.minecraftforge.client.model.{IModelCustom, AdvancedModelLoader}
import cpw.mods.fml.common.FMLLog

/**
 * Created by Calv on 08/06/14.
 */
class RendererToolAltar extends TileEntitySpecialRenderer{

  private val toolAltar :IModelCustom = AdvancedModelLoader.loadModel(new ResourceLocation(LevelX.modid, "models/toolAltar.obj"))
  private val altarTexture = new ResourceLocation(LevelX.modid, "models/toolAltar.png")

  def renderTileEntityAt(tileEntity :TileEntity, x :Double, y :Double, z :Double, f :Float) {
    GL11.glPushMatrix()
    GL11.glTranslated(x, y, z)
    Minecraft.getMinecraft.renderEngine.bindTexture(altarTexture)
    FMLLog.getLogger.info("Rendering tile entity.")
    toolAltar.renderAll()
    GL11.glPopMatrix()
  }

}
