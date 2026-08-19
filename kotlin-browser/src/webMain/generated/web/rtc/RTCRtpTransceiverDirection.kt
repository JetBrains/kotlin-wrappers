// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection)
 */
@JsUnion
sealed /* union */
external interface RTCRtpTransceiverDirection

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection#inactive)
 */
inline val RTCRtpTransceiverDirection.Companion.inactive: RTCRtpTransceiverDirection
    get() = unsafeCast("inactive")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection#recvonly)
 */
inline val RTCRtpTransceiverDirection.Companion.recvonly: RTCRtpTransceiverDirection
    get() = unsafeCast("recvonly")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection#sendonly)
 */
inline val RTCRtpTransceiverDirection.Companion.sendonly: RTCRtpTransceiverDirection
    get() = unsafeCast("sendonly")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection#sendrecv)
 */
inline val RTCRtpTransceiverDirection.Companion.sendrecv: RTCRtpTransceiverDirection
    get() = unsafeCast("sendrecv")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection#stopped)
 */
inline val RTCRtpTransceiverDirection.Companion.stopped: RTCRtpTransceiverDirection
    get() = unsafeCast("stopped")
