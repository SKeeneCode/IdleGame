package com.game.ui.sidebar

import pl.treksoft.kvision.panel.TabPanel

class Sidebar : TabPanel(classes = setOf("sidebar")) {
    init {
        addTab("Activities", Activities())
        addTab("Skills", Skills())
    }
}