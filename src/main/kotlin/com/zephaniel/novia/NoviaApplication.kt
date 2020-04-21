package com.zephaniel.novia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.telegram.telegrambots.ApiContextInitializer
import javax.annotation.PostConstruct

@SpringBootApplication
class NoviaApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<NoviaApplication>(*args)
        }
    }

    @PostConstruct
    fun initTelegramBot() {
        ApiContextInitializer.init()
    }

}
