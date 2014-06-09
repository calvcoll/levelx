package com.calv.levelx

import cpw.mods.fml.common.{SidedProxy, FMLLog, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{ItemStack, Item}
import com.calv.levelx.proxys.CommonProxy

/**
 * Created by Calv on 08/06/14.
 */

@Mod(name = LevelX.name, modid = LevelX.modid, version = LevelX.version, modLanguage = LevelX.modLanguage)
object LevelX {
  final val name = "LevelX"
  final val modid = "LevelX"
  final val modRegisterName = "levelx"
  final val version = "0.0.0"
  final val modLanguage = "scala"

  @SidedProxy(clientSide="com.calv.levelx.proxys.ClientProxy", serverSide="com.calv.levelx.proxys.CommonProxy")
  var proxy :CommonProxy = null

  @EventHandler
  def preInit (event: FMLPreInitializationEvent) {
    FMLLog.info("Pre-initialisation of " + this.name)
  }

  @EventHandler
  def init (event: FMLInitializationEvent) {
    FMLLog.info("Initialised " + this.name)
    var registry = new LevelXRegistry
  }

  @EventHandler
  def postInit (event: FMLPostInitializationEvent) {
    FMLLog.info("Post-initialisation of " + this.name)
  }
}
