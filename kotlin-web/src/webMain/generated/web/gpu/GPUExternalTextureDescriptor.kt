// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject
import web.canvas.CanvasImageSource
import web.images.PredefinedColorSpace

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/importExternalTexture#descriptor)
 */
@JsPlainObject
external interface GPUExternalTextureDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/importExternalTexture#colorSpace)
     */
    var colorSpace: PredefinedColorSpace?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/importExternalTexture#source)
     */
    var source: CanvasImageSource /* HTMLVideoElement | VideoFrame */
}
