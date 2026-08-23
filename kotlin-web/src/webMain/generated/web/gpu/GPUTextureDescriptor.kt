// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#descriptor)
 */
@JsPlainObject
external interface GPUTextureDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#dimension)
     */
    var dimension: GPUTextureDimension?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#format)
     */
    var format: GPUTextureFormat

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#mipLevelCount)
     */
    var mipLevelCount: GPUIntegerCoordinate?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#sampleCount)
     */
    var sampleCount: GPUSize32?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#size)
     */
    var size: GPUExtent3D

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#usage)
     */
    var usage: GPUTextureUsage

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture#viewFormats)
     */
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
}
