// Automatically generated - do not modify!

package web.canvas

import web.geometry.DOMMatrix
import web.geometry.DOMMatrix2DInit
import web.geometry.DOMMatrixReadOnly

sealed external interface CanvasTransform {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getTransform) */
    fun getTransform(): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/resetTransform) */
    fun resetTransform()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rotate) */
    fun rotate(angle: Number)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/scale) */
    fun scale(
        x: Number,
        y: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform) */
    fun setTransform(
        a: Number,
        b: Number,
        c: Number,
        d: Number,
        e: Number,
        f: Number,
    )

    fun setTransform(transform: DOMMatrix2DInit = definedExternally)
    fun setTransform(transform: DOMMatrixReadOnly /* DOMMatrix2DInit */)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform) */
    fun transform(
        a: Number,
        b: Number,
        c: Number,
        d: Number,
        e: Number,
        f: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate) */
    fun translate(
        x: Number,
        y: Number,
    )
}
