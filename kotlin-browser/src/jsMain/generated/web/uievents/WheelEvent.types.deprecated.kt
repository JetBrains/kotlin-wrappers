// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface WheelEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("WheelEvent.wheel()"),
    )
    @JsValue("wheel")
    val WHEEL: EventType<WheelEvent<EventTarget>>
        get() = definedExternally
}
