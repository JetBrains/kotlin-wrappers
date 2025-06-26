// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUBufferBindingType {
    companion object
}

inline val GPUBufferBindingType.Companion.readOnlyStorage: GPUBufferBindingType
    get() = unsafeCast("readOnlyStorage")

inline val GPUBufferBindingType.Companion.storage: GPUBufferBindingType
    get() = unsafeCast("storage")

inline val GPUBufferBindingType.Companion.uniform: GPUBufferBindingType
    get() = unsafeCast("uniform")
