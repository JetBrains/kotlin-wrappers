// Automatically generated - do not modify!

package webrtc

import web.errors.DOMException

external class RTCError(
    init: RTCErrorInit,
    message: String = definedExternally,
) : DOMException {
    val errorDetail: RTCErrorDetailType
    val receivedAlert: Number?
    val sctpCauseCode: Number?
    val sdpLineNumber: Number?
    val sentAlert: Number?
}
