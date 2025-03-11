// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUPipelineErrorReason {
    companion object {
        @JsValue("internal")
        val internal: GPUPipelineErrorReason

        @JsValue("validation")
        val validation: GPUPipelineErrorReason
    }
}
