package com.calv.levelx.proxys

import cpw.mods.fml.client.registry.ClientRegistry
import com.calv.levelx.renderers.RendererToolAltar
import com.calv.levelx.tileentitys.TileEntityToolAltar
import cpw.mods.fml.relauncher.{Side, SideOnly}

/**
 * Created by Calv on 08/06/14.
 */
class ClientProxy extends CommonProxy{

  this.registerTESR

  @SideOnly(Side.CLIENT)
  def registerTESR {
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileEntityToolAltar], new RendererToolAltar)
  }

}
