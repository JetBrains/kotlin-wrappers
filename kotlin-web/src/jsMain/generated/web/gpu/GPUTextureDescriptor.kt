// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUTextureDescriptor :
    GPUObjectDescriptorBase {
    val size: GPUExtent3D
    val mipLevelCount: GPUIntegerCoordinate?
    val sampleCount: GPUSize32?
    val dimension: GPUTextureDimension?
    val format: GPUTextureFormat
    val usage: GPUTextureUsage
    val viewFormats: ReadonlyArray<GPUTextureFormat>?
}
