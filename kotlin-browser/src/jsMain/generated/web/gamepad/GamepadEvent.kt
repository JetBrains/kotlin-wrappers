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

/**
 * This Gamepad API interface contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent)
 */
open external class GamepadEvent(
    override val type: EventType<GamepadEvent>,
    init: GamepadEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/gamepad) */
    val gamepad: Gamepad

    companion object
}
