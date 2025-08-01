// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface GPUTextureDescriptor :
    GPUObjectDescriptorBase {
    var dimension: GPUTextureDimension?
    var format: GPUTextureFormat
    var mipLevelCount: GPUIntegerCoordinate?
    var sampleCount: GPUSize32?
    var size: GPUExtent3D
    var usage: GPUTextureUsageFlags
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
}
