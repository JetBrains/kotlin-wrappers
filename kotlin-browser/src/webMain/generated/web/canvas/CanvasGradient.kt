// Automatically generated - do not modify!

package web.canvas

import web.errors.DOMExceptionType.IndexSizeError
import web.errors.DOMExceptionType.SyntaxError
import web.errors.JsThrows

/**
 * The **`CanvasGradient`** interface represents an opaque object describing a gradient. It is returned by the methods CanvasRenderingContext2D.createLinearGradient(), CanvasRenderingContext2D.createConicGradient() or CanvasRenderingContext2D.createRadialGradient().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasGradient)
 */
open external class CanvasGradient
private constructor() {
    /**
     * The **`CanvasGradient.addColorStop()`** method adds a new color stop, defined by an offset and a color, to a given canvas gradient.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasGradient/addColorStop)
     */
    @JsThrows(IndexSizeError::class)
    @JsThrows(SyntaxError::class)
    fun addColorStop(
        offset: Double,
        color: String,
    )
}
