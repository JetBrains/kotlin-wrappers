// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webrtc

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventInit
import web.events.EventType
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

external interface RTCTrackEventInit : EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<MediaStream>?
    var track: MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}

open external class RTCTrackEvent(
    override val type: EventType<RTCTrackEvent>,
    init: RTCTrackEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/receiver) */
    val receiver: RTCRtpReceiver

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/streams) */
    val streams: ReadonlyArray<MediaStream>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/track) */
    val track: MediaStreamTrack

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/transceiver) */
    val transceiver: RTCRtpTransceiver

    companion object
}
