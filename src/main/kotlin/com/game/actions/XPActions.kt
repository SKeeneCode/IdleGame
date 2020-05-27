package com.game.actions

import pl.treksoft.kvision.redux.RAction

sealed class XPActions : RAction {
    data class IncrementBy(val amount: Double) : XPActions()
}