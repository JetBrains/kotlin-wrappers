// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.mediastreams.MediaStream

@JsPlainObject
external interface RTCRtpTransceiverInit {
    var direction: RTCRtpTransceiverDirection?
    var sendEncodings: ReadonlyArray<RTCRtpEncodingParameters>?
    var streams: ReadonlyArray<MediaStream>?
}
