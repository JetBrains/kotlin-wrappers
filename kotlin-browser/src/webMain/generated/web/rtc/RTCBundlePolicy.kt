// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCBundlePolicy

inline val RTCBundlePolicy.Companion.balanced: RTCBundlePolicy
    get() = unsafeCast("balanced")

inline val RTCBundlePolicy.Companion.maxBundle: RTCBundlePolicy
    get() = unsafeCast("max-bundle")

inline val RTCBundlePolicy.Companion.maxCompat: RTCBundlePolicy
    get() = unsafeCast("max-compat")
