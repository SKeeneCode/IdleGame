package com.game.reducers

import com.game.actions.XPActions

fun xpReducer(xp: Double, action: Any) = when (action) {
    is XPActions.IncrementBy -> {
        xp + action.amount
    }
    else -> xp
}