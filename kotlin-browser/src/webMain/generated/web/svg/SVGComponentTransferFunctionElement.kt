// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGComponentTransferFunctionElement`** interface represents a base interface used by the component transfer function interfaces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement)
 */
open external class SVGComponentTransferFunctionElement
private constructor() :
    SVGElement {
    /**
     * The **`amplitude`** read-only property of the SVGComponentTransferFunctionElement interface reflects the amplitude attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/amplitude)
     */
    val amplitude: SVGAnimatedNumber

    /**
     * The **`exponent`** read-only property of the SVGComponentTransferFunctionElement interface reflects the exponent attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/exponent)
     */
    val exponent: SVGAnimatedNumber

    /**
     * The **`intercept`** read-only property of the SVGComponentTransferFunctionElement interface reflects the intercept attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/intercept)
     */
    val intercept: SVGAnimatedNumber

    /**
     * The **`offset`** read-only property of the SVGComponentTransferFunctionElement interface reflects the offset attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/offset)
     */
    val offset: SVGAnimatedNumber

    /**
     * The **`slope`** read-only property of the SVGComponentTransferFunctionElement interface reflects the slope attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/slope)
     */
    val slope: SVGAnimatedNumber

    /**
     * The **`tableValues`** read-only property of the SVGComponentTransferFunctionElement interface reflects the tableValues attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/tableValues)
     */
    val tableValues: SVGAnimatedNumberList

    /**
     * The **`type`** read-only property of the SVGComponentTransferFunctionElement interface reflects the type attribute of the given element. It takes one of the SVG_FECOMPONENTTRANSFER_TYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/type)
     */
    val type: SVGAnimatedEnumeration<Type>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement#svg_fecomponenttransfer_type_unknown)
         */
        val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement#svg_fecomponenttransfer_type_identity)
         */
        val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement#svg_fecomponenttransfer_type_table)
         */
        val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement#svg_fecomponenttransfer_type_discrete)
         */
        val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement#svg_fecomponenttransfer_type_linear)
         */
        val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Type

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement#svg_fecomponenttransfer_type_gamma)
         */
        val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Type
    }

    sealed /* enum */
    interface Type
}
