package org.hexworks.cavesofzircon

import org.hexworks.amethyst.api.entity.Entity
import org.hexworks.amethyst.api.entity.EntityType

typealias AnyGameEntity = Entity<EntityType, GameContext>

typealias GameEntity<T> = Entity<T, GameContext>