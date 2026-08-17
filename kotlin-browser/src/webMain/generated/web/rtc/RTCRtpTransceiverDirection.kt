// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCRtpTransceiverDirection

inline val RTCRtpTransceiverDirection.Companion.inactive: RTCRtpTransceiverDirection
    get() = unsafeCast("inactive")

inline val RTCRtpTransceiverDirection.Companion.recvonly: RTCRtpTransceiverDirection
    get() = unsafeCast("recvonly")

inline val RTCRtpTransceiverDirection.Companion.sendonly: RTCRtpTransceiverDirection
    get() = unsafeCast("sendonly")

inline val RTCRtpTransceiverDirection.Companion.sendrecv: RTCRtpTransceiverDirection
    get() = unsafeCast("sendrecv")

inline val RTCRtpTransceiverDirection.Companion.stopped: RTCRtpTransceiverDirection
    get() = unsafeCast("stopped")
