// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUStoreOp {
    companion object {
        @JsValue("store")
        val store: GPUStoreOp

        @JsValue("discard")
        val discard: GPUStoreOp
    }
}
