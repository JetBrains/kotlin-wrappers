// Automatically generated - do not modify!

package web.gpu

sealed external class GPUTexture :
    GPUObjectBase {
    override var label: String
    fun createView(descriptor: GPUTextureViewDescriptor = definedExternally): GPUTextureView
    fun destroy()
    val width: Number
    val height: Number
    val depthOrArrayLayers: Number
    val mipLevelCount: Number
    val sampleCount: Number
    val dimension: GPUTextureDimension
    val format: GPUTextureFormat
    val usage: GPUFlagsConstant
}
