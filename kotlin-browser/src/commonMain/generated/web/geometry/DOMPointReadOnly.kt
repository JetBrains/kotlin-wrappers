// Automatically generated - do not modify!

package web.geometry

import js.core.JsAny
import kotlin.js.definedExternally

/**
 * The **`DOMPointReadOnly`** interface specifies the coordinate and perspective fields used by DOMPoint to define a 2D or 3D point in a coordinate system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly)
 */
open external class DOMPointReadOnly(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/x)
     */
    open val x: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/y)
     */
    open val y: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/z)
     */
    open val z: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/w)
     */
    open val w: Double = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/matrixTransform)
     */
    fun matrixTransform(matrix: DOMMatrixReadOnly = definedExternally): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static)
         */
        fun fromPoint(other: DOMPointReadOnly = definedExternally): DOMPointReadOnly
    }
}
