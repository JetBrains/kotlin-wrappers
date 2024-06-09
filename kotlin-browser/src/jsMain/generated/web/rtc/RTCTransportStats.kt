// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCTransportStats :
    RTCStats {
    var bytesReceived: JsLong?
    var bytesSent: JsLong?
    var dtlsCipher: String?
    var dtlsState: RTCDtlsTransportState
    var localCertificateId: String?
    var remoteCertificateId: String?
    var selectedCandidatePairId: String?
    var srtpCipher: String?
    var tlsVersion: String?
}
