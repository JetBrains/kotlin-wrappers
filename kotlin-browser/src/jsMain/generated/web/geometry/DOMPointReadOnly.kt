// Automatically generated - do not modify!

package web.geometry

/**
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
    fun toJSON(): Any

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static)
         */
        fun fromPoint(other: DOMPointReadOnly = definedExternally): DOMPointReadOnly
    }
}
