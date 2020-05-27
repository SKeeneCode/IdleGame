package com.game.reducers

import com.game.model.Monster

fun monsterReducer(monster: Monster, action: Any): Monster = Monster(
        name = monster.name,
        type = monster.type,
        xp = monster.xp,
        life = lifeReducer(monster.life, monster.maxLife, action),
        lifeRegen = monster.lifeRegen,
        maxLife = monster.maxLife,
        stamina = monster.stamina,
        staminaRegen = monster.staminaRegen,
        maxStamina = monster.maxStamina,
        attackSpeed = monster.attackSpeed,
        attackBar = monster.attackBar,
        attackBarMax = monster.attackBarMax,
        canAttack = monster.canAttack,
        weapon = monster.weapon
)