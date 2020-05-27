package com.game.model

data class Weapon(
        val name: String,
        val damageType: DamageType,
        val damageAmount: Double
//        val modifiers: MutableSet<StatModifier>,
//        val skills: MutableSet<WeaponSkill>
)

enum class WeaponName {
    BARE_FISTS,
    WOODEN_SWORD,
    WOODEN_SPEAR
}

enum class DamageType {
    PHYSICAL,
    MAGIC,
    FIRE,
    WATER,
    EARTH,
    WIND
}