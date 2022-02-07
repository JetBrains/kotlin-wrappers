// Automatically generated - do not modify!

package webrtc

sealed external interface RTCIceCandidate {
    val address: String?
    val candidate: String
    val component: RTCIceComponent?
    val foundation: String?
    val port: Number?
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
