// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
