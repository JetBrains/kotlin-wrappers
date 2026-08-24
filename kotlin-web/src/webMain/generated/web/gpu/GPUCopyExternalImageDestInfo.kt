// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject
import web.images.PredefinedColorSpace

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/copyExternalImageToTexture#destination)
 */
@JsPlainObject
external interface GPUCopyExternalImageDestInfo :
    GPUTexelCopyTextureInfo {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/copyExternalImageToTexture#colorspace)
     */
    var colorSpace: PredefinedColorSpace?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQueue/copyExternalImageToTexture#premultipliedalpha)
     */
    var premultipliedAlpha: Boolean?
}
