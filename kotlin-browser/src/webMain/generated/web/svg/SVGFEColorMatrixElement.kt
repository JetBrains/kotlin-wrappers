// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEColorMatrixElement`** interface corresponds to the <feColorMatrix> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement)
 */
open external class SVGFEColorMatrixElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFEColorMatrixElement interface reflects the in attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`type`** read-only property of the SVGFEColorMatrixElement interface reflects the type attribute of the given element. It takes one of the SVG_FECOLORMATRIX_TYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/type)
     */
    val type: SVGAnimatedEnumeration<Type>

    /**
     * The **`values`** read-only property of the SVGFEColorMatrixElement interface reflects the values attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/values)
     */
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
