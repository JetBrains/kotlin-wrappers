// Automatically generated - do not modify!

package canvas

import dom.geometry.DOMMatrix
import dom.geometry.DOMMatrix2DInit

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
