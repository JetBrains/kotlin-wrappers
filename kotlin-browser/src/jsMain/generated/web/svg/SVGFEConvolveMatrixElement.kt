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
    val bias: SVGAnimatedNumber
    val divisor: SVGAnimatedNumber
    val edgeMode: SVGAnimatedEnumeration<EdgeMode>
    val in1: SVGAnimatedString
    val kernelMatrix: SVGAnimatedNumberList
    val kernelUnitLengthX: SVGAnimatedNumber
    val kernelUnitLengthY: SVGAnimatedNumber
    val orderX: SVGAnimatedInteger
    val orderY: SVGAnimatedInteger
    val preserveAlpha: SVGAnimatedBoolean
    val targetX: SVGAnimatedInteger
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
