// Automatically generated - do not modify!

package web.gamepad

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/gamepad)
     */
    val gamepad: Gamepad

    @JsAlias(THIS)
    override fun asInit(): GamepadEventInit

    companion object {
        @JsValue("gamepadconnected")
        val GAMEPAD_CONNECTED: EventType<GamepadEvent>

        @JsValue("gamepaddisconnected")
        val GAMEPAD_DISCONNECTED: EventType<GamepadEvent>
    }
}
