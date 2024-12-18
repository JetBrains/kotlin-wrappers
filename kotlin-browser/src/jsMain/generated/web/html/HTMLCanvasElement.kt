// Automatically generated - do not modify!

package web.html

import web.canvas.CanvasImageSource
import web.canvas.OffscreenCanvas
import web.events.Event
import web.events.EventInstance
import web.events.JsEvent
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import web.media.streams.MediaStream
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * Provides properties and methods for manipulating the layout and presentation of <canvas> elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface.
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
     * Gets or sets the height of a canvas element on a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/height)
     */
    var height: Int

    /**
     * Gets or sets the width of a canvas element on a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/width)
     */
    var width: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/captureStream)
     */
    fun captureStream(frameRequestRate: Double = definedExternally): MediaStream

    /**
     * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
     * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/getContext)
     */
    fun <T : RenderingContext, O : Any> getContext(
        contextId: RenderingContextId<T, O>,
        options: O? = definedExternally,
    ): T?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
     */
    fun toBlob(
        callback: BlobCallback,
        type: String = definedExternally,
        quality: Double = definedExternally,
    )

    /**
     * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
     * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toDataURL)
     */
    fun toDataURL(
        type: String = definedExternally,
        quality: Double = definedExternally,
    ): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen)
     */
    fun transferControlToOffscreen(): OffscreenCanvas

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextlost_event)
     */
    @JsEvent("contextlost")
    val contextLostEvent: EventInstance<Event, HTMLCanvasElement /* this */, HTMLCanvasElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextrestored_event)
     */
    @JsEvent("contextrestored")
    val contextRestoredEvent: EventInstance<Event, HTMLCanvasElement /* this */, HTMLCanvasElement /* this */>
}
