package com.game.actions

import pl.treksoft.kvision.redux.RAction

sealed class AttackActions : RAction {
    data class CanAttack(val canAttack: Boolean) : AttackActions()
}