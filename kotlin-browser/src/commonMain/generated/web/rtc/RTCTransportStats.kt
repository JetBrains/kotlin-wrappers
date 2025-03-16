// Automatically generated - do not modify!

package web.rtc

import js.core.Int53
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCTransportStats :
    RTCStats {
    val bytesReceived: Int53?
    val bytesSent: Int53?
    val dtlsCipher: String?
    val dtlsRole: RTCDtlsRole?
    val dtlsState: RTCDtlsTransportState
    val iceLocalUsernameFragment: String?
    val iceRole: RTCIceRole?
    val iceState: RTCIceTransportState?
    val localCertificateId: String?
    val packetsReceived: Int53?
    val packetsSent: Int53?
    val remoteCertificateId: String?
    val selectedCandidatePairChanges: Int?
    val selectedCandidatePairId: String?
    val srtpCipher: String?
    val tlsVersion: String?
}
