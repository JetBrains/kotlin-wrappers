// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFECompositeElement`** interface corresponds to the <feComposite> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement)
 */
open external class SVGFECompositeElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFECompositeElement interface reflects the in attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`in2`** read-only property of the SVGFECompositeElement interface reflects the in2 attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/in2)
     */
    val in2: SVGAnimatedString

    /**
     * The **`k1`** read-only property of the SVGFECompositeElement interface reflects the k1 attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k1)
     */
    val k1: SVGAnimatedNumber

    /**
     * The **`k2`** read-only property of the SVGFECompositeElement interface reflects the k2 attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k2)
     */
    val k2: SVGAnimatedNumber

    /**
     * The **`k3`** read-only property of the SVGFECompositeElement interface reflects the k3 attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k3)
     */
    val k3: SVGAnimatedNumber

    /**
     * The **`k4`** read-only property of the SVGFECompositeElement interface reflects the k4 attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/k4)
     */
    val k4: SVGAnimatedNumber

    /**
     * The **`operator`** read-only property of the SVGFECompositeElement interface reflects the operator attribute of the given <feComposite> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement/operator)
     */
    val operator: SVGAnimatedEnumeration<Operator>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_unknown)
         */
        val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Operator

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_over)
         */
        val SVG_FECOMPOSITE_OPERATOR_OVER: Operator

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_in)
         */
        val SVG_FECOMPOSITE_OPERATOR_IN: Operator

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_out)
         */
        val SVG_FECOMPOSITE_OPERATOR_OUT: Operator

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_atop)
         */
        val SVG_FECOMPOSITE_OPERATOR_ATOP: Operator

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_xor)
         */
        val SVG_FECOMPOSITE_OPERATOR_XOR: Operator

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFECompositeElement#svg_fecomposite_operator_arithmetic)
         */
        val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Operator
    }

    sealed /* enum */
    interface Operator
}
