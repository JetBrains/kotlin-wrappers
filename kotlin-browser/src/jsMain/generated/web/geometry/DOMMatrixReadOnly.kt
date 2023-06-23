// Automatically generated - do not modify!

package web.geometry

import js.core.ReadonlyArray
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly) */
open external class DOMMatrixReadOnly(
    init: String = definedExternally,
) {
    constructor(init: ReadonlyArray<Double>)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/a) */
    open val a: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/b) */
    open val b: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/c) */
    open val c: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/d) */
    open val d: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/e) */
    open val e: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/f) */
    open val f: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/is2D) */
    open val is2D: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/isIdentity) */
    open val isIdentity: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m11) */
    open val m11: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m12) */
    open val m12: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m13) */
    open val m13: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m14) */
    open val m14: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m21) */
    open val m21: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m22) */
    open val m22: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m23) */
    open val m23: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m24) */
    open val m24: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m31) */
    open val m31: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m32) */
    open val m32: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m33) */
    open val m33: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m34) */
    open val m34: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m41) */
    open val m41: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m42) */
    open val m42: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m43) */
    open val m43: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/m44) */
    open val m44: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX) */
    fun flipX(): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipY) */
    fun flipY(): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/inverse) */
    fun inverse(): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/multiply) */
    fun multiply(other: DOMMatrixInit = definedExternally): DOMMatrix
    fun multiply(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotate) */
    fun rotate(
        rotX: Number = definedExternally,
        rotY: Number = definedExternally,
        rotZ: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateAxisAngle) */
    fun rotateAxisAngle(
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        angle: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateFromVector) */
    fun rotateFromVector(
        x: Number = definedExternally,
        y: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale) */
    fun scale(
        scaleX: Number = definedExternally,
        scaleY: Number = definedExternally,
        scaleZ: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale3d) */
    fun scale3d(
        scale: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewX) */
    fun skewX(sx: Number = definedExternally): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewY) */
    fun skewY(sy: Number = definedExternally): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat32Array) */
    fun toFloat32Array(): Float32Array

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat64Array) */
    fun toFloat64Array(): Float64Array
    fun toJSON(): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/transformPoint) */
    fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint
    fun transformPoint(point: DOMPointReadOnly /* DOMPointInit */): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate) */
    fun translate(
        tx: Number = definedExternally,
        ty: Number = definedExternally,
        tz: Number = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array): DOMMatrixReadOnly
        fun fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly
        fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrixReadOnly
        fun fromMatrix(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrixReadOnly
    }
}
