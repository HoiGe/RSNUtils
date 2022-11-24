package com.hoige.rsn.command

import net.silkmc.silk.commands.command
import net.silkmc.silk.core.text.sendText
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CommandBase {
    private val logger: Logger = LoggerFactory.getLogger("RSN-Server")
    val link = command("link"){
        argument("code") { code ->
            runs {
                if (source.isExecutedByPlayer) Link().linkTo(code, source) else report()
            }
        }
    }
    val unlink = command("unlink"){
        runs {
            if (source.isExecutedByPlayer) source.player?.sendText("Hello") else report()
        }
        argument<String>("qid") {
            runs {
                if (source.isExecutedByPlayer) source.player?.sendText("Hello") else report()
            }
        }
    }
    private fun report(){
        logger.info("[RSN-CMD]只有玩家才能使用这个指令")
    }
}