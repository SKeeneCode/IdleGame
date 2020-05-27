package com.game.ui.factories

import com.game.model.DamageType
import com.game.model.Weapon
import com.game.model.WeaponName

class WeaponFactory {
    companion object {
        fun createWeapon(name: WeaponName): Weapon = when (name) {
            WeaponName.BARE_FISTS -> Weapon("Bare Fists", DamageType.PHYSICAL, 6.0)
            WeaponName.WOODEN_SWORD -> Weapon("Wooden Sword", DamageType.PHYSICAL, 10.0)
            WeaponName.WOODEN_SPEAR -> Weapon("Wooden Spear", DamageType.PHYSICAL, 12.0)
        }
    }
}