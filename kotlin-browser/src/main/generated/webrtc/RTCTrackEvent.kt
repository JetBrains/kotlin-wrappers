// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.stream.MediaStream
import media.stream.MediaStreamTrack

external class RTCTrackEvent : web.events.Event {
    val receiver: RTCRtpReceiver
    val streams: ReadonlyArray<MediaStream>
    val track: MediaStreamTrack
    val transceiver: RTCRtpTransceiver

    companion object
}
