// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCErrorDetailType {
    companion object
}

inline val RTCErrorDetailType.Companion.dataChannelFailure: RTCErrorDetailType
    get() = unsafeCast("data-channel-failure")

inline val RTCErrorDetailType.Companion.dtlsFailure: RTCErrorDetailType
    get() = unsafeCast("dtls-failure")

inline val RTCErrorDetailType.Companion.fingerprintFailure: RTCErrorDetailType
    get() = unsafeCast("fingerprint-failure")

inline val RTCErrorDetailType.Companion.hardwareEncoderError: RTCErrorDetailType
    get() = unsafeCast("hardware-encoder-error")

inline val RTCErrorDetailType.Companion.hardwareEncoderNotAvailable: RTCErrorDetailType
    get() = unsafeCast("hardware-encoder-not-available")

inline val RTCErrorDetailType.Companion.sctpFailure: RTCErrorDetailType
    get() = unsafeCast("sctp-failure")

inline val RTCErrorDetailType.Companion.sdpSyntaxError: RTCErrorDetailType
    get() = unsafeCast("sdp-syntax-error")
