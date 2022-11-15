// Automatically generated - do not modify!

package canvas

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

external class OffscreenCanvas(
    width: Number,
    height: Number,
) : EventTarget {
    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     *
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     */
    var height: Double
    var oncontextlost: EventHandler<Event>?
    var oncontextrestored: EventHandler<Event>?

    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     *
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     */
    var width: Double

    /**
     * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
     *
     * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
     *
     * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
     */
    fun getContext(
        contextId: OffscreenRenderingContextId,
        options: Any? = definedExternally,
    ): Any /* OffscreenRenderingContext */?

    /** Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image. */
    fun transferToImageBitmap(): ImageBitmap
}
