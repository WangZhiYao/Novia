package com.zephaniel.novia.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import kotlin.properties.Delegates

@Configuration
@PropertySource("classpath:telegram.properties")
@ConfigurationProperties("bot")
class BotProperties {

    lateinit var token: String
    lateinit var username: String
    var creatorId by Delegates.notNull<Int>()
}