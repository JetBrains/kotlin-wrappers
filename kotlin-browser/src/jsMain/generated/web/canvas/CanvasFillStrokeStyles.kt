// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasFillStrokeStyles {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle) */
    var fillStyle: Any /* string | CanvasGradient | CanvasPattern */

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle) */
    var strokeStyle: Any /* string | CanvasGradient | CanvasPattern */

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createConicGradient) */
    fun createConicGradient(
        startAngle: Number,
        x: Number,
        y: Number,
    ): CanvasGradient

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createLinearGradient) */
    fun createLinearGradient(
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
    ): CanvasGradient

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createPattern) */
    fun createPattern(
        image: CanvasImageSource,
        repetition: String?,
    ): CanvasPattern?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createRadialGradient) */
    fun createRadialGradient(
        x0: Number,
        y0: Number,
        r0: Number,
        x1: Number,
        y1: Number,
        r1: Number,
    ): CanvasGradient
}
