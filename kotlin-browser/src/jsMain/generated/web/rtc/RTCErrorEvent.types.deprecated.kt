// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external interface RTCErrorEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("RTCErrorEvent.error()"),
    )
    @JsValue("error")
    val ERROR: EventType<RTCErrorEvent<*>>
        get() = definedExternally
}
