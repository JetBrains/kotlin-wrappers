// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUMipmapFilterMode {
    companion object {
        @JsValue("linear")
        val linear: GPUMipmapFilterMode

        @JsValue("nearest")
        val nearest: GPUMipmapFilterMode
    }
}
