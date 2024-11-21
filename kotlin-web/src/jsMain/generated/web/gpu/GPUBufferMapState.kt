// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUBufferMapState {
    companion object {
        @JsValue("mapped")
        val mapped: GPUBufferMapState

        @JsValue("pending")
        val pending: GPUBufferMapState

        @JsValue("unmapped")
        val unmapped: GPUBufferMapState
    }
}
