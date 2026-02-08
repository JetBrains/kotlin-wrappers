// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasDrawPath {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/beginPath)
     */
    fun beginPath(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip)
     */
    fun clip(fillRule: CanvasFillRule = definedExternally): Unit = definedExternally
    fun clip(
        path: Path2D,
        fillRule: CanvasFillRule = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill)
     */
    fun fill(fillRule: CanvasFillRule = definedExternally): Unit = definedExternally
    fun fill(
        path: Path2D,
        fillRule: CanvasFillRule = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath)
     */
    fun isPointInPath(
        x: Double,
        y: Double,
        fillRule: CanvasFillRule = definedExternally,
    ): Boolean = definedExternally

    fun isPointInPath(
        path: Path2D,
        x: Double,
        y: Double,
        fillRule: CanvasFillRule = definedExternally,
    ): Boolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke)
     */
    fun isPointInStroke(
        x: Double,
        y: Double,
    ): Boolean = definedExternally

    fun isPointInStroke(
        path: Path2D,
        x: Double,
        y: Double,
    ): Boolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke)
     */
    fun stroke(): Unit = definedExternally
    fun stroke(path: Path2D): Unit = definedExternally
}
