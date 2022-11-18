// Automatically generated - do not modify!

package canvas

@JsName("Object")
sealed external class /* interface */ CanvasPath {
    fun arc(
        x: Number,
        y: Number,
        radius: Number,
        startAngle: Number,
        endAngle: Number,
        counterclockwise: Boolean = definedExternally,
    )

    fun arcTo(
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        radius: Number,
    )

    fun bezierCurveTo(
        cp1x: Number,
        cp1y: Number,
        cp2x: Number,
        cp2y: Number,
        x: Number,
        y: Number,
    )

    fun closePath()
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

    fun lineTo(
        x: Number,
        y: Number,
    )

    fun moveTo(
        x: Number,
        y: Number,
    )

    fun quadraticCurveTo(
        cpx: Number,
        cpy: Number,
        x: Number,
        y: Number,
    )

    fun rect(
        x: Number,
        y: Number,
        w: Number,
        h: Number,
    )

    fun roundRect(
        x: Number,
        y: Number,
        w: Number,
        h: Number,
        radii: Any /* number | DOMPointInit | (number | DOMPointInit)[] */ = definedExternally,
    )
}
