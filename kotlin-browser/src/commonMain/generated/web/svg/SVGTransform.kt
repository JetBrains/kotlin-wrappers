// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMMatrix
import web.geometry.DOMMatrixReadOnly
import kotlin.js.definedExternally

/**
 * The **`SVGTransform`** interface reflects one of the component transformations within an SVGTransformList; thus, an `SVGTransform` object corresponds to a single component (e.g., `scale(…)` or `matrix(…)`) within a transform attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform)
 */
external class SVGTransform
private constructor() {
    /**
     * The **`angle`** read-only property of the SVGTransform interface represents the angle of the transformation in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/angle)
     */
    val angle: Float

    /**
     * The **`matrix`** read-only property of the SVGTransform interface represents the transformation matrix that corresponds to the transformation `type`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/matrix)
     */
    val matrix: DOMMatrix

    /**
     * The **`type`** read-only property of the SVGTransform interface represents the `type` of transformation applied, specified by one of the `SVG_TRANSFORM_*` constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/type)
     */
    val type: Type

    /**
     * The `setMatrix()` method of the SVGTransform interface sets the transform type to `SVG_TRANSFORM_MATRIX`, with parameter `matrix` defining the new transformation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setMatrix)
     */
    fun setMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally)

    /**
     * The `setRotate()` method of the SVGTransform interface sets the transform type to `SVG_TRANSFORM_ROTATE`, with parameter `angle` defining the rotation angle and parameters `cx` and `cy` defining the optional center of rotation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setRotate)
     */
    fun setRotate(
        angle: Float,
        cx: Float,
        cy: Float,
    )

    /**
     * The `setScale()` method of the SVGTransform interface sets the transform type to `SVG_TRANSFORM_SCALE`, with parameters `sx` and `sy` defining the scale amounts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setScale)
     */
    fun setScale(
        sx: Float,
        sy: Float,
    )

    /**
     * The `setSkewX()` method of the SVGTransform interface sets the transform type to `SVG_TRANSFORM_SKEWX`, with parameter `angle` defining the amount of skew along the X-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setSkewX)
     */
    fun setSkewX(angle: Float)

    /**
     * The `setSkewY()` method of the SVGTransform interface sets the transform type to `SVG_TRANSFORM_SKEWY`, with parameter `angle` defining the amount of skew along the Y-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setSkewY)
     */
    fun setSkewY(angle: Float)

    /**
     * The `setTranslate()` method of the SVGTransform interface sets the transform type to `SVG_TRANSFORM_TRANSLATE`, with parameters `tx` and `ty` defining the translation amounts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setTranslate)
     */
    fun setTranslate(
        tx: Float,
        ty: Float,
    )

    val SVG_TRANSFORM_UNKNOWN: Type
    val SVG_TRANSFORM_MATRIX: Type
    val SVG_TRANSFORM_TRANSLATE: Type
    val SVG_TRANSFORM_SCALE: Type
    val SVG_TRANSFORM_ROTATE: Type
    val SVG_TRANSFORM_SKEWX: Type
    val SVG_TRANSFORM_SKEWY: Type

    companion object {
        val SVG_TRANSFORM_UNKNOWN: Type
        val SVG_TRANSFORM_MATRIX: Type
        val SVG_TRANSFORM_TRANSLATE: Type
        val SVG_TRANSFORM_SCALE: Type
        val SVG_TRANSFORM_ROTATE: Type
        val SVG_TRANSFORM_SKEWX: Type
        val SVG_TRANSFORM_SKEWY: Type
    }

    sealed interface Type
}
