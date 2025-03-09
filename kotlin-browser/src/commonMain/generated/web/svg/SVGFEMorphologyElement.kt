// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feMorphology> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement)
 */
open external class SVGFEMorphologyElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/operator)
     */
    val operator: SVGAnimatedEnumeration<Operator>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/radiusX)
     */
    val radiusX: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/radiusY)
     */
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
