// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.media.streams.MediaStream

@JsPlainObject
external interface RTCRtpTransceiverInit {
    var direction: RTCRtpTransceiverDirection?
    var sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?
    var streams: ReadonlyArray<MediaStream>?
}
