// Automatically generated - do not modify!

package web.geometry

import js.array.ReadonlyArray
import js.core.JsAny
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly)
 */
open external class DOMMatrixReadOnly(
    init: String = definedExternally,
) {
    constructor(init: ReadonlyArray<Double>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val a: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val b: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val c: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val d: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val e: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val f: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/is2D)
     */
    open val is2D: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/isIdentity)
     */
    open val isIdentity: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m11: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m12: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m13: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m14: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m21: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m22: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m23: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m24: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m31: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m32: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m33: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m34: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m41: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m42: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m43: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    open val m44: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX)
     */
    fun flipX(): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipY)
     */
    fun flipY(): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/inverse)
     */
    fun inverse(): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/multiply)
     */
    fun multiply(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotate)
     */
    fun rotate(
        rotX: Double = definedExternally,
        rotY: Double = definedExternally,
        rotZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateAxisAngle)
     */
    fun rotateAxisAngle(
        x: Double = definedExternally,
        y: Double = definedExternally,
        z: Double = definedExternally,
        angle: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateFromVector)
     */
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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale3d)
     */
    fun scale3d(
        scale: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewX)
     */
    fun skewX(sx: Double = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewY)
     */
    fun skewY(sy: Double = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat32Array)
     */
    fun toFloat32Array(): Float32Array<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat64Array)
     */
    fun toFloat64Array(): Float64Array<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/transformPoint)
     */
    fun transformPoint(point: DOMPointReadOnly = definedExternally): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate)
     */
    fun translate(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array<*>): DOMMatrixReadOnly
        fun fromFloat64Array(array64: Float64Array<*>): DOMMatrixReadOnly
        fun fromMatrix(other: DOMMatrixReadOnly = definedExternally): DOMMatrixReadOnly
    }
}
