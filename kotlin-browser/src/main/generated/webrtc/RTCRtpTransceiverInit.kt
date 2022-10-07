// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.stream.MediaStream

sealed external interface RTCRtpTransceiverInit {
    var direction: RTCRtpTransceiverDirection?
    var sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?
    var streams: ReadonlyArray<MediaStream>?
}
