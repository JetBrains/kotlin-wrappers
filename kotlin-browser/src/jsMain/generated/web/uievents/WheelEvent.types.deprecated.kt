// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class WheelEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("WheelEvent.WHEEL"),
    )
    @JsValue("wheel")
    fun wheel(): EventType<WheelEvent>
}
