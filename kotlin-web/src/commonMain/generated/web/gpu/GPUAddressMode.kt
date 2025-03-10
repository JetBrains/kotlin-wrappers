// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
