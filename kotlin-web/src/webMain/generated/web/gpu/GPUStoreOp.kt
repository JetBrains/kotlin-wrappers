// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUStoreOp

inline val GPUStoreOp.Companion.discard: GPUStoreOp
    get() = unsafeCast("discard")

inline val GPUStoreOp.Companion.store: GPUStoreOp
    get() = unsafeCast("store")
