// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
