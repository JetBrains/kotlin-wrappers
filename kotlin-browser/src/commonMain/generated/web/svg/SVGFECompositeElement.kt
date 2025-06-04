// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFECompositeElement`** interface corresponds to the feComposite element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement)
 */
open external class SVGFECompositeElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFECompositeElement interface reflects the in attribute of the given feComposite element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`in2`** read-only property of the SVGFECompositeElement interface reflects the in2 attribute of the given feComposite element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/in2)
     */
    val in2: SVGAnimatedString

    /**
     * The **`k1`** read-only property of the SVGFECompositeElement interface reflects the k1 attribute of the given feComposite element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k1)
     */
    val k1: SVGAnimatedNumber

    /**
     * The **`k2`** read-only property of the SVGFECompositeElement interface reflects the k2 attribute of the given feComposite element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k2)
     */
    val k2: SVGAnimatedNumber

    /**
     * The **`k3`** read-only property of the SVGFECompositeElement interface reflects the k3 attribute of the given feComposite element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k3)
     */
    val k3: SVGAnimatedNumber

    /**
     * The **`k4`** read-only property of the SVGFECompositeElement interface reflects the k4 attribute of the given feComposite element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k4)
     */
    val k4: SVGAnimatedNumber

    /**
     * The **`operator`** read-only property of the SVGFECompositeElement interface reflects the operator attribute of the given feComposite element.
     *
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
