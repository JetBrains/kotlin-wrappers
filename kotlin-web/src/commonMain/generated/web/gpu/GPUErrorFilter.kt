// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUErrorFilter {
    companion object {
        @JsValue("internal")
        val internal: GPUErrorFilter

        @JsValue("out-of-memory")
        val outOfMemory: GPUErrorFilter

        @JsValue("validation")
        val validation: GPUErrorFilter
    }
}
