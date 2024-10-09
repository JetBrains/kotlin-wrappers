// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUSamplerDescriptor :
    GPUObjectDescriptorBase {
    val addressModeU: GPUAddressMode?
    val addressModeV: GPUAddressMode?
    val addressModeW: GPUAddressMode?
    val magFilter: GPUFilterMode?
    val minFilter: GPUFilterMode?
    val mipmapFilter: GPUMipmapFilterMode?
    val lodMinClamp: Float?
    val lodMaxClamp: Float?
    val compare: GPUCompareFunction?
    val maxAnisotropy: Short?
}
