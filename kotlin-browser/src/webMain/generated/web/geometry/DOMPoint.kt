// Automatically generated - do not modify!

package web.geometry

import js.serialization.Serializable
import kotlin.js.definedExternally

/**
 * A **`DOMPoint`** object represents a 2D or 3D point in a coordinate system; it includes values for the coordinates in up to three dimensions, as well as an optional perspective value. DOMPoint is based on DOMPointReadOnly but allows its properties' values to be changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint)
 */
open external class DOMPoint(
    /**
     * The DOMPoint interface's **`x`** property holds the horizontal coordinate, x, for a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/x)
     */
    override var x: Double = definedExternally,
    /**
     * The DOMPoint interface's **`y`** property holds the vertical coordinate, y, for a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/y)
     */
    override var y: Double = definedExternally,
    /**
     * The DOMPoint interface's **`z`** property specifies the depth coordinate of a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/z)
     */
    override var z: Double = definedExternally,
    /**
     * The DOMPoint interface's **`w`** property holds the point's perspective value, w, for a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/w)
     */
    override var w: Double = definedExternally,
) : DOMPointReadOnly,
    Serializable {
    companion object {
        /**
         * The **`fromPoint()`** static method of the DOMPoint interface creates and returns a new mutable DOMPoint object given a source point.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/fromPoint_static)
         */
        fun fromPoint(other: DOMPointReadOnly = definedExternally): DOMPoint
    }
}
