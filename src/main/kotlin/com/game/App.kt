package com.game

import com.game.ui.center.Center
import com.game.ui.footer.Footer
import com.game.ui.header.Header
import com.game.ui.sidebar.Sidebar
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
    }
}

fun main() {
    startApplication(::App)
}