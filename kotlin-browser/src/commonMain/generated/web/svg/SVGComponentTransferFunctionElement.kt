// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGComponentTransferFunctionElement`** interface defines a base interface used by the component transfer function interfaces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement)
 */
open external class SVGComponentTransferFunctionElement
private constructor() :
    SVGElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/amplitude)
     */
    val amplitude: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/exponent)
     */
    val exponent: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/intercept)
     */
    val intercept: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/offset)
     */
    val offset: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/slope)
     */
    val slope: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/tableValues)
     */
    val tableValues: SVGAnimatedNumberList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement/type)
     */
    val type: SVGAnimatedEnumeration<Type>
    val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Type
    val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Type
    val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Type
    val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Type
    val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Type
    val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Type

    companion object {
        val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Type
        val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Type
        val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Type
        val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Type
        val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Type
        val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Type
    }

    sealed interface Type
}
