// Automatically generated - do not modify!

package webrtc

external class RTCIceCandidate(
    init: RTCIceCandidateInit = definedExternally,
) {
    val address: String?
    val candidate: String
    val component: RTCIceComponent?
    val foundation: String?
    val port: Int?
    val priority: Number?
    val protocol: RTCIceProtocol?
    val relatedAddress: String?
    val relatedPort: Number?
    val sdpMLineIndex: Number?
    val sdpMid: String?
    val tcpType: RTCIceTcpCandidateType?
    val type: RTCIceCandidateType?
    val usernameFragment: String?
    fun toJSON(): RTCIceCandidateInit
}
