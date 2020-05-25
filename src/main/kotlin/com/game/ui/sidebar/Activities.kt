package com.game.ui.sidebar

import pl.treksoft.kvision.html.button
import pl.treksoft.kvision.panel.FlexAlignItems
import pl.treksoft.kvision.panel.VPanel

class Activities : VPanel(spacing = 12, alignItems = FlexAlignItems.CENTER) {
    init {
        button("Battle")
        button("Fishing")
        button("Farming")
        button("Mining")
    }
}