// Automatically generated - do not modify!

package web.canvas

import seskar.js.JsValue
import web.html.HTMLCanvasElement
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`CanvasRenderingContext2D`** interface, part of the Canvas API, provides the 2D rendering context for the drawing surface of a canvas element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D)
 */
sealed /* final */
external class CanvasRenderingContext2D
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
    CanvasSettings,
    CanvasShadowStyles,
    CanvasState,
    CanvasText,
    CanvasTextDrawingStyles,
    CanvasTransform,
    CanvasUserInterface,
    RenderingContext {
    /**
     * The **`CanvasRenderingContext2D.canvas`** property, part of the Canvas API, is a read-only reference to the might be `null` if there is no associated canvas element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     */
    val canvas: HTMLCanvasElement

    companion object {
        @JsValue("2d")
        val ID: RenderingContextId<CanvasRenderingContext2D, CanvasRenderingContext2DSettings>
    }
}
