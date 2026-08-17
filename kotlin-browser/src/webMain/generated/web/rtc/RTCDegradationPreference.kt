// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCDegradationPreference

inline val RTCDegradationPreference.Companion.balanced: RTCDegradationPreference
    get() = unsafeCast("balanced")

inline val RTCDegradationPreference.Companion.maintainFramerate: RTCDegradationPreference
    get() = unsafeCast("maintain-framerate")

inline val RTCDegradationPreference.Companion.maintainResolution: RTCDegradationPreference
    get() = unsafeCast("maintain-resolution")
