package com.calv.levelx.helpers

import net.minecraft.world.IBlockAccess
import net.minecraft.block.Block
import net.minecraft.client.renderer.RenderBlocks
import net.minecraft.tileentity.TileEntity
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
import com.calv.levelx.tileentitys.TileEntityToolAltar

/**
 * Created by calv on 03/07/14.
 */
abstract class LevelXTileEntityModelRenderer extends LevelXTileEntityRenderer {

  override def shouldRender3DInInventory(modelId: Int): Boolean = true

  override def renderWorldBlock(world: IBlockAccess, x: Int, y: Int, z: Int, block: Block, modelId: Int, renderer: RenderBlocks): Boolean = false

}
