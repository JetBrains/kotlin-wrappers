// Automatically generated - do not modify!

package web.canvas

import web.geometry.DOMMatrix2DInit
import web.geometry.DOMMatrixReadOnly

/**
 * This Canvas 2D API interface is used to declare a path that can then be used on a CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this interface, which gives you the convenience of being able to retain and replay your path whenever desired.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D)
 */
external class Path2D(
    path: Path2D = definedExternally,
) : CanvasPath {
    constructor(path: String)

    /**
     * Adds to the path the path given by the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath)
     */
    fun addPath(
        path: Path2D,
        transform: DOMMatrix2DInit = definedExternally,
    )

    fun addPath(
        path: Path2D,
        transform: DOMMatrixReadOnly, /* DOMMatrix2DInit */
    )
}
