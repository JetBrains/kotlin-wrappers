// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUTextureAspect

inline val GPUTextureAspect.Companion.all: GPUTextureAspect
    get() = unsafeCast("all")

inline val GPUTextureAspect.Companion.depthOnly: GPUTextureAspect
    get() = unsafeCast("depth-only")

inline val GPUTextureAspect.Companion.stencilOnly: GPUTextureAspect
    get() = unsafeCast("stencil-only")
