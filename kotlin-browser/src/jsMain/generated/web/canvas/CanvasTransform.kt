// Automatically generated - do not modify!

package web.canvas

import web.geometry.DOMMatrix
import web.geometry.DOMMatrix2DInit
import web.geometry.DOMMatrixReadOnly

sealed external interface CanvasTransform {
    fun getTransform(): DOMMatrix
    fun resetTransform()
    fun rotate(angle: Number)
    fun scale(
        x: Number,
        y: Number,
    )

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
    fun transform(
        a: Number,
        b: Number,
        c: Number,
        d: Number,
        e: Number,
        f: Number,
    )

    fun translate(
        x: Number,
        y: Number,
    )
}
