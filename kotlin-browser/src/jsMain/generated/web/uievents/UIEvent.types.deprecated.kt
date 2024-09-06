// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class UIEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("UIEvent.ABORT"),
    )
    @JsValue("abort")
    fun abort(): EventType<UIEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("UIEvent.RESIZE"),
    )
    @JsValue("resize")
    fun resize(): EventType<UIEvent>
}
