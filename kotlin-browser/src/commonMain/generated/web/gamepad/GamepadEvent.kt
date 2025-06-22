// Automatically generated - do not modify!

package web.gamepad

import js.reflect.unsafeCast
import seskar.js.JsValue
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
     * The **`GamepadEvent.gamepad`** property of the **GamepadEvent interface** returns a Gamepad object, providing access to the associated gamepad data for fired A Gamepad object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/gamepad)
     */
    val gamepad: Gamepad

    companion object {
        @JsValue("gamepadconnected")
        val GAMEPAD_CONNECTED: EventType<GamepadEvent>

        @JsValue("gamepaddisconnected")
        val GAMEPAD_DISCONNECTED: EventType<GamepadEvent>
    }
}

inline fun GamepadEvent.asInit(): GamepadEventInit =
    unsafeCast(this)
