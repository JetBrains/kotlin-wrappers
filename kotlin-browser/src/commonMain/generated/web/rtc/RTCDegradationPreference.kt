// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCDegradationPreference {
    companion object
}

inline val RTCDegradationPreference.Companion.balanced: RTCDegradationPreference
    get() = unsafeCast("balanced")

inline val RTCDegradationPreference.Companion.maintainFramerate: RTCDegradationPreference
    get() = unsafeCast("maintainFramerate")

inline val RTCDegradationPreference.Companion.maintainResolution: RTCDegradationPreference
    get() = unsafeCast("maintainResolution")
