// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.reflect.unsafeCast
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
     * The read-only **`receiver`** property of the RTCTrackEvent interface indicates the RTCRtpReceiver which is used to receive data containing media for the RTCTrackEvent.track to which the event refers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/receiver)
     */
    val receiver: RTCRtpReceiver

    /**
     * The WebRTC API interface RTCTrackEvent's read-only **`streams`** property specifies an array of MediaStream objects, one for each of the streams that comprise the track being added to the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/streams)
     */
    val streams: ReadonlyArray<MediaStream>

    /**
     * The WebRTC API interface RTCTrackEvent's read-only **`track`** property specifies the MediaStreamTrack that has been added to the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/track)
     */
    val track: MediaStreamTrack

    /**
     * The WebRTC API interface RTCTrackEvent's read-only **`transceiver`** property indicates the RTCRtpTransceiver affiliated with the event's RTCTrackEvent.track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/transceiver)
     */
    val transceiver: RTCRtpTransceiver

    companion object
}

inline fun RTCTrackEvent.asInit(): RTCTrackEventInit =
    unsafeCast(this)

inline val RTCTrackEvent.Companion.TRACK: EventType<RTCTrackEvent>
    get() = EventType("track")
