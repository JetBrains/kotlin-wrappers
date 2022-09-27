// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCTrackEventInit : org.w3c.dom.EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<org.w3c.dom.mediacapture.MediaStream>?
    var track: org.w3c.dom.mediacapture.MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}
