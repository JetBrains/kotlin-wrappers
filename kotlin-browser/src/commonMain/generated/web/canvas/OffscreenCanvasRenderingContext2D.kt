// Automatically generated - do not modify!

package web.canvas

import seskar.js.JsValue
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContextId

/**
 * The **`OffscreenCanvasRenderingContext2D`** interface is a CanvasRenderingContext2D rendering context for drawing to the bitmap of an `OffscreenCanvas` object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvasRenderingContext2D)
 */
sealed /* final */
external class OffscreenCanvasRenderingContext2D
protected /* private */ constructor() :
    CanvasCompositing,
    CanvasDrawImage,
    CanvasDrawPath,
    CanvasFillStrokeStyles,
    CanvasFilters,
    CanvasImageData,
    CanvasImageSmoothing,
    CanvasPath,
    CanvasPathDrawingStyles,
    CanvasRect,
    CanvasShadowStyles,
    CanvasState,
    CanvasText,
    CanvasTextDrawingStyles,
    CanvasTransform,
    OffscreenRenderingContext {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     */
    val canvas: OffscreenCanvas

    companion object {
        @JsValue("2d")
        val ID: RenderingContextId<OffscreenCanvasRenderingContext2D, CanvasRenderingContext2DSettings>
    }
}
