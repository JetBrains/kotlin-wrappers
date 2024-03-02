// Automatically generated - do not modify!

package web.gpu

sealed external interface GPUSamplerDescriptor :
    GPUObjectDescriptorBase {
    var addressModeU: GPUAddressMode?
    var addressModeV: GPUAddressMode?
    var addressModeW: GPUAddressMode?
    var magFilter: GPUFilterMode?
    var minFilter: GPUFilterMode?
    var mipmapFilter: GPUMipmapFilterMode?
    var lodMinClamp: Float?
    var lodMaxClamp: Float?
    var compare: GPUCompareFunction?
    var maxAnisotropy: Short?
}
