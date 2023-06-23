// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feConvolveMatrix> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement)
 */
sealed external class SVGFEConvolveMatrixElement :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val bias: SVGAnimatedNumber
    val divisor: SVGAnimatedNumber
    val edgeMode: SVGAnimatedEnumeration
    val in1: SVGAnimatedString
    val kernelMatrix: SVGAnimatedNumberList
    val kernelUnitLengthX: SVGAnimatedNumber
    val kernelUnitLengthY: SVGAnimatedNumber
    val orderX: SVGAnimatedInteger
    val orderY: SVGAnimatedInteger
    val preserveAlpha: SVGAnimatedBoolean
    val targetX: SVGAnimatedInteger
    val targetY: SVGAnimatedInteger
    val SVG_EDGEMODE_UNKNOWN: Short
    val SVG_EDGEMODE_DUPLICATE: Short
    val SVG_EDGEMODE_WRAP: Short
    val SVG_EDGEMODE_NONE: Short

    companion object {
        val SVG_EDGEMODE_UNKNOWN: Short
        val SVG_EDGEMODE_DUPLICATE: Short
        val SVG_EDGEMODE_WRAP: Short
        val SVG_EDGEMODE_NONE: Short
    }
}
