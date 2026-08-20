// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail)
 */
@JsUnion
sealed /* union */
external interface RTCErrorDetailType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#data-channel-failure)
 */
inline val RTCErrorDetailType.Companion.dataChannelFailure: RTCErrorDetailType
    get() = unsafeCast("data-channel-failure")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#dtls-failure)
 */
inline val RTCErrorDetailType.Companion.dtlsFailure: RTCErrorDetailType
    get() = unsafeCast("dtls-failure")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#fingerprint-failure)
 */
inline val RTCErrorDetailType.Companion.fingerprintFailure: RTCErrorDetailType
    get() = unsafeCast("fingerprint-failure")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#hardware-encoder-error)
 */
inline val RTCErrorDetailType.Companion.hardwareEncoderError: RTCErrorDetailType
    get() = unsafeCast("hardware-encoder-error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#hardware-encoder-not-available)
 */
inline val RTCErrorDetailType.Companion.hardwareEncoderNotAvailable: RTCErrorDetailType
    get() = unsafeCast("hardware-encoder-not-available")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#sctp-failure)
 */
inline val RTCErrorDetailType.Companion.sctpFailure: RTCErrorDetailType
    get() = unsafeCast("sctp-failure")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail#sdp-syntax-error)
 */
inline val RTCErrorDetailType.Companion.sdpSyntaxError: RTCErrorDetailType
    get() = unsafeCast("sdp-syntax-error")
