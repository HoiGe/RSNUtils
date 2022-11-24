package com.hoige.rsn.command

import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.*
import net.minecraft.util.Formatting
import net.silkmc.silk.commands.ArgumentResolver
import java.util.*

class Link {
    fun linkTo(code: ArgumentResolver<ServerCommandSource, String>, source: ServerCommandSource) {
        val string = UUID.randomUUID().toString()
        val text = Text.literal(string).setStyle(
            Style.EMPTY.withColor(Formatting.GREEN)
                .withHoverEvent(HoverEvent(HoverEvent.Action.SHOW_TEXT, Text.literal("点击复制")))
                .withClickEvent(
                    ClickEvent(ClickEvent.Action.COPY_TO_CLIPBOARD, string)
                )
        )
        source.sendFeedback(Text.literal("你的Token是：[").append(text).append("]"), false)
        source.sendFeedback(Text.literal("有效期5分钟，请及时输入。"), false)
    }

}
