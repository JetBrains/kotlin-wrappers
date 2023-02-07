// Automatically generated - do not modify!

package webrtc

sealed external interface RTCTransportStats :
    RTCStats {
    var bytesReceived: Number?
    var bytesSent: Number?
    var dtlsCipher: String?
    var dtlsState: RTCDtlsTransportState
    var localCertificateId: String?
    var remoteCertificateId: String?
    var selectedCandidatePairId: String?
    var srtpCipher: String?
    var tlsVersion: String?
}
