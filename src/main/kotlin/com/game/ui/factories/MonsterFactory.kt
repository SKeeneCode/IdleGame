package com.game.ui.factories

import com.game.model.DamageType
import com.game.model.Monster
import com.game.model.MonsterType
import com.game.model.Weapon

class MonsterFactory {
    companion object {
        fun createMonster(type: MonsterType): Monster = when (type) {
            MonsterType.SLIME -> Monster(
                    "Slime",
                    MonsterType.SLIME,
                    10.0,
                    20.0,
                    0.0,
                    20.0,
                    10.0,
                    0.0,
                    10.0,
                    0.5,
                    0.0,
                    100.0,
                    false,
                    Weapon(
                            "Sticky Goo",
                            DamageType.PHYSICAL,
                            4.0
                    )
            )
        }
    }
}