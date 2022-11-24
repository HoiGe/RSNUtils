package com.hoige.rsn

import com.hoige.rsn.command.CommandBase
import net.fabricmc.api.ModInitializer
import net.minecraft.server.command.CommandManager.*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Suppress("UNUSED")
object Server: ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("RSN-Server")
    private const val server = "rsn_server"
    override fun onInitialize() {
        CommandBase()
        LOGGER.info("RSN-Server Is Loaded!");
    }
}