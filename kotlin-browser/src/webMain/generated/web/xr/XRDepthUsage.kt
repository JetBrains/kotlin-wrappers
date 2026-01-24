// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRDepthUsage {
    companion object
}

inline val XRDepthUsage.Companion.cpuOptimized: XRDepthUsage
    get() = unsafeCast("cpu-optimized")

inline val XRDepthUsage.Companion.gpuOptimized: XRDepthUsage
    get() = unsafeCast("gpu-optimized")
