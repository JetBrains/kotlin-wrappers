// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUBufferMapState {
    companion object
}

inline val GPUBufferMapState.Companion.mapped: GPUBufferMapState
    get() = unsafeCast("mapped")

inline val GPUBufferMapState.Companion.pending: GPUBufferMapState
    get() = unsafeCast("pending")

inline val GPUBufferMapState.Companion.unmapped: GPUBufferMapState
    get() = unsafeCast("unmapped")
