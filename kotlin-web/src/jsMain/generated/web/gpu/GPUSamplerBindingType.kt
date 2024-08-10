// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUSamplerBindingType {
    companion object {
        @JsValue("filtering")
        val filtering: GPUSamplerBindingType

        @JsValue("non-filtering")
        val nonFiltering: GPUSamplerBindingType

        @JsValue("comparison")
        val comparison: GPUSamplerBindingType
    }
}
