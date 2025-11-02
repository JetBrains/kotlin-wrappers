// Automatically generated - do not modify!

package web.rtc

import web.errors.DOMException
import kotlin.js.definedExternally

/**
 * The **`RTCError`** interface describes an error which has occurred while handling WebRTC operations. It's based upon the standard DOMException interface that describes general DOM errors.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError)
 */
open external class RTCError(
    init: RTCErrorInit,
    message: String = definedExternally,
) : DOMException {
    /**
     * The RTCError interface's read-only **`errorDetail`** property is a string indicating the WebRTC-specific error code that occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail)
     */
    val errorDetail: RTCErrorDetailType

    /**
     * The RTCError read-only property **`receivedAlert`** specifies the fatal DTLS error which resulted in an alert being received from the remote peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/receivedAlert)
     */
    val receivedAlert: Int?

    /**
     * The read-only **`sctpCauseCode`** property in an RTCError object provides the SCTP cause code explaining why the SCTP negotiation failed, if the RTCError represents an SCTP error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sctpCauseCode)
     */
    val sctpCauseCode: Int?

    /**
     * The RTCError interface's read-only property **`sdpLineNumber`** specifies the line number within the SDP at which a syntax error occurred while parsing it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sdpLineNumber)
     */
    val sdpLineNumber: Int?

    /**
     * The read-only **`sentAlert`** property in an RTCError object specifies the DTLS alert number occurred while sending data to the remote peer, if the error represents an outbound DTLS error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sentAlert)
     */
    val sentAlert: Int?
}
