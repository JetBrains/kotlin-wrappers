// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
external interface GPUSamplerDescriptor :
    GPUObjectDescriptorBase {
    val addressModeU: GPUAddressMode?
    val addressModeV: GPUAddressMode?
    val addressModeW: GPUAddressMode?
    val compare: GPUCompareFunction?
    val lodMaxClamp: Float?
    val lodMinClamp: Float?
    val magFilter: GPUFilterMode?
    val maxAnisotropy: UShort?
    val minFilter: GPUFilterMode?
    val mipmapFilter: GPUMipmapFilterMode?
}
