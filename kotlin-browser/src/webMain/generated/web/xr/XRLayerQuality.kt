// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRLayerQuality

inline val XRLayerQuality.Companion.default: XRLayerQuality
    get() = unsafeCast("default")

inline val XRLayerQuality.Companion.textOptimized: XRLayerQuality
    get() = unsafeCast("text-optimized")

inline val XRLayerQuality.Companion.graphicsOptimized: XRLayerQuality
    get() = unsafeCast("graphics-optimized")
