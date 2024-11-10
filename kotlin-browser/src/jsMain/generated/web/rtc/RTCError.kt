// Automatically generated - do not modify!

package web.rtc

import web.errors.DOMException

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError)
 */
open external class RTCError(
    init: RTCErrorInit,
    message: String = definedExternally,
) : DOMException {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail)
     */
    val errorDetail: RTCErrorDetailType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/receivedAlert)
     */
    val receivedAlert: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sctpCauseCode)
     */
    val sctpCauseCode: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sdpLineNumber)
     */
    val sdpLineNumber: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sentAlert)
     */
    val sentAlert: Int?
}
