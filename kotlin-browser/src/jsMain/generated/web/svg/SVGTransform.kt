// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMMatrix
import web.geometry.DOMMatrixReadOnly

/**
 * SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform)
 */
external class SVGTransform
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/angle)
     */
    val angle: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/matrix)
     */
    val matrix: DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/type)
     */
    val type: Type

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setMatrix)
     */
    fun setMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setRotate)
     */
    fun setRotate(
        angle: Float,
        cx: Float,
        cy: Float,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setScale)
     */
    fun setScale(
        sx: Float,
        sy: Float,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setSkewX)
     */
    fun setSkewX(angle: Float)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setSkewY)
     */
    fun setSkewY(angle: Float)

    /**
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
