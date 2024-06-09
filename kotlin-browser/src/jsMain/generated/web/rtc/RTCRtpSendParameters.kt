// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCRtpSendParameters :
    RTCRtpParameters {
    var degradationPreference: RTCDegradationPreference?
    var encodings: ReadonlyArray<RTCRtpEncodingParameters>
    var transactionId: String
}
