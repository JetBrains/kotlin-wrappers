// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUBlendOperation

inline val GPUBlendOperation.Companion.add: GPUBlendOperation
    get() = unsafeCast("add")

inline val GPUBlendOperation.Companion.max: GPUBlendOperation
    get() = unsafeCast("max")

inline val GPUBlendOperation.Companion.min: GPUBlendOperation
    get() = unsafeCast("min")

inline val GPUBlendOperation.Companion.reverseSubtract: GPUBlendOperation
    get() = unsafeCast("reverse-subtract")

inline val GPUBlendOperation.Companion.subtract: GPUBlendOperation
    get() = unsafeCast("subtract")
