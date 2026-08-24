// Automatically generated - do not modify!

package web.rtc

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#init)
 */
@JsPlainObject
external interface RTCErrorInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#errordetail)
     */
    var errorDetail: RTCErrorDetailType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#httprequeststatuscode)
     */
    var httpRequestStatusCode: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#receivedalert)
     */
    var receivedAlert: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#sctpcausecode)
     */
    var sctpCauseCode: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#sdplinenumber)
     */
    var sdpLineNumber: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/RTCError#sentalert)
     */
    var sentAlert: Int?
}
