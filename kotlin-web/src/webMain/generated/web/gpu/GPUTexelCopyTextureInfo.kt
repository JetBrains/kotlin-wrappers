// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture#destination)
 */
@JsPlainObject
external interface GPUTexelCopyTextureInfo {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture#aspect)
     */
    var aspect: GPUTextureAspect?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture#miplevel)
     */
    var mipLevel: GPUIntegerCoordinate?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture#origin)
     */
    var origin: GPUOrigin3D?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/copyBufferToTexture#texture)
     */
    var texture: GPUTexture
}
