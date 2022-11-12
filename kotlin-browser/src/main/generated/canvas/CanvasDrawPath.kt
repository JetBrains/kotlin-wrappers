// Automatically generated - do not modify!

package canvas

sealed external interface CanvasDrawPath {
    fun beginPath()
    fun clip(fillRule: CanvasFillRule = definedExternally)
    fun clip(
        path: Path2D,
        fillRule: CanvasFillRule = definedExternally,
    )

    fun fill(fillRule: CanvasFillRule = definedExternally)
    fun fill(
        path: Path2D,
        fillRule: CanvasFillRule = definedExternally,
    )

    fun isPointInPath(
        x: Number,
        y: Number,
        fillRule: CanvasFillRule = definedExternally,
    ): Boolean

    fun isPointInPath(
        path: Path2D,
        x: Number,
        y: Number,
        fillRule: CanvasFillRule = definedExternally,
    ): Boolean

    fun isPointInStroke(
        x: Number,
        y: Number,
    ): Boolean

    fun isPointInStroke(
        path: Path2D,
        x: Number,
        y: Number,
    ): Boolean

    fun stroke()
    fun stroke(path: Path2D)
}
