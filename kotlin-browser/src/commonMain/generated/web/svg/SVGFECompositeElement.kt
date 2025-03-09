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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/in2)
     */
    val in2: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k1)
     */
    val k1: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k2)
     */
    val k2: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k3)
     */
    val k3: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k4)
     */
    val k4: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/operator)
     */
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
