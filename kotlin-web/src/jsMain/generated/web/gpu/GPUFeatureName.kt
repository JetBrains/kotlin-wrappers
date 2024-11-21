// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUFeatureName {
    companion object {
        @JsValue("bgra8unorm-storage")
        val bgra8unormStorage: GPUFeatureName

        @JsValue("depth-clip-control")
        val depthClipControl: GPUFeatureName

        @JsValue("depth32float-stencil8")
        val depth32floatStencil8: GPUFeatureName

        @JsValue("float32-filterable")
        val float32Filterable: GPUFeatureName

        @JsValue("indirect-first-instance")
        val indirectFirstInstance: GPUFeatureName

        @JsValue("rg11b10ufloat-renderable")
        val rg11b10ufloatRenderable: GPUFeatureName

        @JsValue("shader-f16")
        val shaderF16: GPUFeatureName

        @JsValue("texture-compression-astc")
        val textureCompressionAstc: GPUFeatureName

        @JsValue("texture-compression-bc")
        val textureCompressionBc: GPUFeatureName

        @JsValue("texture-compression-etc2")
        val textureCompressionEtc2: GPUFeatureName

        @JsValue("timestamp-query")
        val timestampQuery: GPUFeatureName
    }
}
