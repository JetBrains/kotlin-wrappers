// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUPipelineErrorReason {
    companion object {
        @JsValue("validation")
        val validation: GPUPipelineErrorReason

        @JsValue("internal")
        val internal: GPUPipelineErrorReason
    }
}
