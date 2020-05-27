package com.game.reducers

import com.game.model.Player

fun playerReducer(player: Player, action: Any): Player = Player(
        name = player.name,
        level = player.level,
        xp = player.xp,
        life = lifeReducer(player.life, player.maxLife, action),
        lifeRegen = player.lifeRegen,
        maxLife = player.maxLife,
        stamina = player.stamina,
        staminaRegen = player.staminaRegen,
        maxStamina = player.maxStamina,
        attackSpeed = player.attackSpeed,
        attackBar = player.attackBar,
        attackBarMax = player.attackBarMax,
        canAttack = player.canAttack,
        weapon = player.weapon
)