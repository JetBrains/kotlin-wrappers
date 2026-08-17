// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCQualityLimitationReason

inline val RTCQualityLimitationReason.Companion.bandwidth: RTCQualityLimitationReason
    get() = unsafeCast("bandwidth")

inline val RTCQualityLimitationReason.Companion.cpu: RTCQualityLimitationReason
    get() = unsafeCast("cpu")

inline val RTCQualityLimitationReason.Companion.none: RTCQualityLimitationReason
    get() = unsafeCast("none")

inline val RTCQualityLimitationReason.Companion.other: RTCQualityLimitationReason
    get() = unsafeCast("other")
