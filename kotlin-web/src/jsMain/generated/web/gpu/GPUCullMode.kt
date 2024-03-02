// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUCullMode {
    companion object {
        @JsValue("none")
        val none: GPUCullMode

        @JsValue("front")
        val front: GPUCullMode

        @JsValue("back")
        val back: GPUCullMode
    }
}
