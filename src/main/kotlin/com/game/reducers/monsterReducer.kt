package com.game.reducers

import com.game.actions.MonsterActions
import com.game.model.Monster
import com.game.model.MonsterType
import com.game.ui.factories.MonsterFactory

fun monsterReducer(monster: Monster, action: Any) = when (action) {
    is MonsterActions.NewMonster -> MonsterFactory.createMonster(MonsterType.SLIME)
    else -> Monster(
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
}