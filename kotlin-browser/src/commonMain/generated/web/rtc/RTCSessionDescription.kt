// Automatically generated - do not modify!

package web.rtc

/**
 * The **`RTCSessionDescription`** interface describes one end of a connection—or potential connection—and how it's configured.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription)
 */
open external class RTCSessionDescription(
    init: RTCSessionDescriptionInit,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/sdp)
     */
    val sdp: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type)
     */
    val type: RTCSdpType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/toJSON)
     */
    fun toJSON(): RTCSessionDescriptionInit
}
