// Automatically generated - do not modify!

package web.rtc

import js.core.UInt53
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RTCTransportStats :
    RTCStats {
    var bytesReceived: UInt53?
    var bytesSent: UInt53?
    var dtlsCipher: String?
    var dtlsRole: RTCDtlsRole?
    var dtlsState: RTCDtlsTransportState
    var iceLocalUsernameFragment: String?
    var iceRole: RTCIceRole?
    var iceState: RTCIceTransportState?
    var localCertificateId: String?
    var packetsReceived: UInt53?
    var packetsSent: UInt53?
    var remoteCertificateId: String?
    var selectedCandidatePairChanges: Int?
    var selectedCandidatePairId: String?
    var srtpCipher: String?
    var tlsVersion: String?
}
