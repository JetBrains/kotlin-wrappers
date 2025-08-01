// Automatically generated - do not modify!

package web.rtc

import kotlin.js.definedExternally

/**
 * The **`RTCIceCandidate`** interface—part of the WebRTC API—represents a candidate Interactive Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate)
 */
open external class RTCIceCandidate(
    init: RTCLocalIceCandidateInit = definedExternally,
) {
    /**
     * The **RTCIceCandidate** interface's read-only **`address`** property is a string providing the IP address of the device which is the source of the candidate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/address)
     */
    val address: String?

    /**
     * The read-only property **`candidate`** on the RTCIceCandidate interface returns a string describing the candidate in detail.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/candidate)
     */
    val candidate: String

    /**
     * The read-only **`component`** property on the RTCIceCandidate interface is a string which indicates whether the candidate is an RTP or an RTCP candidate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/component)
     */
    val component: RTCIceComponent?

    /**
     * The **`foundation`** read-only property of the RTCIceCandidate interface is a string that allows correlation of candidates from a common network path on multiple RTCIceTransport objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/foundation)
     */
    val foundation: String?

    /**
     * The **RTCIceCandidate** interface's read-only **`port`** property contains the port number on the device at the address given by RTCIceCandidate.address at which the candidate's peer can be reached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/port)
     */
    val port: Short?

    /**
     * The **RTCIceCandidate** interface's read-only **`priority`** property specifies the candidate's priority according to the remote peer; the higher this value is, the better the remote peer considers the candidate to be.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/priority)
     */
    val priority: Int?

    /**
     * The **RTCIceCandidate** interface's read-only **`protocol`** property is a string which indicates whether the candidate uses UDP or TCP as its transport protocol.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/protocol)
     */
    val protocol: RTCIceProtocol?

    /**
     * The **RTCIceCandidate** interface's read-only **`relatedAddress`** property is a string indicating the **related address** of a relay or reflexive candidate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/relatedAddress)
     */
    val relatedAddress: String?

    /**
     * The **RTCIceCandidate** interface's read-only **`relatedPort`** property indicates the port number of reflexive or relay candidates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/relatedPort)
     */
    val relatedPort: Short?

    /**
     * The read-only **`sdpMLineIndex`** property on the RTCIceCandidate interface is a zero-based index of the m-line describing the media associated with the candidate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/sdpMLineIndex)
     */
    val sdpMLineIndex: Short?

    /**
     * The read-only property **`sdpMid`** on the RTCIceCandidate interface returns a string specifying the media stream identification tag of the media component with which the candidate is associated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/sdpMid)
     */
    val sdpMid: String?

    /**
     * The **RTCIceCandidate** interface's read-only **`tcpType`** property is included on TCP candidates to provide additional details about the candidate type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType)
     */
    val tcpType: RTCIceTcpCandidateType?

    /**
     * The **RTCIceCandidate** interface's read-only **`type`** specifies the type of candidate the object represents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type)
     */
    val type: RTCIceCandidateType?

    /**
     * The read-only **`usernameFragment`** property on the RTCIceCandidate interface is a string indicating the username fragment ('ufrag') that uniquely identifies a single ICE interaction session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/usernameFragment)
     */
    val usernameFragment: String?

    /**
     * The RTCIceCandidate method **`toJSON()`** converts the `RTCIceCandidate` on which it's called into JSON.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/toJSON)
     */
    fun toJSON(): RTCIceCandidateInit
}
