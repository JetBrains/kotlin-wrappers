// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface TouchEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TouchEvent.touchCancel()"),
    )
    @JsValue("touchcancel")
    val TOUCH_CANCEL: EventType<TouchEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TouchEvent.touchEnd()"),
    )
    @JsValue("touchend")
    val TOUCH_END: EventType<TouchEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TouchEvent.touchMove()"),
    )
    @JsValue("touchmove")
    val TOUCH_MOVE: EventType<TouchEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TouchEvent.touchStart()"),
    )
    @JsValue("touchstart")
    val TOUCH_START: EventType<TouchEvent<*>>
        get() = definedExternally
}
