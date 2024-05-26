// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.gamepad

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * This Gamepad API interface contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent)
 */
open external class GamepadEvent(
    override val type: EventType<GamepadEvent, EventTarget>,
    init: GamepadEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/gamepad)
     */
    val gamepad: Gamepad

    @JsAlias(THIS)
    override fun asInit(): GamepadEventInit

    companion object : GamepadEventTypes
}
