// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUTextureSampleType {
    companion object {
        @JsValue("depth")
        val depth: GPUTextureSampleType

        @JsValue("float")
        val float: GPUTextureSampleType

        @JsValue("sint")
        val sint: GPUTextureSampleType

        @JsValue("uint")
        val uint: GPUTextureSampleType

        @JsValue("unfilterable-float")
        val unfilterableFloat: GPUTextureSampleType
    }
}
