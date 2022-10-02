// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCTrackEventInit : web.events.EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<media.stream.MediaStream>?
    var track: media.stream.MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}
