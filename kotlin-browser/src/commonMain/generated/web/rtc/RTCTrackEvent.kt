// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import web.mediastreams.MediaStream
import web.mediastreams.MediaStreamTrack

/**
 * The WebRTC API interface **`RTCTrackEvent`** represents the RTCPeerConnection.track_event event, which is sent when a new MediaStreamTrack is added to an RTCRtpReceiver which is part of the RTCPeerConnection.
 *
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
