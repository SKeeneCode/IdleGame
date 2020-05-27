package com.game.actions

import pl.treksoft.kvision.redux.RAction

sealed class LifeActions : RAction {
    data class IncrementBy(val amount: Double) : LifeActions()
    data class DecrementBy(val amount: Double) : LifeActions()
}