package com.zephaniel.novia.telegram.utils

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton
import java.util.*

class InlineKeyboardHelper private constructor() {

    class Builder {

        private val markup: InlineKeyboardMarkup = InlineKeyboardMarkup()
        private val rows: MutableList<InlineKeyboardButton> = ArrayList()
        private val columns: MutableList<MutableList<InlineKeyboardButton>> = ArrayList()

        fun addButton(vararg buttons: InlineKeyboardButton): Builder {
            if (buttons.isNotEmpty()) {
                rows.addAll(buttons)
            }
            return this
        }

        fun nextLine(): Builder {
            columns.add(ArrayList(rows))
            rows.clear()
            return this
        }

        fun build(): InlineKeyboardMarkup {
            if (rows.isNotEmpty()) {
                columns.add(ArrayList(rows))
                rows.clear()
            }

            markup.keyboard = columns
            return markup
        }
    }
}