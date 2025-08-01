// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUFeatureName {
    companion object
}

inline val GPUFeatureName.Companion.bgra8unormStorage: GPUFeatureName
    get() = unsafeCast("bgra8unorm-storage")

inline val GPUFeatureName.Companion.depthClipControl: GPUFeatureName
    get() = unsafeCast("depth-clip-control")

inline val GPUFeatureName.Companion.depth32floatStencil8: GPUFeatureName
    get() = unsafeCast("depth32float-stencil8")

inline val GPUFeatureName.Companion.float32Filterable: GPUFeatureName
    get() = unsafeCast("float32-filterable")

inline val GPUFeatureName.Companion.indirectFirstInstance: GPUFeatureName
    get() = unsafeCast("indirect-first-instance")

inline val GPUFeatureName.Companion.rg11b10ufloatRenderable: GPUFeatureName
    get() = unsafeCast("rg11b10ufloat-renderable")

inline val GPUFeatureName.Companion.shaderF16: GPUFeatureName
    get() = unsafeCast("shader-f16")

inline val GPUFeatureName.Companion.textureCompressionAstc: GPUFeatureName
    get() = unsafeCast("texture-compression-astc")

inline val GPUFeatureName.Companion.textureCompressionBc: GPUFeatureName
    get() = unsafeCast("texture-compression-bc")

inline val GPUFeatureName.Companion.textureCompressionEtc2: GPUFeatureName
    get() = unsafeCast("texture-compression-etc2")

inline val GPUFeatureName.Companion.timestampQuery: GPUFeatureName
    get() = unsafeCast("timestamp-query")
