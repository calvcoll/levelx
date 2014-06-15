package com.calv.levelx.renderers

import net.minecraft.client.renderer.tileentity.{TileEntityRendererDispatcher, TileEntitySpecialRenderer}
import net.minecraft.util.ResourceLocation
import com.calv.levelx.LevelX
import net.minecraft.tileentity.TileEntity
import org.lwjgl.opengl.GL11
import net.minecraft.client.Minecraft
import net.minecraftforge.client.model.{IModelCustom, AdvancedModelLoader}
import com.calv.levelx.tileentitys.TileEntityToolAltar
import net.minecraft.block.Block
import net.minecraft.client.renderer.RenderBlocks
import net.minecraft.world.IBlockAccess
import com.calv.levelx.helpers.{LevelXTileEntityRenderer, LevelXRenderIDs}

/**
 * Created by Calv on 08/06/14.
 */
class RendererToolAltar extends LevelXTileEntityRenderer {

  private val toolAltar :IModelCustom = AdvancedModelLoader.loadModel(new ResourceLocation(LevelX.modRegisterName, "models/toolAltar.obj"))
  private val altarBottom = new ResourceLocation(LevelX.modRegisterName, "textures/models/toolAltar/toolAltarBottom.png")
  private val altarPole = new ResourceLocation(LevelX.modRegisterName, "textures/models/toolAltar/toolAltarPole.png")
  private val altarTop = new ResourceLocation(LevelX.modRegisterName, "textures/models/toolAltar/toolAltarTop.png")
  private val altarTopSide = new ResourceLocation(LevelX.modRegisterName, "textures/models/toolAltar/toolAltarTopSide.png")

  def renderTileEntityAt(tileEntity :TileEntity, x :Double, y :Double, z :Double, f :Float) {
    GL11.glPushMatrix()
    GL11.glTranslated(x, y, z)
    renderTileEntity()
    GL11.glPopMatrix()
  }

  override def renderInventoryBlock(block: Block, metadata: Int, modelId: Int, renderer: RenderBlocks) = {
    TileEntityRendererDispatcher.instance.renderTileEntity(new TileEntityToolAltar(), 0F)
  }

  override def getRenderId: Int = LevelXRenderIDs.altarID

  override def shouldRender3DInInventory(modelId: Int): Boolean = true

  override def renderWorldBlock(world: IBlockAccess, x: Int, y: Int, z: Int, block: Block, modelId: Int, renderer: RenderBlocks): Boolean = false

  override def renderTileEntity(): Unit = {
    Minecraft.getMinecraft.renderEngine.bindTexture(altarBottom)
    toolAltar.renderPart("AltarBottom")
    Minecraft.getMinecraft.renderEngine.bindTexture(altarPole)
    toolAltar.renderPart("AltarPole")
    //    Looks close enough, and works.
    toolAltar.renderPart("AltarTopBottom")
    Minecraft.getMinecraft.renderEngine.bindTexture(altarTop)
    toolAltar.renderPart("AltarTop")
    Minecraft.getMinecraft.renderEngine.bindTexture(altarTopSide)
    toolAltar.renderPart("AltarTopDrape")
  }
}
