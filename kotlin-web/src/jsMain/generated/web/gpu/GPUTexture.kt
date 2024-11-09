// Automatically generated - do not modify!

package web.gpu

external class GPUTexture
private constructor() :
    GPUObjectBase {
    override var label: String
    fun createView(descriptor: GPUTextureViewDescriptor = definedExternally): GPUTextureView
    fun destroy()
    val width: GPUIntegerCoordinateOut
    val height: GPUIntegerCoordinateOut
    val depthOrArrayLayers: GPUIntegerCoordinateOut
    val mipLevelCount: GPUIntegerCoordinateOut
    val sampleCount: GPUSize32Out
    val dimension: GPUTextureDimension
    val format: GPUTextureFormat
    val usage: GPUUsage
}
