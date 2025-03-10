// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUStencilOperation {
    companion object {
        @JsValue("decrement-clamp")
        val decrementClamp: GPUStencilOperation

        @JsValue("decrement-wrap")
        val decrementWrap: GPUStencilOperation

        @JsValue("increment-clamp")
        val incrementClamp: GPUStencilOperation

        @JsValue("increment-wrap")
        val incrementWrap: GPUStencilOperation

        @JsValue("invert")
        val invert: GPUStencilOperation

        @JsValue("keep")
        val keep: GPUStencilOperation

        @JsValue("replace")
        val replace: GPUStencilOperation

        @JsValue("zero")
        val zero: GPUStencilOperation
    }
}
