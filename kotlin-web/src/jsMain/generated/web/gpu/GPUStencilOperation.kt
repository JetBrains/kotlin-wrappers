// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUStencilOperation {
    companion object {
        @JsValue("keep")
        val keep: GPUStencilOperation

        @JsValue("zero")
        val zero: GPUStencilOperation

        @JsValue("replace")
        val replace: GPUStencilOperation

        @JsValue("invert")
        val invert: GPUStencilOperation

        @JsValue("increment-clamp")
        val incrementClamp: GPUStencilOperation

        @JsValue("decrement-clamp")
        val decrementClamp: GPUStencilOperation

        @JsValue("increment-wrap")
        val incrementWrap: GPUStencilOperation

        @JsValue("decrement-wrap")
        val decrementWrap: GPUStencilOperation
    }
}
