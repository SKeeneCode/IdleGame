package com.game.ui.header

import com.game.model.playerStore
import pl.treksoft.kvision.core.CssSize
import pl.treksoft.kvision.core.Overflow
import pl.treksoft.kvision.core.TextAlign
import pl.treksoft.kvision.core.UNIT
import pl.treksoft.kvision.html.div
import pl.treksoft.kvision.panel.FlexJustify
import pl.treksoft.kvision.panel.HPanel
import pl.treksoft.kvision.panel.vPanel
import pl.treksoft.kvision.state.bind
import pl.treksoft.kvision.utils.px

class Header : HPanel(classes = setOf("header"), spacing = 12) {
    init {

        div("LEVEL", className = "logo")

        vPanel(justify = FlexJustify.CENTER, spacing = 12) {

            // player life bar
            div(classes = setOf("progress", "m-1")) {
                width = 300.px
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-danger", "barText")) {
                    bind(playerStore) { player ->
                        textAlign = TextAlign.CENTER
                        overflow = Overflow.VISIBLE
                        role = "progressbar"
                        setAttribute("aria-valuenow", player.life.toString())
                        setAttribute("aria-valuemin", "0")
                        setAttribute("aria-valuemax", player.maxLife.toString())
                        content = "Life: ${player.life} / ${player.maxLife}"
                        width = CssSize((player.life * 100) / player.maxLife, UNIT.perc)
                    }
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