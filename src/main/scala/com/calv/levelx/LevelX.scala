package com.calv.levelx

import cpw.mods.fml.common.{FMLLog, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}
import java.util.logging.{LogRecord, Logger}

/**
 * Created by Calv on 08/06/14.
 */

@Mod(name = LevelX.name, modid = LevelX.modid, version = LevelX.version, modLanguage = LevelX.modLanguage)
object LevelX {
  final val name = "LevelX"
  final val modid = "LevelX"
  final val version = "0.0.0"
  final val modLanguage = "scala"

  @EventHandler
  def preInit (event: FMLPreInitializationEvent) {
    FMLLog.info("Pre-initialisation of ")
  }

  @EventHandler
  def init (event: FMLInitializationEvent) {
    FMLLog.info("Initialised LevelX")
  }

  @EventHandler
  def postInit (event: FMLPostInitializationEvent) {
    FMLLog.info("Post-initialisation of LevelX")
  }
}
