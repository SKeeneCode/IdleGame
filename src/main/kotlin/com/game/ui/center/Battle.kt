package com.game.ui.center

import pl.treksoft.kvision.panel.HPanel

class Battle : HPanel(classes = setOf("battle")) {
    init {
        add(BattleDisplay(), classes = setOf("battleDisplay"))
        add(BattleLocations())
    }
}