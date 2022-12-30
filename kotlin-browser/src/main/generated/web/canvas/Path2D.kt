// Automatically generated - do not modify!

package web.canvas

import dom.geometry.DOMMatrix2DInit
import dom.geometry.DOMMatrixReadOnly

external class Path2D(
    path: Path2D = definedExternally,
) : CanvasPath {
    constructor(path: String)

    /** Adds to the path the path given by the argument. */
    fun addPath(
        path: Path2D,
        transform: DOMMatrix2DInit = definedExternally,
    )

    fun addPath(
        path: Path2D,
        transform: DOMMatrixReadOnly, /* DOMMatrix2DInit */
    )
}
