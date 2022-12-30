// Automatically generated - do not modify!

package web.geometry

open external class DOMPointReadOnly(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally,
) {
    open val w: Double
    open val x: Double
    open val y: Double
    open val z: Double
    fun matrixTransform(matrix: DOMMatrixInit = definedExternally): DOMPoint
    fun matrixTransform(matrix: DOMMatrixReadOnly /* DOMMatrixInit */): DOMPoint
    fun toJSON(): Any

    companion object {
        fun fromPoint(other: DOMPointInit = definedExternally): DOMPointReadOnly
        fun fromPoint(other: DOMPointReadOnly /* DOMPointInit */): DOMPointReadOnly
    }
}
