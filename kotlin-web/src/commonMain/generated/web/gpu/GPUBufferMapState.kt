// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
