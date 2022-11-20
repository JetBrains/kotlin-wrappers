// Automatically generated - do not modify!

package media.streams

import web.events.Event
import web.events.EventInit

external interface MediaStreamTrackEventInit : EventInit {
    var track: MediaStreamTrack
}

open external class MediaStreamTrackEvent(
    type: String,
    init: MediaStreamTrackEventInit,
) : Event {
    val track: MediaStreamTrack

    companion object
}
