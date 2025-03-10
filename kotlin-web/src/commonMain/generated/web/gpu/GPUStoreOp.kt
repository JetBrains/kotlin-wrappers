// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
