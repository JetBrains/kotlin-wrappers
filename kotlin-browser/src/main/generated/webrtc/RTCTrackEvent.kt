// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

external class RTCTrackEvent : web.events.Event {
    val receiver: RTCRtpReceiver
    val streams: ReadonlyArray<org.w3c.dom.mediacapture.MediaStream>
    val track: org.w3c.dom.mediacapture.MediaStreamTrack
    val transceiver: RTCRtpTransceiver

    companion object
}
