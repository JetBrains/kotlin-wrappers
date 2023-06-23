// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feColorMatrix> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement)
 */
sealed external class SVGFEColorMatrixElement :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/in1) */
    val in1: SVGAnimatedString

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/type) */
    val type: SVGAnimatedEnumeration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/values) */
    val values: SVGAnimatedNumberList
    val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Short
    val SVG_FECOLORMATRIX_TYPE_MATRIX: Short
    val SVG_FECOLORMATRIX_TYPE_SATURATE: Short
    val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Short
    val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Short

    companion object {
        val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Short
        val SVG_FECOLORMATRIX_TYPE_MATRIX: Short
        val SVG_FECOLORMATRIX_TYPE_SATURATE: Short
        val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Short
        val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Short
    }
}
