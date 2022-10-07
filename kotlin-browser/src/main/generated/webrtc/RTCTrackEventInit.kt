// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.stream.MediaStream
import media.stream.MediaStreamTrack

sealed external interface RTCTrackEventInit : web.events.EventInit {
    var receiver: RTCRtpReceiver
    var streams: ReadonlyArray<MediaStream>?
    var track: MediaStreamTrack
    var transceiver: RTCRtpTransceiver
}
