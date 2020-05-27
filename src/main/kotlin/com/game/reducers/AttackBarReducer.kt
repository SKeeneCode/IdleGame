package com.game.reducers

import com.game.actions.AttackBarActions

fun attackBarReducer(attackBar: Double, barSize: Double, action: Any) = when (action) {
    is AttackBarActions.IncrementBy -> {
        var newAttackBar = attackBar + action.amount
        if (newAttackBar > barSize) newAttackBar = barSize
        newAttackBar
    }
    is AttackBarActions.DecrementBy -> {
        attackBar - action.amount
    }
    else -> attackBar
}
