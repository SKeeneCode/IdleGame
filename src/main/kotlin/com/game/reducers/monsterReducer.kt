package com.game.reducers

import com.game.model.Monster

fun monsterReducer(monster: Monster, action: Any): Monster = Monster(
        name = monster.name,
        type = monster.type,
        xp = monster.xp,
        life = lifeReducer(monster.life, monster.maxLife, action),
        lifeRegen = monster.lifeRegen,
        maxLife = monster.maxLife,
        stamina = staminaReducer(monster.stamina, monster.maxStamina, action),
        staminaRegen = monster.staminaRegen,
        maxStamina = monster.maxStamina,
        attackSpeed = monster.attackSpeed,
        attackBar = attackBarReducer(monster.attackBar, monster.attackBarMax, action),
        attackBarMax = monster.attackBarMax,
        canAttack = attackReducer(monster.canAttack, action),
        weapon = monster.weapon
)