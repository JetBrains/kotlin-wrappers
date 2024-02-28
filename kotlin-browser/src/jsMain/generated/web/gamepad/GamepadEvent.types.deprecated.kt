// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gamepad

import seskar.js.JsValue
import web.events.EventType

sealed external interface GamepadEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("GamepadEvent.gamepadConnected()"),
    )
    @JsValue("gamepadconnected")
    val GAMEPAD_CONNECTED: EventType<GamepadEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("GamepadEvent.gamepadDisconnected()"),
    )
    @JsValue("gamepaddisconnected")
    val GAMEPAD_DISCONNECTED: EventType<GamepadEvent<*>>
        get() = definedExternally
}
