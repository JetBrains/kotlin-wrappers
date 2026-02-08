// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import web.geometry.DOMMatrix
import web.geometry.DOMMatrixReadOnly
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasTransform {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getTransform)
     */
    fun getTransform(): DOMMatrix = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/resetTransform)
     */
    fun resetTransform(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rotate)
     */
    fun rotate(angle: Double): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/scale)
     */
    fun scale(
        x: Double,
        y: Double,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform)
     */
    fun setTransform(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
        f: Double,
    ): Unit = definedExternally

    fun setTransform(transform: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform)
     */
    fun transform(
        a: Double,
        b: Double,
        c: Double,
        d: Double,
        e: Double,
        f: Double,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate)
     */
    fun translate(
        x: Double,
        y: Double,
    ): Unit = definedExternally
}
