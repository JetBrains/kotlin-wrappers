// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.vtt

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface TrackEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TrackEvent.addTrack()"),
    )
    @JsValue("addtrack")
    val ADD_TRACK: EventType<TrackEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TrackEvent.removeTrack()"),
    )
    @JsValue("removetrack")
    val REMOVE_TRACK: EventType<TrackEvent<EventTarget>>
        get() = definedExternally
}
