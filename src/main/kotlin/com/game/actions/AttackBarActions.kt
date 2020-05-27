package com.game.actions

import pl.treksoft.kvision.redux.RAction

sealed class AttackBarActions : RAction {
        data class IncrementBy(val amount: Double) : AttackBarActions()
        data class DecrementBy(val amount: Double) : AttackBarActions()
}
