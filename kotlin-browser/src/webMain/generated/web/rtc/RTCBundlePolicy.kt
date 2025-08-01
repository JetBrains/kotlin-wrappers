// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCBundlePolicy {
    companion object
}

inline val RTCBundlePolicy.Companion.balanced: RTCBundlePolicy
    get() = unsafeCast("balanced")

inline val RTCBundlePolicy.Companion.maxBundle: RTCBundlePolicy
    get() = unsafeCast("max-bundle")

inline val RTCBundlePolicy.Companion.maxCompat: RTCBundlePolicy
    get() = unsafeCast("max-compat")
