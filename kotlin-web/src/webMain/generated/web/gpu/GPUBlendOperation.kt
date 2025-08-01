// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUBlendOperation {
    companion object
}

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
