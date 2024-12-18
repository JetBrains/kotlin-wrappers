// Automatically generated - do not modify!

package web.rtc

/**
 * The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate)
 */
open external class RTCIceCandidate(
    init: RTCIceCandidateInit = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/address)
     */
    val address: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/candidate)
     */
    val candidate: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/component)
     */
    val component: RTCIceComponent?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/foundation)
     */
    val foundation: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/port)
     */
    val port: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/priority)
     */
    val priority: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/protocol)
     */
    val protocol: RTCIceProtocol?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/relatedAddress)
     */
    val relatedAddress: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/relatedPort)
     */
    val relatedPort: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/sdpMLineIndex)
     */
    val sdpMLineIndex: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/sdpMid)
     */
    val sdpMid: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType)
     */
    val tcpType: RTCIceTcpCandidateType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type)
     */
    val type: RTCIceCandidateType?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/usernameFragment)
     */
    val usernameFragment: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/toJSON)
     */
    fun toJSON(): RTCIceCandidateInit
}
