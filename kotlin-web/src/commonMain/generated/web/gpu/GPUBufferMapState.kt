// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

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
