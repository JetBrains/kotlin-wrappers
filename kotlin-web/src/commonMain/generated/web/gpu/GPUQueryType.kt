// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUQueryType {
    companion object
}

inline val GPUQueryType.Companion.occlusion: GPUQueryType
    get() = unsafeCast("occlusion")

inline val GPUQueryType.Companion.timestamp: GPUQueryType
    get() = unsafeCast("timestamp")
