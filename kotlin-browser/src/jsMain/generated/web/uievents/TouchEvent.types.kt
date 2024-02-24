// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface TouchEventTypes {
    @JsValue("touchcancel")
    val TOUCH_CANCEL: EventType<TouchEvent<*>>
        get() = definedExternally

    @JsValue("touchend")
    val TOUCH_END: EventType<TouchEvent<*>>
        get() = definedExternally

    @JsValue("touchmove")
    val TOUCH_MOVE: EventType<TouchEvent<*>>
        get() = definedExternally

    @JsValue("touchstart")
    val TOUCH_START: EventType<TouchEvent<*>>
        get() = definedExternally
}
