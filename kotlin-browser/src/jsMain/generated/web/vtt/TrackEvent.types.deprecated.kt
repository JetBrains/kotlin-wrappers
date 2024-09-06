// Automatically generated - do not modify!

package web.vtt

import seskar.js.JsValue
import web.events.EventType

sealed external class TrackEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TrackEvent.ADD_TRACK"),
    )
    @JsValue("addtrack")
    fun addTrack(): EventType<TrackEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TrackEvent.REMOVE_TRACK"),
    )
    @JsValue("removetrack")
    fun removeTrack(): EventType<TrackEvent>
}
