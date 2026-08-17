// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUBufferBindingType

inline val GPUBufferBindingType.Companion.readOnlyStorage: GPUBufferBindingType
    get() = unsafeCast("read-only-storage")

inline val GPUBufferBindingType.Companion.storage: GPUBufferBindingType
    get() = unsafeCast("storage")

inline val GPUBufferBindingType.Companion.uniform: GPUBufferBindingType
    get() = unsafeCast("uniform")
