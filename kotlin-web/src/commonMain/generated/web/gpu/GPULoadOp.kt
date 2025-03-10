// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPULoadOp {
    companion object {
        @JsValue("clear")
        val clear: GPULoadOp

        @JsValue("load")
        val load: GPULoadOp
    }
}
