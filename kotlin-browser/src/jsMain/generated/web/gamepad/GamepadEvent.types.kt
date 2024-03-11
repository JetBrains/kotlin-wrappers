// Automatically generated - do not modify!

package web.gamepad

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class GamepadEventTypes {

    @JsValue("gamepadconnected")
    fun <C : EventTarget> gamepadConnected(): EventType<GamepadEvent<C>>

    @JsValue("gamepaddisconnected")
    fun <C : EventTarget> gamepadDisconnected(): EventType<GamepadEvent<C>>
}
