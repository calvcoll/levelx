package com.calv.levelx.proxys

import cpw.mods.fml.client.registry.ClientRegistry
import com.calv.levelx.renderers.RendererToolAltar
import com.calv.levelx.tileentitys.TileEntityToolAltar

/**
 * Created by Calv on 08/06/14.
 */
class ClientProxy extends CommonProxy{

  def registerTESR {
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileEntityToolAltar], new RendererToolAltar)
  }

}
