// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCPriorityType

inline val RTCPriorityType.Companion.high: RTCPriorityType
    get() = unsafeCast("high")

inline val RTCPriorityType.Companion.low: RTCPriorityType
    get() = unsafeCast("low")

inline val RTCPriorityType.Companion.medium: RTCPriorityType
    get() = unsafeCast("medium")

inline val RTCPriorityType.Companion.veryLow: RTCPriorityType
    get() = unsafeCast("very-low")
