// Automatically generated - do not modify!

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
