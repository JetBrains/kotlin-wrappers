// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
