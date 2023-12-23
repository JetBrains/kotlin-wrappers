// Automatically generated - do not modify!

package web.canvas

import seskar.js.JsValue
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext)
 */
sealed external class ImageBitmapRenderingContext :
    OffscreenRenderingContext,
    RenderingContext {
    /**
     * Returns the canvas element that the context is bound to.
     */
    val canvas: Any /* HTMLCanvasElement | OffscreenCanvas */

    /**
     * Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap)
     */
    fun transferFromImageBitmap(bitmap: ImageBitmap?)

    companion object {
        @JsValue("bitmaprenderer")
        val ID: RenderingContextId<ImageBitmapRenderingContext, ImageBitmapRenderingContextSettings>
    }
}
