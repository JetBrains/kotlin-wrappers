// Automatically generated - do not modify!

package web.mediastreams

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track)
     */
    val track: MediaStreamTrack

    @JsAlias(THIS)
    override fun asInit(): MediaStreamTrackEventInit

    companion object {
        @JsValue("addtrack")
        val ADD_TRACK: EventType<MediaStreamTrackEvent>

        @JsValue("removetrack")
        val REMOVE_TRACK: EventType<MediaStreamTrackEvent>
    }
}
