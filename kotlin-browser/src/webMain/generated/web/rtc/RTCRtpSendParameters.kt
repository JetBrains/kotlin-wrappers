// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters#return_value)
 */
@JsPlainObject
external interface RTCRtpSendParameters :
    RTCRtpParameters {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters#degradationpreference)
     */
    var degradationPreference: RTCDegradationPreference?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters#encodings)
     */
    var encodings: ReadonlyArray<RTCRtpEncodingParameters>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters#transactionid)
     */
    var transactionId: String
}
