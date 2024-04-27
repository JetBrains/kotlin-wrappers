// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUCompilationMessageType {
    companion object {
        @JsValue("error")
        val error: GPUCompilationMessageType

        @JsValue("warning")
        val warning: GPUCompilationMessageType

        @JsValue("info")
        val info: GPUCompilationMessageType
    }
}
