// Automatically generated - do not modify!

package web.canvas

import web.geometry.DOMMatrixReadOnly
import kotlin.js.definedExternally

/**
 * The **`Path2D`** interface of the Canvas 2D API is used to declare a path that can then be used on a CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this interface, which gives you the convenience of being able to retain and replay your path whenever desired.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D)
 */
open external class Path2D(
    path: Path2D = definedExternally,
) : CanvasPath {
    constructor(path: String)

    /**
     * The **`Path2D.addPath()`** method of the Canvas 2D API adds one Path2D object to another Path2D object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath)
     */
    fun addPath(
        path: Path2D,
        transform: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally,
    )
}
