// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class TouchEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TouchEvent.TOUCH_CANCEL"),
    )
    @JsValue("touchcancel")
    fun touchCancel(): EventType<TouchEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TouchEvent.TOUCH_END"),
    )
    @JsValue("touchend")
    fun touchEnd(): EventType<TouchEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TouchEvent.TOUCH_MOVE"),
    )
    @JsValue("touchmove")
    fun touchMove(): EventType<TouchEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TouchEvent.TOUCH_START"),
    )
    @JsValue("touchstart")
    fun touchStart(): EventType<TouchEvent>
}
