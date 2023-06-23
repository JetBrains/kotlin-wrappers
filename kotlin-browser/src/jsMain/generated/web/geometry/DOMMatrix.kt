// Automatically generated - do not modify!

package web.geometry

import js.core.ReadonlyArray
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix) */
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
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        angle: Number = definedExternally,
    ): DOMMatrix

    fun rotateFromVectorSelf(
        x: Number = definedExternally,
        y: Number = definedExternally,
    ): DOMMatrix

    fun rotateSelf(
        rotX: Number = definedExternally,
        rotY: Number = definedExternally,
        rotZ: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scale3dSelf) */
    fun scale3dSelf(
        scale: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scaleSelf) */
    fun scaleSelf(
        scaleX: Number = definedExternally,
        scaleY: Number = definedExternally,
        scaleZ: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

    fun setMatrixValue(transformList: String): DOMMatrix
    fun skewXSelf(sx: Number = definedExternally): DOMMatrix
    fun skewYSelf(sy: Number = definedExternally): DOMMatrix
    fun translateSelf(
        tx: Number = definedExternally,
        ty: Number = definedExternally,
        tz: Number = definedExternally,
    ): DOMMatrix

    companion object {
        fun fromFloat32Array(array32: Float32Array): DOMMatrix
        fun fromFloat64Array(array64: Float64Array): DOMMatrix
        fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrix
        fun fromMatrix(other: DOMMatrixReadOnly /* DOMMatrixInit */): DOMMatrix
    }
}
