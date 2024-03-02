// Automatically generated - do not modify!

package web.gpu

sealed external interface GPUTextureViewDescriptor :
    GPUObjectDescriptorBase {
    var format: GPUTextureFormat?
    var dimension: GPUTextureViewDimension?
    var aspect: GPUTextureAspect?
    var baseMipLevel: GPUIntegerCoordinate?
    var mipLevelCount: GPUIntegerCoordinate?
    var baseArrayLayer: GPUIntegerCoordinate?
    var arrayLayerCount: GPUIntegerCoordinate?
}
