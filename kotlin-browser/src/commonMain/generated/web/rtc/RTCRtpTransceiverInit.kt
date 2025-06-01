// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.mediastreams.MediaStream

@JsPlainObject
external interface RTCRtpTransceiverInit {
    val direction: RTCRtpTransceiverDirection?
    val sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?
    val streams: ReadonlyArray<MediaStream>?
}
