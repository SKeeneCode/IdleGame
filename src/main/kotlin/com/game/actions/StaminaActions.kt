package com.game.actions

import pl.treksoft.kvision.redux.RAction

sealed class StaminaActions : RAction {
    data class IncrementBy(val amount: Double) : StaminaActions()
    data class DecrementBy(val amount: Double) : StaminaActions()
}