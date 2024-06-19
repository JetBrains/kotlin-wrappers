// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUBlendOperation {
    companion object {
        @JsValue("add")
        val add: GPUBlendOperation

        @JsValue("subtract")
        val subtract: GPUBlendOperation

        @JsValue("reverse-subtract")
        val reverseSubtract: GPUBlendOperation

        @JsValue("min")
        val min: GPUBlendOperation

        @JsValue("max")
        val max: GPUBlendOperation
    }
}
