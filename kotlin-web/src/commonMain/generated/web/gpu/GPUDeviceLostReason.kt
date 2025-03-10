// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUDeviceLostReason {
    companion object {
        @JsValue("destroyed")
        val destroyed: GPUDeviceLostReason

        @JsValue("unknown")
        val unknown: GPUDeviceLostReason
    }
}
