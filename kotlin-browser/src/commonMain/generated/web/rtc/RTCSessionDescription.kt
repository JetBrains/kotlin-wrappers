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
     * The property **`RTCSessionDescription.sdp`** is a read-only string containing the SDP which describes the session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/sdp)
     */
    val sdp: String

    /**
     * The property **`RTCSessionDescription.type`** is a read-only string value which describes the description's type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type)
     */
    val type: RTCSdpType

    /**
     * The **`RTCSessionDescription.toJSON()`** method generates a ```js-nolint toJSON() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/toJSON)
     */
    fun toJSON(): RTCSessionDescriptionInit
}
