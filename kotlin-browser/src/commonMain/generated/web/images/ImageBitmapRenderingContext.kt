// Automatically generated - do not modify!

package web.images

import seskar.js.JsValue
import web.events.EventTarget
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`ImageBitmapRenderingContext`** interface is a canvas rendering context that provides the functionality to replace the canvas's contents with the given ImageBitmap.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext)
 */
external class ImageBitmapRenderingContext
private constructor() :
    OffscreenRenderingContext,
    RenderingContext {
    /**
     * The **`ImageBitmapRenderingContext.canvas`** property, part of the Canvas API, is a read-only reference to the A HTMLCanvasElement or OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/canvas)
     */
    val canvas: EventTarget /* HTMLCanvasElement | OffscreenCanvas */

    /**
     * The **`ImageBitmapRenderingContext.transferFromImageBitmap()`** method displays the given ImageBitmap in the canvas associated with this rendering context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap)
     */
    fun transferFromImageBitmap(bitmap: ImageBitmap?)

    companion object {
        @JsValue("bitmaprenderer")
        val ID: RenderingContextId<ImageBitmapRenderingContext, ImageBitmapRenderingContextSettings>
    }
}
