package com.game.ui.center

import com.game.model.monsterStore
import com.game.model.playerStore
import pl.treksoft.kvision.core.CssSize
import pl.treksoft.kvision.core.UNIT
import pl.treksoft.kvision.html.Align
import pl.treksoft.kvision.html.Div
import pl.treksoft.kvision.html.H1
import pl.treksoft.kvision.html.div
import pl.treksoft.kvision.panel.ResponsiveGridPanel
import pl.treksoft.kvision.state.bind

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
                div(classes = setOf("progress-bar-no-animation", "progress-bar-striped", "bg-info", "barText")) {
                    bind(playerStore) { player ->
                        role = "progressbar"
                        setAttribute("aria-valuenow", player.attackBar.toString())
                        setAttribute("aria-valuemin", "0")
                        setAttribute("aria-valuemax", player.attackBarMax.toString())
                        content = "Attack: ${player.attackBar} / ${player.attackBarMax}"
                        width = CssSize((player.attackBar * 100) / player.attackBarMax, UNIT.perc)
                    }
                }
            }

    private fun monsterAttackBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar-no-animation", "progress-bar-striped", "bg-info", "barText")) {
                    bind(playerStore) { monster ->
                        role = "progressbar"
                        setAttribute("aria-valuenow", monster.attackBar.toString())
                        setAttribute("aria-valuemin", "0")
                        setAttribute("aria-valuemax", monster.attackBarMax.toString())
                        content = "Attack: ${monster.attackBar} / ${monster.attackBarMax}"
                        width = CssSize((monster.attackBar * 100) / monster.attackBarMax, UNIT.perc)
                    }
                }
            }

    // ---- LIFE BARS ---- //
    private fun playerLifeBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-danger", "barText")) {
                    bind(playerStore) { player ->
                        role = "progressbar"
                        setAttribute("aria-valuenow", player.life.toString())
                        setAttribute("aria-valuemin", "0")
                        setAttribute("aria-valuemax", player.maxLife.toString())
                        content = "Life: ${player.life} / ${player.maxLife}"
                        width = CssSize((player.life * 100) / player.maxLife, UNIT.perc)
                    }
                }
            }

    private fun monsterLifeBar() =
            Div(classes = setOf("progress", "m-1")) {
                div(classes = setOf("progress-bar", "progress-bar-striped", "bg-danger", "barText")) {
                    bind(monsterStore) { monster ->
                        role = "progressbar"
                        setAttribute("aria-valuenow", monster.life.toString())
                        setAttribute("aria-valuemin", "0")
                        setAttribute("aria-valuemax", monster.maxLife.toString())
                        content = "Life: ${monster.life} / ${monster.maxLife}"
                        width = CssSize((monster.life * 100) / monster.maxLife, UNIT.perc)
                    }
                }
            }

    // ---- PORTRAITS ---- //
    private fun portrait() =
            Div(classes = setOf("portrait", "m-2", "mx-auto"))
}