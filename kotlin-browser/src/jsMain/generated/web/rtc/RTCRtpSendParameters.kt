// Automatically generated - do not modify!

package web.rtc

import js.core.ReadonlyArray

sealed external interface RTCRtpSendParameters :
    RTCRtpParameters {
    var degradationPreference: RTCDegradationPreference?
    var encodings: ReadonlyArray<RTCRtpEncodingParameters>
    var transactionId: String
}
