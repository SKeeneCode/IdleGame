package com.game.ui.header

import pl.treksoft.kvision.core.CssSize
import pl.treksoft.kvision.core.UNIT
import pl.treksoft.kvision.html.div
import pl.treksoft.kvision.panel.FlexJustify
import pl.treksoft.kvision.panel.HPanel
import pl.treksoft.kvision.panel.vPanel
import pl.treksoft.kvision.utils.px

class Header : HPanel(classes = setOf("header"), spacing = 12) {
    init {

        div("LEVEL", className = "logo")

        vPanel(justify = FlexJustify.CENTER, spacing = 12) {

            // player life bar
            div(classes = setOf("progress", "m-1")) {
                width = 300.px
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-danger")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Life Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }
            // player stamina bar
            div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Stamina Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }

            // player experience bar
            div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-warning")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Experience Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }
        }
    }
}