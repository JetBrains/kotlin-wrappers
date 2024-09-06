// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class KeyboardEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("KeyboardEvent.KEY_DOWN"),
    )
    @JsValue("keydown")
    fun keyDown(): EventType<KeyboardEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("KeyboardEvent.KEY_PRESS"),
    )
    @JsValue("keypress")
    fun keyPress(): EventType<KeyboardEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("KeyboardEvent.KEY_UP"),
    )
    @JsValue("keyup")
    fun keyUp(): EventType<KeyboardEvent>
}
