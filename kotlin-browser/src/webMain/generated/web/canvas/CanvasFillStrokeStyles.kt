// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import kotlin.js.JsAny
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasFillStrokeStyles {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle)
     */
    var fillStyle: JsAny /* string | CanvasGradient | CanvasPattern */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle)
     */
    var strokeStyle: JsAny /* string | CanvasGradient | CanvasPattern */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createConicGradient)
     */
    fun createConicGradient(
        startAngle: Double,
        x: Double,
        y: Double,
    ): CanvasGradient = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createLinearGradient)
     */
    fun createLinearGradient(
        x0: Double,
        y0: Double,
        x1: Double,
        y1: Double,
    ): CanvasGradient = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createPattern)
     */
    fun createPattern(
        image: CanvasImageSource,
        repetition: String?,
    ): CanvasPattern? = definedExternally

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
    ): CanvasGradient = definedExternally
}
