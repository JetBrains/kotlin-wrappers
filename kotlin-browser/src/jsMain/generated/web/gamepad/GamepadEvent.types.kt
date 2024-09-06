// Automatically generated - do not modify!

package web.gamepad

import seskar.js.JsValue
import web.events.EventType

sealed external class GamepadEventTypes :
    GamepadEventTypes_deprecated {

    @JsValue("gamepadconnected")
    val GAMEPAD_CONNECTED: EventType<GamepadEvent>

    @JsValue("gamepaddisconnected")
    val GAMEPAD_DISCONNECTED: EventType<GamepadEvent>
}
