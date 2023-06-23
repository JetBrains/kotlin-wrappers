// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMMatrix
import web.geometry.DOMMatrix2DInit
import web.geometry.DOMMatrixReadOnly

/**
 * SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform)
 */
sealed external class SVGTransform {
    val angle: Double
    val matrix: DOMMatrix
    val type: Short
    fun setMatrix(matrix: DOMMatrix2DInit = definedExternally)
    fun setMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */)
    fun setRotate(
        angle: Number,
        cx: Number,
        cy: Number,
    )

    fun setScale(
        sx: Number,
        sy: Number,
    )

    fun setSkewX(angle: Number)
    fun setSkewY(angle: Number)
    fun setTranslate(
        tx: Number,
        ty: Number,
    )

    val SVG_TRANSFORM_UNKNOWN: Short
    val SVG_TRANSFORM_MATRIX: Short
    val SVG_TRANSFORM_TRANSLATE: Short
    val SVG_TRANSFORM_SCALE: Short
    val SVG_TRANSFORM_ROTATE: Short
    val SVG_TRANSFORM_SKEWX: Short
    val SVG_TRANSFORM_SKEWY: Short

    companion object {
        val SVG_TRANSFORM_UNKNOWN: Short
        val SVG_TRANSFORM_MATRIX: Short
        val SVG_TRANSFORM_TRANSLATE: Short
        val SVG_TRANSFORM_SCALE: Short
        val SVG_TRANSFORM_ROTATE: Short
        val SVG_TRANSFORM_SKEWX: Short
        val SVG_TRANSFORM_SKEWY: Short
    }
}
