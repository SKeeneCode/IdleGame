package com.game

import com.game.actions.*
import com.game.model.monsterStore
import com.game.model.playerStore
import com.game.ui.center.Center
import com.game.ui.footer.Footer
import com.game.ui.header.Header
import com.game.ui.sidebar.Sidebar
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import pl.treksoft.kvision.Application
import pl.treksoft.kvision.core.CssSize
import pl.treksoft.kvision.core.UNIT
import pl.treksoft.kvision.i18n.DefaultI18nManager
import pl.treksoft.kvision.i18n.I18n
import pl.treksoft.kvision.panel.Side
import pl.treksoft.kvision.panel.dockPanel
import pl.treksoft.kvision.panel.root
import pl.treksoft.kvision.require
import pl.treksoft.kvision.startApplication

class App : Application() {
    init {
        require("css/kvapp.css")
        require("css/bootstrap.css")
    }

    override fun start() {
        I18n.manager =
                DefaultI18nManager(
                        mapOf(
                                "pl" to require("i18n/messages-pl.json"),
                                "en" to require("i18n/messages-en.json")
                        )
                )

        root("kvapp") {
            addCssClass("root")
            dockPanel {
                width = CssSize(100, UNIT.perc)
                height = CssSize(800, UNIT.px)
                add(Header(), Side.UP)
                add(Center(), Side.CENTER)
                add(Sidebar(), Side.LEFT)
                add(Footer(), Side.DOWN)
            }
        }

        // player attack
        playerStore.subscribe { player ->
            if (player.attackBar >= player.attackBarMax) {
                playerStore.dispatch(AttackBarActions.Reset)
                playerStore.dispatch(AttackActions.CanAttack(true))
            }
        }
        playerStore.subscribe { player ->
            if (player.canAttack) {
                playerStore.dispatch(AttackActions.CanAttack(false))
                monsterStore.dispatch(LifeActions.DecrementBy(player.weapon.damageAmount))
            }
        }

        // monster attack
        monsterStore.subscribe { monster ->
            if (monster.attackBar >= monster.attackBarMax) {
                monsterStore.dispatch(AttackBarActions.Reset)
                monsterStore.dispatch(AttackActions.CanAttack(true))
            }
        }
        monsterStore.subscribe { monster ->
            if (monster.canAttack) {
                monsterStore.dispatch(AttackActions.CanAttack(false))
                playerStore.dispatch(LifeActions.DecrementBy(monster.weapon.damageAmount))
            }
        }
        // monster death
        monsterStore.subscribe { monster ->
            if (monster.life <= 0) monsterStore.dispatch(MonsterActions.NewMonster)
        }

        GlobalScope.launch {
            while (true) {
                val player = playerStore.getState()
                val monster = monsterStore.getState()
                playerStore.dispatch(LifeActions.IncrementBy(player.lifeRegen))
                monsterStore.dispatch(LifeActions.IncrementBy(monster.lifeRegen))
                playerStore.dispatch(StaminaActions.IncrementBy(player.staminaRegen))
                monsterStore.dispatch(StaminaActions.IncrementBy(monster.staminaRegen))
                delay(1000)
            }
        }

        GlobalScope.launch {
            while (true) {
                val player = playerStore.getState()
                val monster = monsterStore.getState()
                playerStore.dispatch(AttackBarActions.IncrementBy(player.attackSpeed))
                monsterStore.dispatch(AttackBarActions.IncrementBy(monster.attackSpeed))
                delay(1000 / 60)
            }
        }
    }
}

fun main() {
    startApplication(::App)
}
