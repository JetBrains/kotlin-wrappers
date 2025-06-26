// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUMipmapFilterMode {
    companion object
}

inline val GPUMipmapFilterMode.Companion.linear: GPUMipmapFilterMode
    get() = unsafeCast("linear")

inline val GPUMipmapFilterMode.Companion.nearest: GPUMipmapFilterMode
    get() = unsafeCast("nearest")
