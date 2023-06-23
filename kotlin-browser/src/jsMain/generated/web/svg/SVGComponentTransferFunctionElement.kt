// Automatically generated - do not modify!

package web.svg

/**
 * A base interface used by the component transfer function interfaces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement)
 */
sealed external class SVGComponentTransferFunctionElement :
    SVGElement {
    val amplitude: SVGAnimatedNumber
    val exponent: SVGAnimatedNumber
    val intercept: SVGAnimatedNumber
    val offset: SVGAnimatedNumber
    val slope: SVGAnimatedNumber
    val tableValues: SVGAnimatedNumberList
    val type: SVGAnimatedEnumeration
    val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Short
    val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Short
    val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Short
    val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Short
    val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Short
    val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Short

    companion object {
        val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Short
        val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Short
        val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Short
        val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Short
        val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Short
        val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Short
    }
}
