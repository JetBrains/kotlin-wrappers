// Automatically generated - do not modify!

package gamepad

import web.events.EventType
import org.w3c.dom.events.Event as GamepadEvent

inline val GamepadEvent.Companion.GAMEPAD_CONNECTED: EventType<GamepadEvent>
    get() = EventType("gamepadconnected")

inline val GamepadEvent.Companion.GAMEPAD_DISCONNECTED: EventType<GamepadEvent>
    get() = EventType("gamepaddisconnected")
