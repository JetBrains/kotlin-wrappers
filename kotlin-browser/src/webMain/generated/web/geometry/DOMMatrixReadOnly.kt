// Automatically generated - do not modify!

package web.geometry

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsDouble
import js.serialization.Serializable
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`DOMMatrixReadOnly`** interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix after creating it.
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
     * The readonly **`is2D`** property of the DOMMatrixReadOnly interface is a Boolean flag that is true when the matrix is 2D. The value is true if the matrix was initialized as a 2D matrix and only 2D transformation operations were applied. Otherwise, the matrix is defined in 3D, and is2D is false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/is2D)
     */
    open val is2D: Boolean

    /**
     * The readonly **`isIdentity`** property of the DOMMatrixReadOnly interface is a Boolean whose value is true if the matrix is the identity matrix.
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
     * The **`flipX()`** method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix flipped about the x-axis. This is equivalent to multiplying the matrix by DOMMatrix(-1, 0, 0, 1, 0, 0). The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX)
     */
    fun flipX(): DOMMatrix

    /**
     * The **`flipY()`** method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix flipped about the y-axis. This is equivalent to multiplying the matrix by DOMMatrix(1, 0, 0, -1, 0, 0). The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipY)
     */
    fun flipY(): DOMMatrix

    /**
     * The **`inverse()`** method of the DOMMatrixReadOnly interface creates a new matrix which is the inverse of the original matrix. If the matrix cannot be inverted, the new matrix's components are all set to NaN and its is2D property is set to false. The original matrix is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/inverse)
     */
    fun inverse(): DOMMatrix

    /**
     * The **`multiply()`** method of the DOMMatrixReadOnly interface creates and returns a new matrix which is the dot product of the matrix and the otherMatrix parameter. If otherMatrix is omitted, the matrix is multiplied by a matrix in which every element is 0 except the bottom-right corner and the element immediately above and to its left: m33 and m34. These have the default value of 1. The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/multiply)
     */
    fun multiply(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * The **`rotate()`** method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by rotating the source matrix around each of its axes by the specified number of degrees. The original matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotate)
     */
    fun rotate(
        rotX: Double = definedExternally,
        rotY: Double = definedExternally,
        rotZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`rotateAxisAngle()`** method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by rotating the source matrix by the given vector and angle. The original matrix is not altered.
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
     * The **`rotateFromVector()`** method of the DOMMatrixReadOnly interface is returns a new DOMMatrix created by rotating the source matrix by the angle between the specified vector and (1, 0). The rotation angle is determined by the angle between the vector (1,0)T and (x,y)T in the clockwise direction, or (+/-)arctan(y/x). If x and y are both 0, the angle is specified as 0. The original matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateFromVector)
     */
    fun rotateFromVector(
        x: Double = definedExternally,
        y: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`scale()`** method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a scale transform applied.
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
     * The **`scale3d()`** method of the DOMMatrixReadOnly interface creates a new matrix which is the result of a 3D scale transform being applied to the matrix. It returns a new DOMMatrix created by scaling the source 3d matrix by the given scale factor centered on the origin point specified by the origin parameters, with a default origin of (0, 0, 0). The original matrix is not modified.
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
     * The **`skewX()`** method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by applying the specified skew transformation to the source matrix along its x-axis. The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewX)
     */
    fun skewX(sx: Double = definedExternally): DOMMatrix

    /**
     * The **`skewY()`** method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by applying the specified skew transformation to the source matrix along its y-axis. The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewY)
     */
    fun skewY(sy: Double = definedExternally): DOMMatrix

    /**
     * The **`toFloat32Array()`** method of the DOMMatrixReadOnly interface returns a new Float32Array containing all 16 elements (m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, m41, m42, m43, m44) which comprise the matrix. The elements are stored into the array as single-precision floating-point numbers in column-major (colexographical access, or "colex") order. (In other words, down the first column from top to bottom, then the second column, and so forth.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat32Array)
     */
    fun toFloat32Array(): Float32Array<ArrayBuffer>

    /**
     * The **`toFloat64Array()`** method of the DOMMatrixReadOnly interface returns a new Float64Array containing all 16 elements (m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, m41, m42, m43, m44) which comprise the matrix. The elements are stored into the array as double-precision floating-point numbers in column-major (colexographical access, or "colex") order. (In other words, down the first column from top to bottom, then the second column, and so forth.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat64Array)
     */
    fun toFloat64Array(): Float64Array<ArrayBuffer>

    /**
     * The **`toJSON()`** method of the DOMMatrixReadOnly interface creates and returns a JSON object. The JSON object includes the 2D matrix elements a through f, the 16 elements of the 4X4 3D matrix, m[1-4][1-4], the boolean is2D property, and the boolean isIdentity property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    /**
     * The **`transformPoint`** method of the DOMMatrixReadOnly interface creates a new DOMPoint object, transforming a specified point by the matrix. Neither the matrix nor the original point are altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/transformPoint)
     */
    fun transformPoint(point: DOMPointReadOnly = definedExternally): DOMPoint

    /**
     * The **`translate()`** method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original matrix with a translation applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate)
     */
    fun translate(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        /**
         * The **`fromFloat32Array()`** static method of the DOMMatrixReadOnly interface creates a new DOMMatrixReadOnly object given an array of single-precision (32-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/fromFloat32Array_static)
         */
        fun fromFloat32Array(array32: Float32Array<ArrayBuffer>): DOMMatrixReadOnly

        /**
         * The **`fromFloat64Array()`** static method of the DOMMatrixReadOnly interface creates a new DOMMatrixReadOnly object given an array of double-precision (64-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/fromFloat64Array_static)
         */
        fun fromFloat64Array(array64: Float64Array<ArrayBuffer>): DOMMatrixReadOnly

        /**
         * The **`fromMatrix()`** static method of the DOMMatrixReadOnly interface creates a new DOMMatrixReadOnly object given an existing matrix or an object which provides the values for its properties.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/fromMatrix_static)
         */
        fun fromMatrix(other: DOMMatrixReadOnly = definedExternally): DOMMatrixReadOnly
    }
}
