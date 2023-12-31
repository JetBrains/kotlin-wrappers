// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feMorphology> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement)
 */
sealed external class SVGFEMorphologyElement :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val operator: SVGAnimatedEnumeration<Operator>
    val radiusX: SVGAnimatedNumber
    val radiusY: SVGAnimatedNumber
    val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Operator
    val SVG_MORPHOLOGY_OPERATOR_ERODE: Operator
    val SVG_MORPHOLOGY_OPERATOR_DILATE: Operator

    companion object {
        val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Operator
        val SVG_MORPHOLOGY_OPERATOR_ERODE: Operator
        val SVG_MORPHOLOGY_OPERATOR_DILATE: Operator
    }

    sealed interface Operator
}
