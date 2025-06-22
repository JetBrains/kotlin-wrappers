// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.reflect.unsafeCast
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
     * The read-only **`receiver`** property of the RTCTrackEvent interface indicates the The RTCRtpReceiver which pairs the `receiver` with a sender and other properties which establish a single bidirectional RTP stream for use by the RTCTrackEvent.track associated with the `RTCTrackEvent`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/receiver)
     */
    val receiver: RTCRtpReceiver

    /**
     * The WebRTC API interface RTCTrackEvent's read-only **`streams`** property specifies an array of track being added to the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/streams)
     */
    val streams: ReadonlyArray<MediaStream>

    /**
     * The
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/track)
     */
    val track: MediaStreamTrack

    /**
     * The WebRTC API interface RTCTrackEvent's read-only **`transceiver`** property indicates the The transceiver pairs the track's The RTCRtpTransceiver which pairs the `receiver` with a sender and other properties which establish a single bidirectional RTP stream for use by the RTCTrackEvent.track associated with the `RTCTrackEvent`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/transceiver)
     */
    val transceiver: RTCRtpTransceiver

    companion object {
        @JsValue("track")
        val TRACK: EventType<RTCTrackEvent>
    }
}

inline fun RTCTrackEvent.asInit(): RTCTrackEventInit =
    unsafeCast(this)
