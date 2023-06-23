// Automatically generated - do not modify!

package webrtc

import web.errors.DOMException

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError) */
external class RTCError(
    init: RTCErrorInit,
    message: String = definedExternally,
) : DOMException {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail) */
    val errorDetail: RTCErrorDetailType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/receivedAlert) */
    val receivedAlert: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sctpCauseCode) */
    val sctpCauseCode: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sdpLineNumber) */
    val sdpLineNumber: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sentAlert) */
    val sentAlert: Number?
}
