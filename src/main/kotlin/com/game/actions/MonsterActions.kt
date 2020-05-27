package com.game.actions

import pl.treksoft.kvision.redux.RAction

sealed class MonsterActions : RAction {
    object NewMonster : MonsterActions()
}