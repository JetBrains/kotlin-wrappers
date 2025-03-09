// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCRtpSendParameters :
    RTCRtpParameters {
    val degradationPreference: RTCDegradationPreference?
    val encodings: ReadonlyArray<RTCRtpEncodingParameters>
    val transactionId: String
}
