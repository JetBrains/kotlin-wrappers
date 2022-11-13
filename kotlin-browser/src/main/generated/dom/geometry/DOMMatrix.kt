// Automatically generated - do not modify!

package dom.geometry

import kotlinx.js.ReadonlyArray

external class DOMMatrix(
    init: ReadonlyArray<Double> /* | String */ = definedExternally,
) : DOMMatrixReadOnly {
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
    fun preMultiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix
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

    fun scale3dSelf(
        scale: Number = definedExternally,
        originX: Number = definedExternally,
        originY: Number = definedExternally,
        originZ: Number = definedExternally,
    ): DOMMatrix

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
}
