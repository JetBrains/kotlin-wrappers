// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feComposite> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement)
 */
open external class SVGFECompositeElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val in2: SVGAnimatedString
    val k1: SVGAnimatedNumber
    val k2: SVGAnimatedNumber
    val k3: SVGAnimatedNumber
    val k4: SVGAnimatedNumber
    val operator: SVGAnimatedEnumeration<Operator>
    val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Operator
    val SVG_FECOMPOSITE_OPERATOR_OVER: Operator
    val SVG_FECOMPOSITE_OPERATOR_IN: Operator
    val SVG_FECOMPOSITE_OPERATOR_OUT: Operator
    val SVG_FECOMPOSITE_OPERATOR_ATOP: Operator
    val SVG_FECOMPOSITE_OPERATOR_XOR: Operator
    val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Operator

    companion object {
        val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Operator
        val SVG_FECOMPOSITE_OPERATOR_OVER: Operator
        val SVG_FECOMPOSITE_OPERATOR_IN: Operator
        val SVG_FECOMPOSITE_OPERATOR_OUT: Operator
        val SVG_FECOMPOSITE_OPERATOR_ATOP: Operator
        val SVG_FECOMPOSITE_OPERATOR_XOR: Operator
        val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Operator
    }

    sealed interface Operator
}
