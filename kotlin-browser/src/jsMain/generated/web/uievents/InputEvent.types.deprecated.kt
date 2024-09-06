// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class InputEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("InputEvent.BEFORE_INPUT"),
    )
    @JsValue("beforeinput")
    fun beforeInput(): EventType<InputEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("InputEvent.INPUT"),
    )
    @JsValue("input")
    fun input(): EventType<InputEvent>
}
