package com.game.reducers

import com.game.model.Player

fun playerReducer(player: Player, action: Any): Player = Player(
        name = player.name,
        level = player.level,
        xp = xpReducer(player.xp, action),
        nextLevel = player.nextLevel,
        life = lifeReducer(player.life, player.maxLife, action),
        lifeRegen = player.lifeRegen,
        maxLife = player.maxLife,
        stamina = staminaReducer(player.stamina, player.maxStamina, action),
        staminaRegen = player.staminaRegen,
        maxStamina = player.maxStamina,
        attackSpeed = player.attackSpeed,
        attackBar = attackBarReducer(player.attackBar, player.attackBarMax, action),
        attackBarMax = player.attackBarMax,
        canAttack = player.canAttack,
        weapon = player.weapon
)