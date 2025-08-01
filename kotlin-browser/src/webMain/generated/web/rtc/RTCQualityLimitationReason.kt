// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCQualityLimitationReason {
    companion object
}

inline val RTCQualityLimitationReason.Companion.bandwidth: RTCQualityLimitationReason
    get() = unsafeCast("bandwidth")

inline val RTCQualityLimitationReason.Companion.cpu: RTCQualityLimitationReason
    get() = unsafeCast("cpu")

inline val RTCQualityLimitationReason.Companion.none: RTCQualityLimitationReason
    get() = unsafeCast("none")

inline val RTCQualityLimitationReason.Companion.other: RTCQualityLimitationReason
    get() = unsafeCast("other")
