// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.streams

import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaStreamTrackEventInit : EventInit {
    var track: MediaStreamTrack
}

/**
 * Events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent)
 */
open external class MediaStreamTrackEvent(
    override val type: EventType<MediaStreamTrackEvent>,
    init: MediaStreamTrackEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track) */
    val track: MediaStreamTrack

    companion object {
        @JsValue("addtrack")
        val ADD_TRACK: EventType<MediaStreamTrackEvent>

        @JsValue("removetrack")
        val REMOVE_TRACK: EventType<MediaStreamTrackEvent>
    }
}
