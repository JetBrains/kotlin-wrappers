// Automatically generated - do not modify!

package media.streams

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaStreamTrackEventInit : EventInit {
    var track: MediaStreamTrack
}

open external class MediaStreamTrackEvent(
    type: EventType<MediaStreamTrackEvent>,
    init: MediaStreamTrackEventInit,
) : Event {
    val track: MediaStreamTrack

    companion object
}
