// Automatically generated - do not modify!

package web.canvas

import seskar.js.JsValue
import web.html.HTMLCanvasElement
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing surface of a <canvas> element. It is used for drawing shapes, text, images, and other objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D)
 */
sealed /* final */
external class CanvasRenderingContext2D
private constructor() :
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
    CanvasSettings,
    CanvasShadowStyles,
    CanvasState,
    CanvasText,
    CanvasTextDrawingStyles,
    CanvasTransform,
    CanvasUserInterface,
    RenderingContext {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     */
    val canvas: HTMLCanvasElement

    companion object {
        @JsValue("2d")
        val ID: RenderingContextId<CanvasRenderingContext2D, CanvasRenderingContext2DSettings>
    }
}
