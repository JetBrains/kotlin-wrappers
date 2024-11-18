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
    val dtlsRole: RTCDtlsRole?
    val dtlsState: RTCDtlsTransportState
    val iceLocalUsernameFragment: String?
    val iceRole: RTCIceRole?
    val iceState: RTCIceTransportState?
    val localCertificateId: String?
    val packetsReceived: JsLong?
    val packetsSent: JsLong?
    val remoteCertificateId: String?
    val selectedCandidatePairChanges: Int?
    val selectedCandidatePairId: String?
    val srtpCipher: String?
    val tlsVersion: String?
}
