// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUSamplerBindingType {
    companion object {
        @JsValue("comparison")
        val comparison: GPUSamplerBindingType

        @JsValue("filtering")
        val filtering: GPUSamplerBindingType

        @JsValue("non-filtering")
        val nonFiltering: GPUSamplerBindingType
    }
}
