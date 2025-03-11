// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUFilterMode {
    companion object {
        @JsValue("linear")
        val linear: GPUFilterMode

        @JsValue("nearest")
        val nearest: GPUFilterMode
    }
}
