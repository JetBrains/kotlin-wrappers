// Automatically generated - do not modify!

package web.canvas

import js.core.JsLong
import js.promise.Promise
import js.transferable.Transferable
import seskar.js.JsAsync
import web.blob.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.gl.TexImageSource
import web.images.ImageBitmap
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContextId

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas)
 */
external class OffscreenCanvas(
    width: JsLong,
    height: JsLong,
) : EventTarget,
    CanvasImageSource,
    TexImageSource,
    Transferable {
    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     *
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/height)
     */
    var height: JsLong
    var oncontextlost: EventHandler<Event, OffscreenCanvas>?
    var oncontextrestored: EventHandler<Event, OffscreenCanvas>?

    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     *
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/width)
     */
    var width: JsLong

    /**
     * Returns a promise that will fulfill with a new Blob object representing a file containing the image in the OffscreenCanvas object.
     *
     * The argument, if provided, is a dictionary that controls the encoding options of the image file to be created. The type field specifies the file format and has a default value of "image/png"; that type is also used if the requested type isn't supported. If the image format supports variable quality (such as "image/jpeg"), then the quality field is a number in the range 0.0 to 1.0 inclusive indicating the desired quality level for the resulting image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
     */
    @JsAsync
    suspend fun convertToBlob(options: ImageEncodeOptions = definedExternally): Blob

    @JsName("convertToBlob")
    fun convertToBlobAsync(options: ImageEncodeOptions = definedExternally): Promise<Blob>

    /**
     * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
     *
     * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
     *
     * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/getContext)
     */
    fun <T : OffscreenRenderingContext, O : Any> getContext(
        contextId: RenderingContextId<T, O>,
        options: O? = definedExternally,
    ): T?

    /**
     * Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/transferToImageBitmap)
     */
    fun transferToImageBitmap(): ImageBitmap
}
