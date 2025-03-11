// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUAddressMode {
    companion object {
        @JsValue("clamp-to-edge")
        val clampToEdge: GPUAddressMode

        @JsValue("mirror-repeat")
        val mirrorRepeat: GPUAddressMode

        @JsValue("repeat")
        val repeat: GPUAddressMode
    }
}
