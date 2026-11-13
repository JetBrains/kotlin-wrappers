// Automatically generated - do not modify!

package web.rtc

import web.errors.DOMException

/**
 * The **`RTCError`** interface of the WebRTC API describes an error which has occurred while handling RTC operations. It's based upon the standard DOMException interface that describes general DOM errors.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError)
 */
open external class RTCError(
    init: RTCErrorInit,
    message: String = definedExternally,
) : DOMException {
    /**
     * The **`errorDetail`** read-only property of the RTCError interface is a string indicating the WebRTC-specific error code that occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail)
     */
    open val errorDetail: RTCErrorDetailType

    /**
     * The **`receivedAlert`** read-only property of the RTCError interface specifies the fatal DTLS error which resulted in an alert being received from the remote peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/receivedAlert)
     */
    open val receivedAlert: Int?

    /**
     * The **`sctpCauseCode`** read-only property of the RTCError interface provides the SCTP cause code explaining why the SCTP negotiation failed, if the RTCError represents an SCTP error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sctpCauseCode)
     */
    open val sctpCauseCode: Int?

    /**
     * The **`sdpLineNumber`** read-only property of the RTCError interface specifies the SDP message line number where a syntax error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sdpLineNumber)
     */
    open val sdpLineNumber: Int?

    /**
     * The **`sentAlert`** read-only property of the RTCError interface specifies the DTLS alert number sent to the remote peer, if the error represents an outbound DTLS error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sentAlert)
     */
    open val sentAlert: Int?
}
