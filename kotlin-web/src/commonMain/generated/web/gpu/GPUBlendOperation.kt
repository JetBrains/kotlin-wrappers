// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUBlendOperation {
    companion object {
        @JsValue("add")
        val add: GPUBlendOperation

        @JsValue("max")
        val max: GPUBlendOperation

        @JsValue("min")
        val min: GPUBlendOperation

        @JsValue("reverse-subtract")
        val reverseSubtract: GPUBlendOperation

        @JsValue("subtract")
        val subtract: GPUBlendOperation
    }
}
