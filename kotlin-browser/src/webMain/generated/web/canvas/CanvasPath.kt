// Automatically generated - do not modify!

package web.canvas

import js.internal.InternalApi
import web.errors.DOMExceptionType.IndexSizeError
import web.errors.JsThrows

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasPath {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc)
     */
    fun arc(
        x: Double,
        y: Double,
        radius: Double,
        startAngle: Double,
        endAngle: Double,
        counterclockwise: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arcTo)
     */
    @JsThrows(IndexSizeError::class)
    fun arcTo(
        x1: Double,
        y1: Double,
        x2: Double,
        y2: Double,
        radius: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo)
     */
    fun bezierCurveTo(
        cp1x: Double,
        cp1y: Double,
        cp2x: Double,
        cp2y: Double,
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/closePath)
     */
    fun closePath()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse)
     */
    fun ellipse(
        x: Double,
        y: Double,
        radiusX: Double,
        radiusY: Double,
        rotation: Double,
        startAngle: Double,
        endAngle: Double,
        counterclockwise: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineTo)
     */
    fun lineTo(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/moveTo)
     */
    fun moveTo(
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo)
     */
    fun quadraticCurveTo(
        cpx: Double,
        cpy: Double,
        x: Double,
        y: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rect)
     */
    fun rect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    fun roundRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
        radii: JsAny /* number | DOMPointInit | (number | DOMPointInit)[] */ = definedExternally,
    )
}
