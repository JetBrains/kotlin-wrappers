// Automatically generated - do not modify!

package webvtt

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface TrackEventInit : EventInit {
    var track: TextTrack?
}

open external class TrackEvent(
    type: EventType<TrackEvent>,
    init: TrackEventInit = definedExternally,
) : Event {
    /** Returns the track object (TextTrack, AudioTrack, or VideoTrack) to which the event relates. */
    val track: TextTrack?

    companion object
}
