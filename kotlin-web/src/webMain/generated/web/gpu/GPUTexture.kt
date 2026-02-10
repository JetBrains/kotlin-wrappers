// Automatically generated - do not modify!

package web.gpu

import kotlin.js.definedExternally

/**
 * The **`GPUTexture`** interface of the WebGPU API represents a container used to store 1D, 2D, or 3D arrays of data, such as images, to use in GPU rendering operations.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture)
 */
open external class GPUTexture
private constructor() :
    GPUObjectBase,
    GPUBindingResource {
    /**
     * The **`depthOrArrayLayers`** read-only property of the GPUTexture interface represents the depth or layer count of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/depthOrArrayLayers)
     */
    val depthOrArrayLayers: GPUIntegerCoordinateOut

    /**
     * The **`dimension`** read-only property of the GPUTexture interface represents the dimension of the set of texels for each GPUTexture subresource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/dimension)
     */
    val dimension: GPUTextureDimension

    /**
     * The **`format`** read-only property of the GPUTexture interface represents the format of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/format)
     */
    val format: GPUTextureFormat

    /**
     * The **`height`** read-only property of the GPUTexture interface represents the height of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/height)
     */
    val height: GPUIntegerCoordinateOut

    /**
     * The **`mipLevelCount`** read-only property of the GPUTexture interface represents the number of mip levels of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/mipLevelCount)
     */
    val mipLevelCount: GPUIntegerCoordinateOut

    /**
     * The **`sampleCount`** read-only property of the GPUTexture interface represents the sample count of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/sampleCount)
     */
    val sampleCount: GPUSize32Out

    /**
     * The **`usage`** read-only property of the GPUTexture interface is the bitwise flags representing the allowed usages of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/usage)
     */
    val usage: GPUFlagsConstant

    /**
     * The **`width`** read-only property of the GPUTexture interface represents the width of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/width)
     */
    val width: GPUIntegerCoordinateOut

    /**
     * The **`createView()`** method of the GPUTexture interface creates a GPUTextureView representing a specific view of the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView)
     */
    fun createView(descriptor: GPUTextureViewDescriptor = definedExternally): GPUTextureView

    /**
     * The **`destroy()`** method of the GPUTexture interface destroys the GPUTexture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/destroy)
     */
    fun destroy()
}
