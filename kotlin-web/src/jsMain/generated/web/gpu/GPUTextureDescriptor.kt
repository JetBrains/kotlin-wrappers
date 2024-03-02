// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray

sealed external interface GPUTextureDescriptor :
    GPUObjectDescriptorBase {
    var size: GPUExtent3D
    var mipLevelCount: Number?
    var sampleCount: Number?
    var dimension: GPUTextureDimension?
    var format: GPUTextureFormat
    var usage: GPUTextureUsageFlags
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
}
