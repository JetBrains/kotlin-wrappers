// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUErrorFilter

inline val GPUErrorFilter.Companion.internal: GPUErrorFilter
    get() = unsafeCast("internal")

inline val GPUErrorFilter.Companion.outOfMemory: GPUErrorFilter
    get() = unsafeCast("out-of-memory")

inline val GPUErrorFilter.Companion.validation: GPUErrorFilter
    get() = unsafeCast("validation")
