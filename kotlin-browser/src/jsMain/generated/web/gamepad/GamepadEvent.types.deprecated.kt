// Automatically generated - do not modify!

package web.gamepad

import seskar.js.JsValue
import web.events.EventType

sealed external class GamepadEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("GamepadEvent.GAMEPAD_CONNECTED"),
    )
    @JsValue("gamepadconnected")
    fun gamepadConnected(): EventType<GamepadEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("GamepadEvent.GAMEPAD_DISCONNECTED"),
    )
    @JsValue("gamepaddisconnected")
    fun gamepadDisconnected(): EventType<GamepadEvent>
}
