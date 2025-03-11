// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
