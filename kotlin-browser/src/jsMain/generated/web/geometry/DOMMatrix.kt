// Automatically generated - do not modify!

package web.geometry

import js.array.ReadonlyArray
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix)
 */
external class DOMMatrix(
    init: String = definedExternally,
) : DOMMatrixReadOnly {
    constructor(init: ReadonlyArray<Double>)

    override var a: Double
    override var b: Double
    override var c: Double
    override var d: Double
    override var e: Double
    override var f: Double
    override var m11: Double
    override var m12: Double
    override var m13: Double
    override var m14: Double
    override var m21: Double
    override var m22: Double
    override var m23: Double
    override var m24: Double
    override var m31: Double
    override var m32: Double
    override var m33: Double
    override var m34: Double
    override var m41: Double
    override var m42: Double
    override var m43: Double
    override var m44: Double
    fun invertSelf(): DOMMatrix
    fun multiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix
    fun multiplySelf(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix
    fun preMultiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix
    fun preMultiplySelf(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix
    fun rotateAxisAngleSelf(
        x: Double = definedExternally,
        y: Double = definedExternally,
        z: Double = definedExternally,
        angle: Double = definedExternally,
    ): DOMMatrix

    fun rotateFromVectorSelf(
        x: Double = definedExternally,
        y: Double = definedExternally,
    ): DOMMatrix

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

    fun setMatrixValue(transformList: String): DOMMatrix
    fun skewXSelf(sx: Double = definedExternally): DOMMatrix
    fun skewYSelf(sy: Double = definedExternally): DOMMatrix
    fun translateSelf(
        tx: Double = definedExternally,
        ty: Double = definedExternally,
        tz: Double = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array): DOMMatrix
        fun fromFloat64Array(array64: Float64Array): DOMMatrix
        fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrix
        fun fromMatrix(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix
    }
}
