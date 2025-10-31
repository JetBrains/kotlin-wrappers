// Automatically generated - do not modify!

package web.gamepad

import web.events.Event
import web.events.EventType

/**
 * The GamepadEvent interface of the Gamepad API contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected_event and Window.gamepaddisconnected_event are fired in response to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent)
 */
open external class GamepadEvent(
    override val type: EventType<GamepadEvent>,
    init: GamepadEventInit,
) : Event {
    /**
     * The **`GamepadEvent.gamepad`** property of the **GamepadEvent interface** returns a Gamepad object, providing access to the associated gamepad data for fired Window.gamepadconnected_event and Window.gamepaddisconnected_event events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/gamepad)
     */
    val gamepad: Gamepad

    companion object
}

inline val GamepadEvent.Companion.GAMEPAD_CONNECTED: EventType<GamepadEvent>
    get() = EventType("gamepadconnected")

inline val GamepadEvent.Companion.GAMEPAD_DISCONNECTED: EventType<GamepadEvent>
    get() = EventType("gamepaddisconnected")
