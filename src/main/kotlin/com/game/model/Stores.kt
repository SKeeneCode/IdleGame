package com.game.model

import com.game.reducers.monsterReducer
import com.game.reducers.playerReducer
import com.game.ui.factories.MonsterFactory
import pl.treksoft.kvision.redux.createReduxStore

val playerStore = createReduxStore(::playerReducer, Player())
val monsterStore = createReduxStore(::monsterReducer, MonsterFactory.createMonster(MonsterType.SLIME))