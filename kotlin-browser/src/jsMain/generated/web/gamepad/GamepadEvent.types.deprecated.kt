// Automatically generated - do not modify!

package web.gamepad

import seskar.js.JsValue
import web.events.EventType

sealed external class GamepadEventTypes {

    @JsValue("gamepadconnected")
    fun gamepadConnected(): EventType<GamepadEvent>

    @JsValue("gamepaddisconnected")
    fun gamepadDisconnected(): EventType<GamepadEvent>
}
