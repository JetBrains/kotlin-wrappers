// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.media.streams.MediaStream

@JsPlainObject
external interface RTCRtpTransceiverInit {
    val direction: RTCRtpTransceiverDirection?
    val sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?
    val streams: ReadonlyArray<MediaStream>?
}
