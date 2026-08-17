// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRDepthUsage

inline val XRDepthUsage.Companion.cpuOptimized: XRDepthUsage
    get() = unsafeCast("cpu-optimized")

inline val XRDepthUsage.Companion.gpuOptimized: XRDepthUsage
    get() = unsafeCast("gpu-optimized")
