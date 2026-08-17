// Automatically generated - do not modify!

package web.images

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ResizeQuality

inline val ResizeQuality.Companion.high: ResizeQuality
    get() = unsafeCast("high")

inline val ResizeQuality.Companion.low: ResizeQuality
    get() = unsafeCast("low")

inline val ResizeQuality.Companion.medium: ResizeQuality
    get() = unsafeCast("medium")

inline val ResizeQuality.Companion.pixelated: ResizeQuality
    get() = unsafeCast("pixelated")
