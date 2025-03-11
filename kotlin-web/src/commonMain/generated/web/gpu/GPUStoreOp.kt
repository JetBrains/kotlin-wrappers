// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUStoreOp {
    companion object {
        @JsValue("discard")
        val discard: GPUStoreOp

        @JsValue("store")
        val store: GPUStoreOp
    }
}
