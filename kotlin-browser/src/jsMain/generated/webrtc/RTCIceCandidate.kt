// Automatically generated - do not modify!

package webrtc

external class RTCIceCandidate(
    init: RTCIceCandidateInit = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/address) */
    val address: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/candidate) */
    val candidate: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/component) */
    val component: RTCIceComponent?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/foundation) */
    val foundation: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/port) */
    val port: Int?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/priority) */
    val priority: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/protocol) */
    val protocol: RTCIceProtocol?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/relatedAddress) */
    val relatedAddress: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/relatedPort) */
    val relatedPort: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/sdpMLineIndex) */
    val sdpMLineIndex: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/sdpMid) */
    val sdpMid: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType) */
    val tcpType: RTCIceTcpCandidateType?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type) */
    val type: RTCIceCandidateType?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/usernameFragment) */
    val usernameFragment: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/toJSON) */
    fun toJSON(): RTCIceCandidateInit
}
