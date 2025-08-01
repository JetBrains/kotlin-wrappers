// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.images

import js.reflect.unsafeCast

sealed external interface ResizeQuality {
    companion object
}

inline val ResizeQuality.Companion.high: ResizeQuality
    get() = unsafeCast("high")

inline val ResizeQuality.Companion.low: ResizeQuality
    get() = unsafeCast("low")

inline val ResizeQuality.Companion.medium: ResizeQuality
    get() = unsafeCast("medium")

inline val ResizeQuality.Companion.pixelated: ResizeQuality
    get() = unsafeCast("pixelated")
