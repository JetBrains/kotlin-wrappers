// Automatically generated - do not modify!

package web.canvas

import web.geometry.DOMMatrixReadOnly
import kotlin.js.definedExternally

/**
 * The **`CanvasPattern`** interface represents an opaque object describing a pattern, based on an image, a canvas, or a video, created by the CanvasRenderingContext2D.createPattern() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasPattern)
 */
external class CanvasPattern
private constructor() {
    /**
     * Sets the transformation matrix that will be used when rendering the pattern during a fill or stroke painting operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasPattern/setTransform)
     */
    fun setTransform(transform: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally)
}
