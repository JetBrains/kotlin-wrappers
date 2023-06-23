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
    val operator: SVGAnimatedEnumeration
    val radiusX: SVGAnimatedNumber
    val radiusY: SVGAnimatedNumber
    val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Short
    val SVG_MORPHOLOGY_OPERATOR_ERODE: Short
    val SVG_MORPHOLOGY_OPERATOR_DILATE: Short

    companion object {
        val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Short
        val SVG_MORPHOLOGY_OPERATOR_ERODE: Short
        val SVG_MORPHOLOGY_OPERATOR_DILATE: Short
    }
}
