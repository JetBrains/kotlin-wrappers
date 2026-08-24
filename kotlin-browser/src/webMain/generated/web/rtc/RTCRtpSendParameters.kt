// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters#parameters)
 */
@JsPlainObject
external interface RTCRtpSendParameters :
    RTCRtpParameters {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters#degradationpreference)
     */
    var degradationPreference: RTCDegradationPreference?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters#encodings)
     */
    var encodings: ReadonlyArray<RTCRtpEncodingParameters>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters#transactionid)
     */
    var transactionId: String
}
