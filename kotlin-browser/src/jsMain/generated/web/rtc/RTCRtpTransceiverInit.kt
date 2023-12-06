// Automatically generated - do not modify!

package web.rtc

import js.core.ReadonlyArray
import web.media.streams.MediaStream

sealed external interface RTCRtpTransceiverInit {
    var direction: RTCRtpTransceiverDirection?
    var sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?
    var streams: ReadonlyArray<MediaStream>?
}
