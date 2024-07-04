// Automatically generated - do not modify!

package web.geometry

import js.array.ReadonlyArray
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly)
 */
open external class DOMMatrixReadOnly(
    init: String = definedExternally,
) {
    constructor(init: ReadonlyArray<Double>)

    open val a: Double
    open val b: Double
    open val c: Double
    open val d: Double
    open val e: Double
    open val f: Double
    open val is2D: Boolean
    open val isIdentity: Boolean
    open val m11: Double
    open val m12: Double
    open val m13: Double
    open val m14: Double
    open val m21: Double
    open val m22: Double
    open val m23: Double
    open val m24: Double
    open val m31: Double
    open val m32: Double
    open val m33: Double
    open val m34: Double
    open val m41: Double
    open val m42: Double
    open val m43: Double
    open val m44: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX)
     */
    fun flipX(): DOMMatrix
    fun flipY(): DOMMatrix
    fun inverse(): DOMMatrix
    fun multiply(other: DOMMatrixInit = definedExternally): DOMMatrix
    fun multiply(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix
    fun rotate(
        rotX: Double = definedExternally,
        rotY: Double = definedExternally,
        rotZ: Double = definedExternally,
    ): DOMMatrix

    fun rotateAxisAngle(
        x: Double = definedExternally,
        y: Double = definedExternally,
        z: Double = definedExternally,
        angle: Double = definedExternally,
    ): DOMMatrix

    fun rotateFromVector(
        x: Double = definedExternally,
        y: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale)
     */
    fun scale(
        scaleX: Double = definedExternally,
        scaleY: Double = definedExternally,
        scaleZ: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    fun scale3d(
        scale: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    fun skewX(sx: Double = definedExternally): DOMMatrix
    fun skewY(sy: Double = definedExternally): DOMMatrix
    fun toFloat32Array(): Float32Array
    fun toFloat64Array(): Float64Array
    fun toJSON(): Any
    fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint
    fun transformPoint(point: DOMPointReadOnly /* DOMPointInit */): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate)
     */
    fun translate(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array): DOMMatrixReadOnly
        fun fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly
        fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrixReadOnly
        fun fromMatrix(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrixReadOnly
    }
}
