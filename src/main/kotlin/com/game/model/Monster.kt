package com.game.model

data class Monster(
        val name: String,
        val type: MonsterType,
        val xp: Double,
        val life: Double,
        val lifeRegen: Double,
        val maxLife: Double,
        val stamina: Double,
        val staminaRegen: Double,
        val maxStamina: Double,
        val attackSpeed: Double,
        val attackBar: Double,
        val attackBarMax: Double,
        val canAttack: Boolean,
        val weapon: Weapon
)

enum class MonsterType {
    SLIME
}