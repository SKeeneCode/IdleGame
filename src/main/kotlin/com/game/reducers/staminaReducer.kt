package com.game.reducers

import com.game.actions.StaminaActions

fun staminaReducer(stamina: Double, maxStamina: Double, action: Any) = when (action) {
    is StaminaActions.IncrementBy -> {
        var newStamina = stamina + action.amount
        if (newStamina > maxStamina) newStamina = maxStamina
        newStamina
    }
    is StaminaActions.DecrementBy -> {
        stamina - action.amount
    }
    else -> stamina
}
