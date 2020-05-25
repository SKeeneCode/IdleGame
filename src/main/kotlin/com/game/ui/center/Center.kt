package com.game.ui.center

import pl.treksoft.kvision.panel.StackPanel

class Center : StackPanel(classes = setOf("center")) {
    init {
        add(Battle())
    }
}