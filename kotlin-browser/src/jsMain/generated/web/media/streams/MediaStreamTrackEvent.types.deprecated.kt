// Automatically generated - do not modify!

package web.media.streams

import seskar.js.JsValue
import web.events.EventType

sealed external class MediaStreamTrackEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MediaStreamTrackEvent.ADD_TRACK"),
    )
    @JsValue("addtrack")
    fun addTrack(): EventType<MediaStreamTrackEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MediaStreamTrackEvent.REMOVE_TRACK"),
    )
    @JsValue("removetrack")
    fun removeTrack(): EventType<MediaStreamTrackEvent>
}
