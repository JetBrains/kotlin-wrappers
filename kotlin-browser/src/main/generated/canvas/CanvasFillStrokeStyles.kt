// Automatically generated - do not modify!

package canvas

sealed external interface CanvasFillStrokeStyles {
    var fillStyle: Any /* string | CanvasGradient | CanvasPattern */
    var strokeStyle: Any /* string | CanvasGradient | CanvasPattern */
    fun createConicGradient(
        startAngle: Number,
        x: Number,
        y: Number,
    ): CanvasGradient

    fun createLinearGradient(
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
    ): CanvasGradient

    fun createPattern(
        image: CanvasImageSource,
        repetition: String?,
    ): CanvasPattern?

    fun createRadialGradient(
        x0: Number,
        y0: Number,
        r0: Number,
        x1: Number,
        y1: Number,
        r1: Number,
    ): CanvasGradient
}
