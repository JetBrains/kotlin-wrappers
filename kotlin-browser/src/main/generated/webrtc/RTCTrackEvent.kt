// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

external class RTCTrackEvent : web.events.Event {
    val receiver: RTCRtpReceiver
    val streams: ReadonlyArray<media.stream.MediaStream>
    val track: media.stream.MediaStreamTrack
    val transceiver: RTCRtpTransceiver

    companion object
}
