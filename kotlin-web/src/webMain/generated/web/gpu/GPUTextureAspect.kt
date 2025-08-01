// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUTextureAspect {
    companion object
}

inline val GPUTextureAspect.Companion.all: GPUTextureAspect
    get() = unsafeCast("all")

inline val GPUTextureAspect.Companion.depthOnly: GPUTextureAspect
    get() = unsafeCast("depth-only")

inline val GPUTextureAspect.Companion.stencilOnly: GPUTextureAspect
    get() = unsafeCast("stencil-only")
