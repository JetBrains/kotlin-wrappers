// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUFilterMode {
    companion object
}

inline val GPUFilterMode.Companion.linear: GPUFilterMode
    get() = unsafeCast("linear")

inline val GPUFilterMode.Companion.nearest: GPUFilterMode
    get() = unsafeCast("nearest")
