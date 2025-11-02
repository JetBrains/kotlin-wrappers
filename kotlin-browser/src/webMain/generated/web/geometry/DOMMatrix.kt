// Automatically generated - do not modify!

package web.geometry

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsDouble
import js.serialization.Serializable
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array
import kotlin.js.definedExternally

/**
 * The **`DOMMatrix`** interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix)
 */
open external class DOMMatrix(
    init: String = definedExternally,
) : DOMMatrixReadOnly,
    Serializable {
    constructor(init: ReadonlyArray<JsDouble>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var a: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var b: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var c: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var d: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var e: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var f: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m11: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m12: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m13: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m14: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m21: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m22: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m23: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m24: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m31: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m32: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m33: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m34: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m41: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m42: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m43: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m44: Double

    /**
     * The **`invertSelf()`** method of the DOMMatrix interface inverts the original matrix. If the matrix cannot be inverted, the new matrix's components are all set to NaN and its is2D property is set to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/invertSelf)
     */
    fun invertSelf(): DOMMatrix

    /**
     * The **`multiplySelf()`** method of the DOMMatrix interface multiplies a matrix by the otherMatrix parameter, computing the dot product of the original matrix and the specified matrix: A⋅B. If no matrix is specified as the multiplier, the matrix is multiplied by a matrix in which every element is 0 except the bottom-right corner and the element immediately above and to its left: m33 and m34. These have the default value of 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/multiplySelf)
     */
    fun multiplySelf(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * The **`preMultiplySelf()`** method of the DOMMatrix interface modifies the matrix by pre-multiplying it with the specified DOMMatrix. This is equivalent to the dot product B⋅A, where matrix A is the source matrix and B is the matrix given as an input to the method. If no matrix is specified as the multiplier, the matrix is multiplied by a matrix in which every element is 0 except the bottom-right corner and the element immediately above and to its left: m33 and m34. These have the default value of 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/preMultiplySelf)
     */
    fun preMultiplySelf(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * The **`rotateAxisAngleSelf()`** method of the DOMMatrix interface is a transformation method that rotates the source matrix by the given vector and angle, returning the altered matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateAxisAngleSelf)
     */
    fun rotateAxisAngleSelf(
        x: Double = definedExternally,
        y: Double = definedExternally,
        z: Double = definedExternally,
        angle: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`rotateFromVectorSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix by rotating the matrix by the angle between the specified vector and (1, 0). The rotation angle is determined by the angle between the vector (1,0)T and (x,y)T in the clockwise direction, or (+/-)arctan(y/x). If x and y are both 0, the angle is specified as 0, and the matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateFromVectorSelf)
     */
    fun rotateFromVectorSelf(
        x: Double = definedExternally,
        y: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`rotateSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It rotates the source matrix around each of its axes by the specified number of degrees and returns the rotated matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateSelf)
     */
    fun rotateSelf(
        rotX: Double = definedExternally,
        rotY: Double = definedExternally,
        rotZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`scale3dSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix by applying a specified scaling factor to all three axes, centered on the given origin, with a default origin of (0, 0, 0), returning the 3D-scaled matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scale3dSelf)
     */
    fun scale3dSelf(
        scale: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`scaleSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix by applying a specified scaling factor, centered on the given origin, with a default origin of (0, 0), returning the scaled matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scaleSelf)
     */
    fun scaleSelf(
        scaleX: Double = definedExternally,
        scaleY: Double = definedExternally,
        scaleZ: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * The **`setMatrixValue()`** method of the DOMMatrix interface replaces the contents of the matrix with the matrix described by the specified transform or transforms, returning itself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/setMatrixValue)
     */
    fun setMatrixValue(transformList: String): DOMMatrix

    /**
     * The **`skewXSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It skews the source matrix by applying the specified skew transformation along the X-axis and returns the skewed matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/skewXSelf)
     */
    fun skewXSelf(sx: Double = definedExternally): DOMMatrix

    /**
     * The **`skewYSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It skews the source matrix by applying the specified skew transformation along the Y-axis and returns the skewed matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/skewYSelf)
     */
    fun skewYSelf(sy: Double = definedExternally): DOMMatrix

    /**
     * The **`translateSelf()`** method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It applies the specified vectors and returns the updated matrix. The default vector is [0, 0, 0].
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/translateSelf)
     */
    fun translateSelf(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        /**
         * The **`fromFloat32Array()`** static method of the DOMMatrix interface creates a new DOMMatrix object given an array of single-precision (32-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/fromFloat32Array_static)
         */
        fun fromFloat32Array(array32: Float32Array<ArrayBuffer>): DOMMatrix

        /**
         * The **`fromFloat64Array()`** static method of the DOMMatrix interface creates a new DOMMatrix object given an array of double-precision (64-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/fromFloat64Array_static)
         */
        fun fromFloat64Array(array64: Float64Array<ArrayBuffer>): DOMMatrix

        /**
         * The **`fromMatrix()`** static method of the DOMMatrix interface creates a new DOMMatrix object given an existing matrix or an object which provides the values for its properties.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/fromMatrix_static)
         */
        fun fromMatrix(other: DOMMatrixReadOnly = definedExternally): DOMMatrix
    }
}
