// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPULoadOp {
    companion object {
        @JsValue("load")
        val load: GPULoadOp

        @JsValue("clear")
        val clear: GPULoadOp
    }
}
