// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feColorMatrix> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement)
 */
open external class SVGFEColorMatrixElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val type: SVGAnimatedEnumeration<Type>
    val values: SVGAnimatedNumberList
    val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Type
    val SVG_FECOLORMATRIX_TYPE_MATRIX: Type
    val SVG_FECOLORMATRIX_TYPE_SATURATE: Type
    val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Type
    val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Type

    companion object {
        val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Type
        val SVG_FECOLORMATRIX_TYPE_MATRIX: Type
        val SVG_FECOLORMATRIX_TYPE_SATURATE: Type
        val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Type
        val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Type
    }

    sealed interface Type
}
