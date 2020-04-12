package com.zephaniel.novia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NoviaApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<NoviaApplication>(*args)
        }
    }
}
