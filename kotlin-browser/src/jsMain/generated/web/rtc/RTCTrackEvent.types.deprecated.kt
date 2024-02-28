// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external interface RTCTrackEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("RTCTrackEvent.track()"),
    )
    @JsValue("track")
    val TRACK: EventType<RTCTrackEvent<*>>
        get() = definedExternally
}
