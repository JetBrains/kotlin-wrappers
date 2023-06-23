// Automatically generated - do not modify!

package webrtc

/**
 * One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription)
 */
external class RTCSessionDescription(
    init: RTCSessionDescriptionInit,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/sdp) */
    val sdp: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type) */
    val type: RTCSdpType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/toJSON) */
    fun toJSON(): Any
}
