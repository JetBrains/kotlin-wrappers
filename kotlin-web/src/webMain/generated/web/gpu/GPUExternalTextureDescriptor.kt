// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject
import web.canvas.CanvasImageSource
import web.images.PredefinedColorSpace

@JsPlainObject
external interface GPUExternalTextureDescriptor :
    GPUObjectDescriptorBase {
    var colorSpace: PredefinedColorSpace?
    var source: CanvasImageSource /* HTMLVideoElement | VideoFrame */
}
