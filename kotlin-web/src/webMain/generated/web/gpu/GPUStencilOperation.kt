// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUStencilOperation

inline val GPUStencilOperation.Companion.decrementClamp: GPUStencilOperation
    get() = unsafeCast("decrement-clamp")

inline val GPUStencilOperation.Companion.decrementWrap: GPUStencilOperation
    get() = unsafeCast("decrement-wrap")

inline val GPUStencilOperation.Companion.incrementClamp: GPUStencilOperation
    get() = unsafeCast("increment-clamp")

inline val GPUStencilOperation.Companion.incrementWrap: GPUStencilOperation
    get() = unsafeCast("increment-wrap")

inline val GPUStencilOperation.Companion.invert: GPUStencilOperation
    get() = unsafeCast("invert")

inline val GPUStencilOperation.Companion.keep: GPUStencilOperation
    get() = unsafeCast("keep")

inline val GPUStencilOperation.Companion.replace: GPUStencilOperation
    get() = unsafeCast("replace")

inline val GPUStencilOperation.Companion.zero: GPUStencilOperation
    get() = unsafeCast("zero")
