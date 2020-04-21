package com.zephaniel.novia.telegram

import com.zephaniel.novia.properties.BotProperties
import org.springframework.stereotype.Component
import org.telegram.abilitybots.api.bot.AbilityBot

@Component
class NoviaBot(private val botProperties: BotProperties)
    : AbilityBot(botProperties.token, botProperties.username) {

    override fun creatorId(): Int {
        return botProperties.creatorId
    }
}