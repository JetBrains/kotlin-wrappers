// Automatically generated - do not modify!

package web.html

import web.canvas.CanvasImageSource
import web.canvas.OffscreenCanvas
import web.events.Event
import web.events.EventInstance
import web.gl.TexImageSource
import web.gl.WebGLContextEvent
import web.gpu.GPUCopyExternalImageSource
import web.mediastreams.MediaStream
import web.rendering.RenderingContext
import web.rendering.RenderingContextId
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`HTMLCanvasElement`** interface provides properties and methods for manipulating the layout and presentation of canvas elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement)
 */
open external class HTMLCanvasElement
protected constructor() :
    HTMLElement,
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource {
    /**
     * The **`HTMLCanvasElement.height`** property is a positive `integer` reflecting the `height` HTML attribute of the canvas element interpreted in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/height)
     */
    var height: Int

    /**
     * The **`HTMLCanvasElement.width`** property is a positive `integer` reflecting the `width` HTML attribute of the canvas element interpreted in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/width)
     */
    var width: Int

    /**
     * The **`captureStream()`** method of the HTMLCanvasElement interface returns a MediaStream which includes a CanvasCaptureMediaStreamTrack containing a real-time video capture of the canvas's contents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream)
     */
    fun captureStream(frameRequestRate: Double = definedExternally): MediaStream

    /**
     * The **`HTMLCanvasElement.getContext()`** method returns a drawing context on the canvas, or `null` if the context identifier is not supported, or the canvas has already been set to a different context mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/getContext)
     */
    fun <T : RenderingContext, O : JsAny> getContext(
        contextId: RenderingContextId<T, O>,
        options: O? = definedExternally,
    ): T?

    /**
     * The **`HTMLCanvasElement.toBlob()`** method creates a Blob object representing the image contained in the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
     */
    fun toBlob(
        callback: BlobCallback,
        type: String = definedExternally,
        quality: Double = definedExternally,
    )

    /**
     * The **`HTMLCanvasElement.toDataURL()`** method returns a data URL containing a representation of the image in the format specified by the `type` parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toDataURL)
     */
    fun toDataURL(
        type: String = definedExternally,
        quality: Double = definedExternally,
    ): String

    /**
     * The **`HTMLCanvasElement.transferControlToOffscreen()`** method transfers control to an OffscreenCanvas object, either on the main thread or on a worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen)
     */
    fun transferControlToOffscreen(): OffscreenCanvas
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextlost_event)
 */
inline val <C : HTMLCanvasElement> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "contextlost")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextrestored_event)
 */
inline val <C : HTMLCanvasElement> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "contextrestored")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/webglcontextcreationerror_event)
 */
inline val <C : HTMLCanvasElement> C.webglContextCreationErrorEvent: EventInstance<WebGLContextEvent, C, C>
    get() = EventInstance(this, "webglcontextcreationerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/webglcontextlost_event)
 */
inline val <C : HTMLCanvasElement> C.webglContextLostEvent: EventInstance<WebGLContextEvent, C, C>
    get() = EventInstance(this, "webglcontextlost")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/webglcontextrestored_event)
 */
inline val <C : HTMLCanvasElement> C.webglContextRestoredEvent: EventInstance<WebGLContextEvent, C, C>
    get() = EventInstance(this, "webglcontextrestored")
