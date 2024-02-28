// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.media.streams

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface MediaStreamTrackEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MediaStreamTrackEvent.addTrack()"),
    )
    @JsValue("addtrack")
    val ADD_TRACK: EventType<MediaStreamTrackEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MediaStreamTrackEvent.removeTrack()"),
    )
    @JsValue("removetrack")
    val REMOVE_TRACK: EventType<MediaStreamTrackEvent<EventTarget>>
        get() = definedExternally
}
