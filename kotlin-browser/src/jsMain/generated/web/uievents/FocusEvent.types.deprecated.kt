// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class FocusEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FocusEvent.BLUR"),
    )
    @JsValue("blur")
    fun blur(): EventType<FocusEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FocusEvent.FOCUS"),
    )
    @JsValue("focus")
    fun focus(): EventType<FocusEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FocusEvent.FOCUS_IN"),
    )
    @JsValue("focusin")
    fun focusIn(): EventType<FocusEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FocusEvent.FOCUS_OUT"),
    )
    @JsValue("focusout")
    fun focusOut(): EventType<FocusEvent>
}
