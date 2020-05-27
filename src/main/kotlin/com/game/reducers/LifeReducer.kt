package com.game.reducers

import com.game.actions.LifeActions

fun lifeReducer(life: Double, maxLife: Double, action: Any) = when (action) {
    is LifeActions.IncrementBy -> {
        var newLife = life + action.amount
        if (newLife > maxLife) newLife = maxLife
        newLife
    }
    is LifeActions.DecrementBy -> {
        life - action.amount
    }
    else -> life
}