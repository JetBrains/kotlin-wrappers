// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import web.events.Event
import web.events.EventInit

external interface GamepadEventInit : EventInit {
    var gamepad: Gamepad
}

open external class GamepadEvent(
    type: String,
    init: GamepadEventInit,
) : Event {
    val gamepad: Gamepad

    companion object
}
