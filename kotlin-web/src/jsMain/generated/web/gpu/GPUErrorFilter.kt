// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUErrorFilter {
    companion object {
        @JsValue("out-of-memory")
        val outOfMemory: GPUErrorFilter

        @JsValue("validation")
        val validation: GPUErrorFilter

        @JsValue("internal")
        val internal: GPUErrorFilter
    }
}
