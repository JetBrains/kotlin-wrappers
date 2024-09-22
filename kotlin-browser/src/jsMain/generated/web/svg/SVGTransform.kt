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
external class SVGTransform
private constructor() {
    val angle: Float
    val matrix: DOMMatrix
    val type: Type
    fun setMatrix(matrix: DOMMatrix2DInit = definedExternally)
    fun setMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */)
    fun setRotate(
        angle: Float,
        cx: Float,
        cy: Float,
    )

    fun setScale(
        sx: Float,
        sy: Float,
    )

    fun setSkewX(angle: Float)
    fun setSkewY(angle: Float)
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
