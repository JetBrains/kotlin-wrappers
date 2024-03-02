// Automatically generated - do not modify!

package web.gpu

sealed external interface GPUTextureViewDescriptor :
    GPUObjectDescriptorBase {
    var format: GPUTextureFormat?
    var dimension: GPUTextureViewDimension?
    var aspect: GPUTextureAspect?
    var baseMipLevel: Number?
    var mipLevelCount: Number?
    var baseArrayLayer: Number?
    var arrayLayerCount: Number?
}
