// Automatically generated - do not modify!

package web.gpu

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture)
 */
external class GPUTexture
private constructor() :
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/depthOrArrayLayers)
     */
    val depthOrArrayLayers: GPUIntegerCoordinateOut

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/dimension)
     */
    val dimension: GPUTextureDimension

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/format)
     */
    val format: GPUTextureFormat

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/height)
     */
    val height: GPUIntegerCoordinateOut

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/mipLevelCount)
     */
    val mipLevelCount: GPUIntegerCoordinateOut

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/sampleCount)
     */
    val sampleCount: GPUSize32Out

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/usage)
     */
    val usage: GPUFlagsConstant

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/width)
     */
    val width: GPUIntegerCoordinateOut

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView)
     */
    fun createView(descriptor: GPUTextureViewDescriptor = definedExternally): GPUTextureView

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/destroy)
     */
    fun destroy()
}
