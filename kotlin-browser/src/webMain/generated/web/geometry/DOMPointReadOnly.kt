// Automatically generated - do not modify!

package web.geometry

import js.serialization.Serializable
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`DOMPointReadOnly`** interface specifies the coordinate and perspective fields used by DOMPoint to define a 2D or 3D point in a coordinate system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly)
 */
open external class DOMPointReadOnly(
    /**
     * The DOMPointReadOnly interface's **`x`** property holds the horizontal coordinate, x, for a read-only point in space. This property cannot be changed by JavaScript code in this read-only version of the DOMPoint object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/x)
     */
    open val x: Double = definedExternally,
    /**
     * The DOMPointReadOnl**`y`** interface's y property holds the vertical coordinate, y, for a read-only point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/y)
     */
    open val y: Double = definedExternally,
    /**
     * The DOMPointReadOnly interface's **`z`** property holds the depth coordinate, z, for a read-only point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/z)
     */
    open val z: Double = definedExternally,
    /**
     * The DOMPointReadOnly interface's **`w`** property holds the point's perspective value, w, for a read-only point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/w)
     */
    open val w: Double = definedExternally,
) : Serializable {
    /**
     * The **`matrixTransform()`** method of the DOMPointReadOnly interface applies a matrix transform specified as an object to the DOMPointReadOnly object, creating and returning a new DOMPointReadOnly object. Neither the matrix nor the point are altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/matrixTransform)
     */
    fun matrixTransform(matrix: DOMMatrixReadOnly = definedExternally): DOMPoint

    /**
     * The DOMPointReadOnly method **`toJSON()`** returns an object giving the JSON form of the point object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * The static DOMPointReadOnly method **`fromPoint()`** creates and returns a new DOMPointReadOnly object given a source point.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static)
         */
        fun fromPoint(other: DOMPointReadOnly = definedExternally): DOMPointReadOnly
    }
}
