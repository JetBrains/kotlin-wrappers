// Automatically generated - do not modify!

package web.canvas

import js.core.JsAny
import js.core.UInt53
import js.promise.Promise
import js.promise.await
import js.serialization.Transferable
import web.blob.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import web.images.ImageBitmap
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContextId
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * When using the canvas element or the Canvas API, rendering, animation, and user interaction usually happen on the main execution thread of a web application.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas)
 */
open external class OffscreenCanvas(
    /**
     * The **`width`** property returns and sets the width of an OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/width)
     */
    var width: UInt53,
    /**
     * The **`height`** property returns and sets the height of an OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/height)
     */
    var height: UInt53,
) : EventTarget,
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextlost_event)
     */
    var oncontextlost: EventHandler<Event, OffscreenCanvas, OffscreenCanvas>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextrestored_event)
     */
    var oncontextrestored: EventHandler<Event, OffscreenCanvas, OffscreenCanvas>?

    /**
     * The **`OffscreenCanvas.convertToBlob()`** method creates a Blob object representing the image contained in the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
     */
    @JsName("convertToBlob")
    fun convertToBlobAsync(options: ImageEncodeOptions = definedExternally): Promise<Blob>

    /**
     * The **`OffscreenCanvas.getContext()`** method returns a drawing context for an offscreen canvas, or `null` if the context identifier is not supported, or the offscreen canvas has already been set to a different context mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/getContext)
     */
    fun <T : OffscreenRenderingContext, O : JsAny> getContext(
        contextId: RenderingContextId<T, O>,
        options: O? = definedExternally,
    ): T?

    /**
     * The **`OffscreenCanvas.transferToImageBitmap()`** method creates an ImageBitmap object from the most recently rendered image of the `OffscreenCanvas`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/transferToImageBitmap)
     */
    fun transferToImageBitmap(): ImageBitmap
}

/**
 * The **`OffscreenCanvas.convertToBlob()`** method creates a Blob object representing the image contained in the canvas.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
 */
suspend inline fun OffscreenCanvas.convertToBlob(options: ImageEncodeOptions): Blob {
    return convertToBlobAsync(options = options).await()
}

/**
 * The **`OffscreenCanvas.convertToBlob()`** method creates a Blob object representing the image contained in the canvas.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
 */
suspend inline fun OffscreenCanvas.convertToBlob(): Blob {
    return convertToBlobAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextlost_event)
 */
inline val <C : OffscreenCanvas> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "contextlost")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextrestored_event)
 */
inline val <C : OffscreenCanvas> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "contextrestored")
