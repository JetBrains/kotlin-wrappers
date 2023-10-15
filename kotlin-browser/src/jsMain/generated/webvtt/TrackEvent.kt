// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webvtt

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface TrackEventInit : EventInit {
    var track: TextTrack?
}

/**
 * The TrackEvent interface, part of the HTML DOM specification, is used for events which represent changes to the set of available tracks on an HTML media element; these events are addtrack and removetrack.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent)
 */
open external class TrackEvent(
    override val type: EventType<TrackEvent>,
    init: TrackEventInit = definedExternally,
) : Event {
    /**
     * Returns the track object (TextTrack, AudioTrack, or VideoTrack) to which the event relates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent/track)
     */
    val track: TextTrack?

    companion object
}
