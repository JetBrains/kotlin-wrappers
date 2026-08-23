// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#descriptor)
 */
@JsPlainObject
external interface GPUTextureViewDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#arrayLayerCount)
     */
    var arrayLayerCount: GPUIntegerCoordinate?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#aspect)
     */
    var aspect: GPUTextureAspect?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#baseArrayLayer)
     */
    var baseArrayLayer: GPUIntegerCoordinate?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#baseMipLevel)
     */
    var baseMipLevel: GPUIntegerCoordinate?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#dimension)
     */
    var dimension: GPUTextureViewDimension?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#format)
     */
    var format: GPUTextureFormat?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#mipLevelCount)
     */
    var mipLevelCount: GPUIntegerCoordinate?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/createView#usage)
     */
    var usage: GPUTextureUsage?
}
