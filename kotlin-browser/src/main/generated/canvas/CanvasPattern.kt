// Automatically generated - do not modify!

package canvas

import dom.geometry.DOMMatrix2DInit
import dom.geometry.DOMMatrixReadOnly

sealed external class CanvasPattern {
    /** Sets the transformation matrix that will be used when rendering the pattern during a fill or stroke painting operation. */
    fun setTransform(transform: DOMMatrix2DInit = definedExternally)
    fun setTransform(transform: DOMMatrixReadOnly /* DOMMatrix2DInit */)
}
