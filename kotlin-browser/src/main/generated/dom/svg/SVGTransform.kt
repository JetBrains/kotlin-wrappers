// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMMatrix
import dom.geometry.DOMMatrix2DInit

sealed external class SVGTransform {
    val angle: Double
    val matrix: DOMMatrix
    val type: Short
    fun setMatrix(matrix: DOMMatrix2DInit = definedExternally)
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

    val SVG_TRANSFORM_MATRIX: Short
    val SVG_TRANSFORM_ROTATE: Short
    val SVG_TRANSFORM_SCALE: Short
    val SVG_TRANSFORM_SKEWX: Short
    val SVG_TRANSFORM_SKEWY: Short
    val SVG_TRANSFORM_TRANSLATE: Short
    val SVG_TRANSFORM_UNKNOWN: Short
}
