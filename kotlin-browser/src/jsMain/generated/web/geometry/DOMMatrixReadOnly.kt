// Automatically generated - do not modify!

package web.geometry

import js.core.ReadonlyArray
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array

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
    fun flipX(): DOMMatrix
    fun flipY(): DOMMatrix
    fun inverse(): DOMMatrix
    fun multiply(other: DOMMatrixInit = definedExternally): DOMMatrix
    fun multiply(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix
    fun rotate(
        rotX: Number = definedExternally,
        rotY: Number = definedExternally,
        rotZ: Number = definedExternally,
    ): DOMMatrix

    fun rotateAxisAngle(
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        angle: Number = definedExternally,
    ): DOMMatrix

    fun rotateFromVector(
        x: Number = definedExternally,
        y: Number = definedExternally,
    ): DOMMatrix

    fun scale(
        scaleX: Number = definedExternally,
        scaleY: Number = definedExternally,
        scaleZ: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

    fun scale3d(
        scale: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

    fun skewX(sx: Number = definedExternally): DOMMatrix
    fun skewY(sy: Number = definedExternally): DOMMatrix
    fun toFloat32Array(): Float32Array
    fun toFloat64Array(): Float64Array
    fun toJSON(): Any
    fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint
    fun transformPoint(point: DOMPointReadOnly /* DOMPointInit */): DOMPoint
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
