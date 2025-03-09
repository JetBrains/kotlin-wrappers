// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasDrawPath {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/beginPath)
     */
    fun beginPath()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip)
     */
    fun clip(fillRule: CanvasFillRule = definedExternally)
    fun clip(
        path: Path2D,
        fillRule: CanvasFillRule = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill)
     */
    fun fill(fillRule: CanvasFillRule = definedExternally)
    fun fill(
        path: Path2D,
        fillRule: CanvasFillRule = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath)
     */
    fun isPointInPath(
        x: Double,
        y: Double,
        fillRule: CanvasFillRule = definedExternally,
    ): Boolean

    fun isPointInPath(
        path: Path2D,
        x: Double,
        y: Double,
        fillRule: CanvasFillRule = definedExternally,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke)
     */
    fun isPointInStroke(
        x: Double,
        y: Double,
    ): Boolean

    fun isPointInStroke(
        path: Path2D,
        x: Double,
        y: Double,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke)
     */
    fun stroke()
    fun stroke(path: Path2D)
}
