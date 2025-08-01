// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUStoreOp {
    companion object
}

inline val GPUStoreOp.Companion.discard: GPUStoreOp
    get() = unsafeCast("discard")

inline val GPUStoreOp.Companion.store: GPUStoreOp
    get() = unsafeCast("store")
