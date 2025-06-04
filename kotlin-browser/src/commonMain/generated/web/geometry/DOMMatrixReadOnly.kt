// Automatically generated - do not modify!

package web.geometry

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsAny
import js.core.JsDouble
import js.serialization.Serializable
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array
import kotlin.js.definedExternally

/**
 * The **`DOMMatrixReadOnly`** interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly)
 */
open external class DOMMatrixReadOnly(
    init: String = definedExternally,
) : Serializable {
    constructor(init: ReadonlyArray<JsDouble>)

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
     * The readonly **`is2D`** property of the DOMMatrixReadOnly interface is a Boolean flag that is `true` when the matrix is 2D.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/is2D)
     */
    open val is2D: Boolean

    /**
     * The readonly **`isIdentity`** property of the DOMMatrixReadOnly interface is a Boolean whose value is `true` if the matrix is the identity matrix.
     *
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
     * The **`flipX()`** method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix flipped about the x-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX)
     */
    fun flipX(): DOMMatrix

    /**
     * The **`flipY()`** method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix flipped about the y-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipY)
     */
    fun flipY(): DOMMatrix

    /**
     * The **`inverse()`** method of the DOMMatrixReadOnly interface creates a new matrix which is the inverse of the original matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/inverse)
     */
    fun inverse(): DOMMatrix

    /**
     * The **`multiply()`** method of the DOMMatrixReadOnly interface creates and returns a new matrix which is the dot product of the matrix and the `otherMatrix` parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/multiply)
     */
    fun multiply(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * The `rotate()` method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by rotating the source matrix around each of its axes by the specified number of degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotate)
     */
    fun rotate(
        rotX: Double = definedExternally,
        rotY: Double = definedExternally,
        rotZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * The `rotateAxisAngle()` method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by rotating the source matrix by the given vector and angle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateAxisAngle)
     */
    fun rotateAxisAngle(
        x: Double = definedExternally,
        y: Double = definedExternally,
        z: Double = definedExternally,
        angle: Double = definedExternally,
    ): DOMMatrix

    /**
     * The `rotateFromVector()` method of the DOMMatrixReadOnly interface is returns a new DOMMatrix created by rotating the source matrix by the angle between the specified vector and `(1, 0)`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateFromVector)
     */
    fun rotateFromVector(
        x: Double = definedExternally,
        y: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`scale()`** method of the original matrix with a scale transform applied.
     *
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
     * The **`scale3d()`** method of the DOMMatrixReadOnly interface creates a new matrix which is the result of a 3D scale transform being applied to the matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale3d)
     */
    fun scale3d(
        scale: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * The `skewX()` method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by applying the specified skew transformation to the source matrix along its x-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewX)
     */
    fun skewX(sx: Double = definedExternally): DOMMatrix

    /**
     * The `skewY()` method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by applying the specified skew transformation to the source matrix along its y-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewY)
     */
    fun skewY(sy: Double = definedExternally): DOMMatrix

    /**
     * The **`toFloat32Array()`** method of the DOMMatrixReadOnly interface returns a new Float32Array containing all 16 elements (`m11`, `m12`, `m13`, `m14`, `m21`, `m22`, `m23`, `m24`, `m31`, `m32`, `m33`, `m34`, `m41`, `m42`, `m43`, `m44`) which comprise the matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat32Array)
     */
    fun toFloat32Array(): Float32Array<ArrayBuffer>

    /**
     * The **`toFloat64Array()`** method of the DOMMatrixReadOnly interface returns a new Float64Array containing all 16 elements (`m11`, `m12`, `m13`, `m14`, `m21`, `m22`, `m23`, `m24`, `m31`, `m32`, `m33`, `m34`, `m41`, `m42`, `m43`, `m44`) which comprise the matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat64Array)
     */
    fun toFloat64Array(): Float64Array<ArrayBuffer>

    /**
     * The **`toJSON()`** method of the DOMMatrixReadOnly interface creates and returns a JSON object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    /**
     * The **`transformPoint`** method of the You can also create a new `DOMPoint` by applying a matrix to a point with the DOMPointReadOnly.matrixTransform() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/transformPoint)
     */
    fun transformPoint(point: DOMPointReadOnly = definedExternally): DOMPoint

    /**
     * The `translate()` method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a translation applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate)
     */
    fun translate(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array<ArrayBuffer>): DOMMatrixReadOnly
        fun fromFloat64Array(array64: Float64Array<ArrayBuffer>): DOMMatrixReadOnly
        fun fromMatrix(other: DOMMatrixReadOnly = definedExternally): DOMMatrixReadOnly
    }
}
