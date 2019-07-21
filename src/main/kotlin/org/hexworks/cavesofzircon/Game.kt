package org.hexworks.cavesofzircon

import org.hexworks.zircon.api.data.impl.Size3D

class Game(val world: World, val player: GameEntity<Player>) {

    companion object {

        fun create(player: GameEntity<Player>, world: World) = Game(
                world = world,
                player=player
        )
    }
}