// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import web.events.EventTarget
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`GPUCanvasContext`** interface of the WebGPU API represents the WebGPU rendering context of a <canvas> element, returned via an HTMLCanvasElement.getContext() call with a contextType of "webgpu".
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext)
 */
open external class GPUCanvasContext
private constructor() :
    OffscreenRenderingContext,
    RenderingContext {
    /**
     * The **`canvas`** read-only property of the GPUCanvasContext interface returns a reference to the canvas that the context was created from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/canvas)
     */
    val canvas: EventTarget /* HTMLCanvasElement | OffscreenCanvas */

    /**
     * The **`configure()`** method of the GPUCanvasContext interface configures the context to use for rendering with a given GPUDevice. When called the canvas will initially be cleared to transparent black.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure)
     */
    fun configure(configuration: GPUCanvasConfiguration)

    /**
     * The **`getConfiguration()`** method of the GPUCanvasContext interface returns the current configuration set for the context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/getConfiguration)
     */
    fun getConfiguration(): GPUCanvasConfiguration?

    /**
     * The **`getCurrentTexture()`** method of the GPUCanvasContext interface returns the next GPUTexture to be composited to the document by the canvas context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/getCurrentTexture)
     */
    fun getCurrentTexture(): GPUTexture

    /**
     * The **`unconfigure()`** method of the GPUCanvasContext interface removes any previously-set context configuration, and destroys any textures returned via getCurrentTexture() while the canvas context was configured.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/unconfigure)
     */
    fun unconfigure()

    companion object
}

inline val GPUCanvasContext.Companion.ID: RenderingContextId<GPUCanvasContext, GPUCanvasConfiguration>
    get() = unsafeCast("webgpu")
