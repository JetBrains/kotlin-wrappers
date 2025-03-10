// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUCompilationMessageType {
    companion object {
        @JsValue("error")
        val error: GPUCompilationMessageType

        @JsValue("info")
        val info: GPUCompilationMessageType

        @JsValue("warning")
        val warning: GPUCompilationMessageType
    }
}
