// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
