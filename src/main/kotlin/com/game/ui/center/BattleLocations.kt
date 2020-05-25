package com.game.ui.center

import pl.treksoft.kvision.html.button
import pl.treksoft.kvision.html.h2
import pl.treksoft.kvision.panel.FlexAlignItems
import pl.treksoft.kvision.panel.VPanel

class BattleLocations : VPanel(spacing = 12, alignItems = FlexAlignItems.CENTER, classes = setOf("battleLocations")) {
    init {
        h2("Locations")
        button("Forest")
        button("Red Lake")
        button("Evil Mine")
    }
}