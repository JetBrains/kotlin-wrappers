// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUFrontFace {
    companion object {
        @JsValue("ccw")
        val ccw: GPUFrontFace

        @JsValue("cw")
        val cw: GPUFrontFace
    }
}
