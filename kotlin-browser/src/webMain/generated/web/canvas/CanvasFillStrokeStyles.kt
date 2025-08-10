// Automatically generated - do not modify!

package web.canvas

import js.core.JsAny
import js.reflect.JsExternalInheritorsOnly

/* mixin */
@JsExternalInheritorsOnly
external interface CanvasFillStrokeStyles {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle)
     */
    var fillStyle: JsAny /* string | CanvasGradient | CanvasPattern */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle)
     */
    var strokeStyle: JsAny /* string | CanvasGradient | CanvasPattern */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createConicGradient)
     */
    fun createConicGradient(
        startAngle: Double,
        x: Double,
        y: Double,
    ): CanvasGradient

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createLinearGradient)
     */
    fun createLinearGradient(
        x0: Double,
        y0: Double,
        x1: Double,
        y1: Double,
    ): CanvasGradient

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createPattern)
     */
    fun createPattern(
        image: CanvasImageSource,
        repetition: String?,
    ): CanvasPattern?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createRadialGradient)
     */
    fun createRadialGradient(
        x0: Double,
        y0: Double,
        r0: Double,
        x1: Double,
        y1: Double,
        r1: Double,
    ): CanvasGradient
}
