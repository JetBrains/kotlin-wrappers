// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.streams

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaStreamTrackEventInit : EventInit {
    var track: MediaStreamTrack
}

open external class MediaStreamTrackEvent(
    override val type: EventType<MediaStreamTrackEvent>,
    init: MediaStreamTrackEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track) */
    val track: MediaStreamTrack

    companion object
}
