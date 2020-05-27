package com.game.reducers

import com.game.actions.AttackActions

fun attackReducer(canAttack: Boolean, action: Any) = when (action) {
    is AttackActions.CanAttack -> action.canAttack
    else -> canAttack
}