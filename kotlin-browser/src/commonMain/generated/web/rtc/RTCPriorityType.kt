// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCPriorityType {
    companion object
}

inline val RTCPriorityType.Companion.high: RTCPriorityType
    get() = unsafeCast("high")

inline val RTCPriorityType.Companion.low: RTCPriorityType
    get() = unsafeCast("low")

inline val RTCPriorityType.Companion.medium: RTCPriorityType
    get() = unsafeCast("medium")

inline val RTCPriorityType.Companion.veryLow: RTCPriorityType
    get() = unsafeCast("very-low")
