// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feConvolveMatrix> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement)
 */
open external class SVGFEConvolveMatrixElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/bias)
     */
    val bias: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/divisor)
     */
    val divisor: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/edgeMode)
     */
    val edgeMode: SVGAnimatedEnumeration<EdgeMode>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/kernelMatrix)
     */
    val kernelMatrix: SVGAnimatedNumberList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/kernelUnitLengthX)
     */
    val kernelUnitLengthX: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/kernelUnitLengthY)
     */
    val kernelUnitLengthY: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/orderX)
     */
    val orderX: SVGAnimatedInteger

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/orderY)
     */
    val orderY: SVGAnimatedInteger

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/preserveAlpha)
     */
    val preserveAlpha: SVGAnimatedBoolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/targetX)
     */
    val targetX: SVGAnimatedInteger

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/targetY)
     */
    val targetY: SVGAnimatedInteger
    val SVG_EDGEMODE_UNKNOWN: EdgeMode
    val SVG_EDGEMODE_DUPLICATE: EdgeMode
    val SVG_EDGEMODE_WRAP: EdgeMode
    val SVG_EDGEMODE_NONE: EdgeMode

    companion object {
        val SVG_EDGEMODE_UNKNOWN: EdgeMode
        val SVG_EDGEMODE_DUPLICATE: EdgeMode
        val SVG_EDGEMODE_WRAP: EdgeMode
        val SVG_EDGEMODE_NONE: EdgeMode
    }

    sealed interface EdgeMode
}
