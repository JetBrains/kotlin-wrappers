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
    get() = unsafeCast("dataChannelFailure")

inline val RTCErrorDetailType.Companion.dtlsFailure: RTCErrorDetailType
    get() = unsafeCast("dtlsFailure")

inline val RTCErrorDetailType.Companion.fingerprintFailure: RTCErrorDetailType
    get() = unsafeCast("fingerprintFailure")

inline val RTCErrorDetailType.Companion.hardwareEncoderError: RTCErrorDetailType
    get() = unsafeCast("hardwareEncoderError")

inline val RTCErrorDetailType.Companion.hardwareEncoderNotAvailable: RTCErrorDetailType
    get() = unsafeCast("hardwareEncoderNotAvailable")

inline val RTCErrorDetailType.Companion.sctpFailure: RTCErrorDetailType
    get() = unsafeCast("sctpFailure")

inline val RTCErrorDetailType.Companion.sdpSyntaxError: RTCErrorDetailType
    get() = unsafeCast("sdpSyntaxError")
