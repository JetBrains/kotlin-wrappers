// Automatically generated - do not modify!

package web.geometry

open external class DOMPointReadOnly(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/w) */
    open val w: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/x) */
    open val x: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/y) */
    open val y: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/z) */
    open val z: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/matrixTransform) */
    fun matrixTransform(matrix: DOMMatrixInit = definedExternally): DOMPoint
    fun matrixTransform(matrix: DOMMatrixReadOnly /* DOMMatrixInit */): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/toJSON) */
    fun toJSON(): Any

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static) */
        fun fromPoint(other: DOMPointInit = definedExternally): DOMPointReadOnly
        fun fromPoint(other: DOMPointReadOnly /* DOMPointInit */): DOMPointReadOnly
    }
}
