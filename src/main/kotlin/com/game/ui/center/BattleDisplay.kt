package com.game.ui.center

import pl.treksoft.kvision.core.CssSize
import pl.treksoft.kvision.core.UNIT
import pl.treksoft.kvision.html.Align
import pl.treksoft.kvision.html.Div
import pl.treksoft.kvision.html.H1
import pl.treksoft.kvision.html.div
import pl.treksoft.kvision.panel.ResponsiveGridPanel

class BattleDisplay : ResponsiveGridPanel(rows = 12, cols = 12, align = Align.CENTER) {
    init {
        // row 1 - title
        add(H1("Battle!!!"), 0, 1, 12)

        // row 2 - player/monster attack bars
        add(playerAttackBar(), 1, 2, 3, 1)
        add(monsterAttackBar(), 2, 2, 3, 4)

        // row 3 - player/monster life bars
        add(playerLifeBar(), 1, 3, 3, 1)
        add(monsterLifeBar(), 2, 3, 3, 4)

        // row 4 - player/monster portraits
        add(portrait(), 1, 4, 3, 1)
        add(portrait(), 2, 4, 3, 4)
    }

    // ---- ATTACK BARS ---- //
    private fun playerAttackBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-info")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Player Attack Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }

    private fun monsterAttackBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-info")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Monster Attack Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }

    // ---- LIFE BARS ---- //
    private fun playerLifeBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-danger")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Player Life Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }

    private fun monsterLifeBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-danger")) {
                    role = "progressbar"
                    setAttribute("aria-valuenow", "5")
                    setAttribute("aria-valuemin", "0")
                    setAttribute("aria-valuemax", "10")
                    content = "Monster Life Bar"
                    width = CssSize(100, UNIT.perc)
                }
            }

    // ---- PORTRAITS ---- //
    private fun portrait() =
            Div(classes = setOf("portrait", "m-2", "mx-auto"))
}