// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMMatrix
import dom.geometry.DOMMatrix2DInit

sealed external class SVGTransform {
    val angle: Number
    val matrix: DOMMatrix
    val type: Number
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

    val SVG_TRANSFORM_MATRIX: Number
    val SVG_TRANSFORM_ROTATE: Number
    val SVG_TRANSFORM_SCALE: Number
    val SVG_TRANSFORM_SKEWX: Number
    val SVG_TRANSFORM_SKEWY: Number
    val SVG_TRANSFORM_TRANSLATE: Number
    val SVG_TRANSFORM_UNKNOWN: Number
}
