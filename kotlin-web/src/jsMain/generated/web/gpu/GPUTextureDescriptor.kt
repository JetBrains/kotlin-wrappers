// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface GPUTextureDescriptor :
    GPUObjectDescriptorBase {
    val dimension: GPUTextureDimension?
    val format: GPUTextureFormat
    val mipLevelCount: GPUIntegerCoordinate?
    val sampleCount: GPUSize32?
    val size: GPUExtent3D
    val usage: GPUTextureUsageFlags
    val viewFormats: ReadonlyArray<GPUTextureFormat>?
}
