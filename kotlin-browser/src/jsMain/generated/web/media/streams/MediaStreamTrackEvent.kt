// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.streams

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent)
 */
open external class MediaStreamTrackEvent(
    override val type: EventType<MediaStreamTrackEvent, EventTarget>,
    init: MediaStreamTrackEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track)
     */
    val track: MediaStreamTrack

    @JsAlias(THIS)
    override fun asInit(): MediaStreamTrackEventInit

    companion object : MediaStreamTrackEventTypes
}
