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
 * The **`DOMMatrix`** interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and translation.
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/invertSelf)
     */
    fun invertSelf(): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/multiplySelf)
     */
    fun multiplySelf(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/preMultiplySelf)
     */
    fun preMultiplySelf(other: DOMMatrixReadOnly = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateAxisAngleSelf)
     */
    fun rotateAxisAngleSelf(
        x: Double = definedExternally,
        y: Double = definedExternally,
        z: Double = definedExternally,
        angle: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateFromVectorSelf)
     */
    fun rotateFromVectorSelf(
        x: Double = definedExternally,
        y: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateSelf)
     */
    fun rotateSelf(
        rotX: Double = definedExternally,
        rotY: Double = definedExternally,
        rotZ: Double = definedExternally,
    ): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scale3dSelf)
     */
    fun scale3dSelf(
        scale: Double = definedExternally,
        originX: Double = definedExternally,
        originY: Double = definedExternally,
        originZ: Double = definedExternally,
    ): DOMMatrix

    /**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/setMatrixValue)
     */
    fun setMatrixValue(transformList: String): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/skewXSelf)
     */
    fun skewXSelf(sx: Double = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/skewYSelf)
     */
    fun skewYSelf(sy: Double = definedExternally): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/translateSelf)
     */
    fun translateSelf(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array<ArrayBuffer>): DOMMatrix
        fun fromFloat64Array(array64: Float64Array<ArrayBuffer>): DOMMatrix
        fun fromMatrix(other: DOMMatrixReadOnly = definedExternally): DOMMatrix
    }
}
