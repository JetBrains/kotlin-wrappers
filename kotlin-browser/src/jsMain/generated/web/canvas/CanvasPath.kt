// Automatically generated - do not modify!

package web.canvas

@JsName("Object")
sealed external class /* interface */ CanvasPath {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc) */
    fun arc(
        x: Number,
        y: Number,
        radius: Number,
        startAngle: Number,
        endAngle: Number,
        counterclockwise: Boolean = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arcTo) */
    fun arcTo(
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        radius: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo) */
    fun bezierCurveTo(
        cp1x: Number,
        cp1y: Number,
        cp2x: Number,
        cp2y: Number,
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/closePath) */
    fun closePath()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse) */
    fun ellipse(
        x: Number,
        y: Number,
        radiusX: Number,
        radiusY: Number,
        rotation: Number,
        startAngle: Number,
        endAngle: Number,
        counterclockwise: Boolean = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineTo) */
    fun lineTo(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/moveTo) */
    fun moveTo(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo) */
    fun quadraticCurveTo(
        cpx: Number,
        cpy: Number,
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rect) */
    fun rect(
        x: Number,
        y: Number,
        w: Number,
        h: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect) */
    fun roundRect(
        x: Number,
        y: Number,
        w: Number,
        h: Number,
        radii: Any /* number | DOMPointInit | (number | DOMPointInit)[] */ = definedExternally,
    )
}
