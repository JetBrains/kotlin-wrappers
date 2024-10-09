// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RTCTransportStats :
    RTCStats {
    val bytesReceived: JsLong?
    val bytesSent: JsLong?
    val dtlsCipher: String?
    val dtlsState: RTCDtlsTransportState
    val localCertificateId: String?
    val remoteCertificateId: String?
    val selectedCandidatePairId: String?
    val srtpCipher: String?
    val tlsVersion: String?
}
