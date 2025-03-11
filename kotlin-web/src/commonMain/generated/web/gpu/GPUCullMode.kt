// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUCullMode {
    companion object {
        @JsValue("back")
        val back: GPUCullMode

        @JsValue("front")
        val front: GPUCullMode

        @JsValue("none")
        val none: GPUCullMode
    }
}
