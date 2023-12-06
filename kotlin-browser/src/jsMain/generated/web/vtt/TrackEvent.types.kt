// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.vtt

import seskar.js.JsValue
import web.events.EventType

sealed external interface TrackEventTypes {
    @JsValue("addtrack")
    val ADD_TRACK: EventType<TrackEvent>
        get() = definedExternally

    @JsValue("removetrack")
    val REMOVE_TRACK: EventType<TrackEvent>
        get() = definedExternally
}
