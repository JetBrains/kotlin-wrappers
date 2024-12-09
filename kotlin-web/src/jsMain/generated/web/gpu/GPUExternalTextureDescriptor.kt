// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject
import web.canvas.CanvasImageSource
import web.images.PredefinedColorSpace

@JsPlainObject
external interface GPUExternalTextureDescriptor :
    GPUObjectDescriptorBase {
    val colorSpace: PredefinedColorSpace?
    val source: CanvasImageSource /* HTMLVideoElement | VideoFrame */
}
