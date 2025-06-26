// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUCullMode {
    companion object
}

inline val GPUCullMode.Companion.back: GPUCullMode
    get() = unsafeCast("back")

inline val GPUCullMode.Companion.front: GPUCullMode
    get() = unsafeCast("front")

inline val GPUCullMode.Companion.none: GPUCullMode
    get() = unsafeCast("none")
