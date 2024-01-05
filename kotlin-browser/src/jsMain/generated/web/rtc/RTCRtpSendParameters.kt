// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray

sealed external interface RTCRtpSendParameters :
    RTCRtpParameters {
    var degradationPreference: RTCDegradationPreference?
    var encodings: ReadonlyArray<RTCRtpEncodingParameters>
    var transactionId: String
}
