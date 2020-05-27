package com.game.model

import com.game.ui.factories.WeaponFactory

data class Player(
        val name: String = "player",
        val level: Int = 1,
        val xp: Double = 0.0,
        val nextLevel: Double = 100.0,
        val life: Double = 0.0,
        val lifeRegen: Double = 1.0,
        val maxLife: Double = 100.0,
        val stamina: Double = 25.0,
        val staminaRegen: Double = 1.0,
        val maxStamina: Double = 50.0,
        val attackSpeed: Double = 1.0,
        val attackBar: Double = 0.0,
        val attackBarMax: Double = 100.0,
        val canAttack: Boolean = false,
        val weapon: Weapon = WeaponFactory.createWeapon(WeaponName.BARE_FISTS)
)