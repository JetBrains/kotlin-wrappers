// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.gamepad

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface GamepadEventInit : EventInit {
    var gamepad: Gamepad
}

open external class GamepadEvent(
    override val type: EventType<GamepadEvent>,
    init: GamepadEventInit,
) : Event {
    val gamepad: Gamepad

    companion object
}
