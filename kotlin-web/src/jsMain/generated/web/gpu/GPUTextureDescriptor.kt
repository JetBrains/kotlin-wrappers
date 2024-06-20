// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUTextureDescriptor :
    GPUObjectDescriptorBase {
    var size: GPUExtent3D
    var mipLevelCount: GPUIntegerCoordinate?
    var sampleCount: GPUSize32?
    var dimension: GPUTextureDimension?
    var format: GPUTextureFormat
    var usage: GPUTextureUsage
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
}
