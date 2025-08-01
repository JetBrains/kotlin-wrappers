// Automatically generated - do not modify!

package web.mediastreams

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * The **`MediaStreamTrackEvent`** interface of the Media Capture and Streams API represents events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Capture and Streams API methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent)
 */
open external class MediaStreamTrackEvent(
    override val type: EventType<MediaStreamTrackEvent>,
    init: MediaStreamTrackEventInit,
) : Event {
    /**
     * The **`track`** read-only property of the MediaStreamTrackEvent interface returns the MediaStreamTrack associated with this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track)
     */
    val track: MediaStreamTrack

    companion object
}

inline fun MediaStreamTrackEvent.asInit(): MediaStreamTrackEventInit =
    unsafeCast(this)

inline val MediaStreamTrackEvent.Companion.ADD_TRACK: EventType<MediaStreamTrackEvent>
    get() = EventType("addtrack")

inline val MediaStreamTrackEvent.Companion.REMOVE_TRACK: EventType<MediaStreamTrackEvent>
    get() = EventType("removetrack")
