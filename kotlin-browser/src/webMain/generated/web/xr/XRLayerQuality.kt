// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRLayerQuality {
    companion object
}

inline val XRLayerQuality.Companion.default: XRLayerQuality
    get() = unsafeCast("default")

inline val XRLayerQuality.Companion.textOptimized: XRLayerQuality
    get() = unsafeCast("text-optimized")

inline val XRLayerQuality.Companion.graphicsOptimized: XRLayerQuality
    get() = unsafeCast("graphics-optimized")
