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

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement#svg_fecolormatrix_type_unknown)
         */
        val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement#svg_fecolormatrix_type_matrix)
         */
        val SVG_FECOLORMATRIX_TYPE_MATRIX: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement#svg_fecolormatrix_type_saturate)
         */
        val SVG_FECOLORMATRIX_TYPE_SATURATE: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement#svg_fecolormatrix_type_huerotate)
         */
        val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement#svg_fecolormatrix_type_luminancetoalpha)
         */
        val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Type
    }

    sealed /* enum */
    interface Type
}
