// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent)
 */
open external class RTCTrackEvent(
    override val type: EventType<RTCTrackEvent>,
    init: RTCTrackEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/receiver)
     */
    val receiver: RTCRtpReceiver

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/streams)
     */
    val streams: ReadonlyArray<MediaStream>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/track)
     */
    val track: MediaStreamTrack

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/transceiver)
     */
    val transceiver: RTCRtpTransceiver

    @JsAlias(THIS)
    override fun asInit(): RTCTrackEventInit

    companion object {
        @JsValue("track")
        val TRACK: EventType<RTCTrackEvent>
    }
}
