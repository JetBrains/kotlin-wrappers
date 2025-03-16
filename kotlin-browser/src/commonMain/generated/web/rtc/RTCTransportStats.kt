// Automatically generated - do not modify!

package web.rtc

import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCTransportStats :
    RTCStats {
    val bytesReceived: UInt53?
    val bytesSent: UInt53?
    val dtlsCipher: String?
    val dtlsRole: RTCDtlsRole?
    val dtlsState: RTCDtlsTransportState
    val iceLocalUsernameFragment: String?
    val iceRole: RTCIceRole?
    val iceState: RTCIceTransportState?
    val localCertificateId: String?
    val packetsReceived: UInt53?
    val packetsSent: UInt53?
    val remoteCertificateId: String?
    val selectedCandidatePairChanges: Int?
    val selectedCandidatePairId: String?
    val srtpCipher: String?
    val tlsVersion: String?
}
