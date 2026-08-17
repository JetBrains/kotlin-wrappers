// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUBufferMapState

inline val GPUBufferMapState.Companion.mapped: GPUBufferMapState
    get() = unsafeCast("mapped")

inline val GPUBufferMapState.Companion.pending: GPUBufferMapState
    get() = unsafeCast("pending")

inline val GPUBufferMapState.Companion.unmapped: GPUBufferMapState
    get() = unsafeCast("unmapped")
