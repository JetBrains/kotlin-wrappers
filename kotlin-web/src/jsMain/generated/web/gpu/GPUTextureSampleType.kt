// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUTextureSampleType {
    companion object {
        @JsValue("float")
        val float: GPUTextureSampleType

        @JsValue("unfilterable-float")
        val unfilterableFloat: GPUTextureSampleType

        @JsValue("depth")
        val depth: GPUTextureSampleType

        @JsValue("sint")
        val sint: GPUTextureSampleType

        @JsValue("uint")
        val uint: GPUTextureSampleType
    }
}
