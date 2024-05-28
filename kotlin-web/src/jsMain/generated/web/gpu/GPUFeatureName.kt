// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUFeatureName {
    companion object {
        @JsValue("depth-clip-control")
        val depthClipControl: GPUFeatureName

        @JsValue("depth32float-stencil8")
        val depth32floatStencil8: GPUFeatureName

        @JsValue("pipeline-statistics-query")
        val pipelineStatisticsQuery: GPUFeatureName

        @JsValue("texture-compression-bc")
        val textureCompressionBc: GPUFeatureName

        @JsValue("texture-compression-etc2")
        val textureCompressionEtc2: GPUFeatureName

        @JsValue("texture-compression-astc")
        val textureCompressionAstc: GPUFeatureName

        @JsValue("timestamp-query")
        val timestampQuery: GPUFeatureName

        @JsValue("indirect-first-instance")
        val indirectFirstInstance: GPUFeatureName

        @JsValue("shader-f16")
        val shaderF16: GPUFeatureName

        @JsValue("rg11b10ufloat-renderable")
        val rg11b10ufloatRenderable: GPUFeatureName

        @JsValue("bgra8unorm-storage")
        val bgra8unormStorage: GPUFeatureName

        @JsValue("float32-filterable")
        val float32Filterable: GPUFeatureName

        @JsValue("mappable-primary-buffers")
        val mappablePrimaryBuffers: GPUFeatureName

        @JsValue("sampled-texture-binding-array")
        val sampledTextureBindingArray: GPUFeatureName

        @JsValue("sampled-texture-array-dynamic-indexing")
        val sampledTextureArrayDynamicIndexing: GPUFeatureName

        @JsValue("sampled-texture-array-non-uniform-indexing")
        val sampledTextureArrayNonUniformIndexing: GPUFeatureName

        @JsValue("unsized-binding-array")
        val unsizedBindingArray: GPUFeatureName

        @JsValue("multi-draw-indirect")
        val multiDrawIndirect: GPUFeatureName

        @JsValue("multi-draw-indirect-count")
        val multiDrawIndirectCount: GPUFeatureName

        @JsValue("push-constants")
        val pushConstants: GPUFeatureName

        @JsValue("address-mode-clamp-to-border")
        val addressModeClampToBorder: GPUFeatureName

        @JsValue("texture-adapter-specific-format-features")
        val textureAdapterSpecificFormatFeatures: GPUFeatureName

        @JsValue("shader-float64")
        val shaderFloat64: GPUFeatureName

        @JsValue("vertex-attribute-64bit")
        val vertexAttribute64bit: GPUFeatureName
    }
}
