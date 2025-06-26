// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUPrimitiveTopology {
    companion object
}

inline val GPUPrimitiveTopology.Companion.lineList: GPUPrimitiveTopology
    get() = unsafeCast("line-list")

inline val GPUPrimitiveTopology.Companion.lineStrip: GPUPrimitiveTopology
    get() = unsafeCast("line-strip")

inline val GPUPrimitiveTopology.Companion.pointList: GPUPrimitiveTopology
    get() = unsafeCast("point-list")

inline val GPUPrimitiveTopology.Companion.triangleList: GPUPrimitiveTopology
    get() = unsafeCast("triangle-list")

inline val GPUPrimitiveTopology.Companion.triangleStrip: GPUPrimitiveTopology
    get() = unsafeCast("triangle-strip")
