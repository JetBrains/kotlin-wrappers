// Automatically generated - do not modify!

package web.images

import js.reflect.unsafeCast
import web.events.EventTarget
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`ImageBitmapRenderingContext`** interface is a canvas rendering context that provides the functionality to replace the canvas's contents with the given ImageBitmap. Its context id (the first argument to HTMLCanvasElement.getContext() or OffscreenCanvas.getContext()) is "bitmaprenderer".
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext)
 */
open external class ImageBitmapRenderingContext
private constructor() :
    OffscreenRenderingContext,
    RenderingContext {
    /**
     * The **`ImageBitmapRenderingContext.canvas`** property, part of the Canvas API, is a read-only reference to the HTMLCanvasElement or OffscreenCanvas object that is associated with the given context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/canvas)
     */
    val canvas: EventTarget /* HTMLCanvasElement | OffscreenCanvas */

    /**
     * The **`ImageBitmapRenderingContext.transferFromImageBitmap()`** method displays the given ImageBitmap in the canvas associated with this rendering context. The ownership of the ImageBitmap is transferred to the canvas as well.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap)
     */
    fun transferFromImageBitmap(bitmap: ImageBitmap?)

    companion object
}

inline val ImageBitmapRenderingContext.Companion.ID: RenderingContextId<ImageBitmapRenderingContext, ImageBitmapRenderingContextSettings>
    get() = unsafeCast("bitmaprenderer")
